package Models;

import java.time.LocalDateTime;

public class InterviewRescheduleRequest {

    private int id;
    private int interviewId;
    private int candidateId;
    private LocalDateTime requestedDateTime;
    private String reason;
    private String status;

    public InterviewRescheduleRequest() {}

    public InterviewRescheduleRequest(int interviewId, int candidateId,
                                      LocalDateTime requestedDateTime, String reason) {
        this.interviewId = interviewId;
        this.candidateId = candidateId;
        this.requestedDateTime = requestedDateTime;
        this.reason = reason;
        this.status = "PENDING";
    }

    public int getInterviewId() { return interviewId; }
    public int getCandidateId() { return candidateId; }
    public LocalDateTime getRequestedDateTime() { return requestedDateTime; }
    public String getReason() { return reason; }
    public String getStatus() { return status; }
}
