package Models;

public class InterviewFeedback {

    private int id;
    private int interviewId;
    private int recruiterId;
    private int technicalScore;
    private int communicationScore;
    private int cultureFitScore;
    private int overallScore;
    private String decision;
    private String comment;

    public InterviewFeedback() {}

    public InterviewFeedback(int interviewId, int recruiterId,
                             int technicalScore, int communicationScore,
                             int cultureFitScore, String decision, String comment) {
        this.interviewId = interviewId;
        this.recruiterId = recruiterId;
        this.technicalScore = technicalScore;
        this.communicationScore = communicationScore;
        this.cultureFitScore = cultureFitScore;
        this.overallScore = (technicalScore + communicationScore + cultureFitScore) / 3;
        this.decision = decision;
        this.comment = comment;
    }

    // Getters & Setters
    public int getInterviewId() { return interviewId; }
    public int getRecruiterId() { return recruiterId; }
    public int getTechnicalScore() { return technicalScore; }
    public int getCommunicationScore() { return communicationScore; }
    public int getCultureFitScore() { return cultureFitScore; }
    public int getOverallScore() { return overallScore; }
    public String getDecision() { return decision; }
    public String getComment() { return comment; }
}
