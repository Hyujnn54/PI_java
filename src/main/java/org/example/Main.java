package org.example;

import Models.*;
import Services.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // ============== INTERVIEW CRUD OPERATIONS ==============

        // CREATE - Add Interview
        /*
        Interview interview = new Interview(
                1, 1,
                LocalDateTime.now().plusDays(1),
                30,
                "ONLINE"
        );
        InterviewService.addInterview(interview);
        */

        // READ - Get all interviews
        /*
        InterviewService.getAll()
                .forEach(i -> System.out.println(i.getId() + " " + i.getStatus()));
        */

        // UPDATE - Update interview details
        /*
        Interview updateInterview = new Interview(
                1, 1,
                LocalDateTime.now().plusDays(2),
                45,
                "IN_PERSON"
        );
        updateInterview.setStatus("SCHEDULED");
        InterviewService.updateInterview(1, updateInterview);
        */

        // APPROVE RESCHEDULE - Recruiter approves reschedule request
        /*
        InterviewService.approveRescheduleRequest(1, LocalDateTime.now().plusDays(3));
        */

        // REJECT RESCHEDULE - Recruiter rejects reschedule request
        /*
        InterviewService.rejectRescheduleRequest(1);
        */

        // DELETE - Delete interview
        /*
        InterviewService.delete(1);
        */


        // ============== INTERVIEW FEEDBACK CRUD OPERATIONS ==============

        // CREATE - Add feedback
        /*
        InterviewFeedback feedback = new InterviewFeedback(
                1, 1, 15, 16, 17,
                "ACCEPTED", "Good profile"
        );
        InterviewFeedbackService.addFeedback(feedback);
        */

        // UPDATE - Update feedback
        /*
        InterviewFeedback updateFeedback = new InterviewFeedback(
                1, 1, 18, 19, 20,
                "ACCEPTED", "Excellent candidate"
        );
        InterviewFeedbackService.updateFeedback(1, updateFeedback);
        */

        // DELETE - Delete feedback
        /*
        InterviewFeedbackService.deleteFeedback(1);
        */


        // ============== INTERVIEW RESCHEDULE REQUEST CRUD OPERATIONS ==============

        // CREATE - Add reschedule request
        /*
        InterviewRescheduleRequest req = new InterviewRescheduleRequest(
                1, 1,
                LocalDateTime.now().plusDays(2),
                "Not available"
        );
        InterviewRescheduleService.addRequest(req);
        */

        // UPDATE - Update reschedule request
        /*
        InterviewRescheduleRequest updateReq = new InterviewRescheduleRequest(
                1, 1,
                LocalDateTime.now().plusDays(3),
                "Family emergency"
        );
        updateReq.setStatus("PENDING");
        InterviewRescheduleService.updateRequest(1, updateReq);
        */

        // DELETE - Delete reschedule request
        /*
        InterviewRescheduleService.deleteRequest(1);
        */

    }
}