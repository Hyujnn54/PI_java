package Services;

import Models.InterviewRescheduleRequest;
import Utils.MyDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InterviewRescheduleService {

    private static final Connection cnx =
            MyDatabase.getInstance().getConnection();

    public static void addRequest(InterviewRescheduleRequest r) {
        String sql = "INSERT INTO interview_reschedule_request(interview_id, candidate_id, requested_datetime, reason, status) VALUES (?,?,?,?,?)";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, r.getInterviewId());
            ps.setInt(2, r.getCandidateId());
            ps.setTimestamp(3, java.sql.Timestamp.valueOf(r.getRequestedDateTime()));
            ps.setString(4, r.getReason());
            ps.setString(5, r.getStatus());
            ps.executeUpdate();
            System.out.println("Reschedule request sent");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
