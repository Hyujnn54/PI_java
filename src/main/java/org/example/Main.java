package org.example;

import Models.*;
import Services.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Interview interview = new Interview(
                1, 1,
                LocalDateTime.now().plusDays(1),
                30,
                "ONLINE"
        );
        InterviewService.addInterview(interview);

        InterviewService.getAll()
                .forEach(i -> System.out.println(i.getId() + " " + i.getStatus()));

        InterviewFeedback feedback = new InterviewFeedback(
                1, 1, 15, 16, 17,
                "ACCEPTED", "Good profile"
        );
        InterviewFeedbackService.addFeedback(feedback);

        InterviewRescheduleRequest req = new InterviewRescheduleRequest(
                1, 1,
                LocalDateTime.now().plusDays(2),
                "Not available"
        );
        InterviewRescheduleService.addRequest(req);
    }
}