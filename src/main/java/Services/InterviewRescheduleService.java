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

    public static void updateRequest(int id, InterviewRescheduleRequest r) {
        String sql = "UPDATE interview_reschedule_request SET interview_id=?, candidate_id=?, requested_datetime=?, reason=?, status=? WHERE id=?";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, r.getInterviewId());
            ps.setInt(2, r.getCandidateId());
            ps.setTimestamp(3, java.sql.Timestamp.valueOf(r.getRequestedDateTime()));
            ps.setString(4, r.getReason());
            ps.setString(5, r.getStatus());
            ps.setInt(6, id);
            ps.executeUpdate();
            System.out.println("Reschedule request updated");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteRequest(int id) {
        String sql = "DELETE FROM interview_reschedule_request WHERE id=?";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Reschedule request deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
