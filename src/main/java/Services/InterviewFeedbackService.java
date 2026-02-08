package Services;

import Models.InterviewFeedback;
import Utils.MyDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InterviewFeedbackService {

    private static final Connection cnx =
            MyDatabase.getInstance().getConnection();

    public static void addFeedback(InterviewFeedback f) {
        String sql = "INSERT INTO interview_feedback(interview_id, recruiter_id, technical_score, communication_score, culture_fit_score, overall_score, decision, comment) VALUES (?,?,?,?,?,?,?,?)";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, f.getInterviewId());
            ps.setInt(2, f.getRecruiterId());
            ps.setInt(3, f.getTechnicalScore());
            ps.setInt(4, f.getCommunicationScore());
            ps.setInt(5, f.getCultureFitScore());
            ps.setInt(6, f.getOverallScore());
            ps.setString(7, f.getDecision());
            ps.setString(8, f.getComment());
            ps.executeUpdate();
            System.out.println("Feedback added");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateFeedback(int id, InterviewFeedback f) {
        String sql = "UPDATE interview_feedback SET interview_id=?, recruiter_id=?, technical_score=?, communication_score=?, culture_fit_score=?, overall_score=?, decision=?, comment=? WHERE id=?";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, f.getInterviewId());
            ps.setInt(2, f.getRecruiterId());
            ps.setInt(3, f.getTechnicalScore());
            ps.setInt(4, f.getCommunicationScore());
            ps.setInt(5, f.getCultureFitScore());
            ps.setInt(6, f.getOverallScore());
            ps.setString(7, f.getDecision());
            ps.setString(8, f.getComment());
            ps.setInt(9, id);
            ps.executeUpdate();
            System.out.println("Feedback updated");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFeedback(int id) {
        String sql = "DELETE FROM interview_feedback WHERE id=?";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Feedback deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
