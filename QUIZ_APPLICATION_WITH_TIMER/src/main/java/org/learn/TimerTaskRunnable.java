package org.learn;

import java.util.concurrent.atomic.AtomicBoolean;

public class TimerTaskRunnable implements Runnable {
    private AtomicBoolean answered;
    private int currentQuestionIndex;

    public TimerTaskRunnable(AtomicBoolean answered, int currentQuestionIndex) {
        this.answered = answered;
        this.currentQuestionIndex = currentQuestionIndex;
    }

    @Override
    public void run() {
        if (!answered.get()) {
            System.out.println("\nTime's up! Moving to next question.");
            answered.set(true);
        }
    }
}

