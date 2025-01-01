package org.learn;

import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Quiz {
    private Question[] questions;
    private int score;
    private int currentQuestionIndex;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
        this.currentQuestionIndex = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        AtomicBoolean answered = new AtomicBoolean(false);

        while (currentQuestionIndex < questions.length) {
            Question currentQuestion = questions[currentQuestionIndex];
            System.out.println("\nQuestion: " + currentQuestion.getQuestionText());

            String[] options = currentQuestion.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }


            TimerTaskRunnable timerTaskRunnable = new TimerTaskRunnable(answered, currentQuestionIndex);
            ScheduledFuture<?> future = scheduler.schedule(timerTaskRunnable, 10, TimeUnit.SECONDS);

            System.out.print("\nEnter your answer (1-4): ");
            int answer = scanner.nextInt();
            answered.set(true);

            if (answer == currentQuestion.getCorrectAnswerIndex()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + currentQuestion.getOptions()[currentQuestion.getCorrectAnswerIndex() - 1]);
            }

            currentQuestionIndex++;
            future.cancel(true); // Cancel the timer after answering the question
        }

        showResult();
        scheduler.shutdown(); // Shut down the scheduler after the quiz ends
    }

    public void showResult() {
        System.out.println("\nQuiz Over!");
        System.out.println("Your final score is: " + score + " out of " + questions.length);
    }
}
