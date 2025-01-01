package org.learn;

public class Main {

    public static void main(String[] args) {
        Question q1 = new Question("In which year were the first modern Olympic Games held?", new String[]{"1896", "1900", "1924", "1932"}, 1);
        Question q2 = new Question("Who has won the most Olympic gold medals?", new String[]{"Michael Phelps", "Usain Bolt", "Larisa Latynina", "Paavo Nurmi"}, 1);
        Question q3 = new Question("Which city hosted the 2008 Summer Olympics?", new String[]{"Beijing", "London", "Sydney", "Athens"}, 1);
        Question q4 = new Question("In which sport did the USA win the most Olympic gold medals in 2020?", new String[]{"Swimming", "Gymnastics", "Basketball", "Track and Field"}, 1);
        Question q5 = new Question("Who is the youngest Olympic gold medalist in history?", new String[]{"Marjorie Gestring", "Nadia Comăneci", "Michaela DePrince", "Cathy Freeman"}, 1);

        Question q6 = new Question("Which country has won the most Olympic medals in history?", new String[]{"United States", "Germany", "Russia", "China"}, 1);
        Question q7 = new Question("Which Olympic event features a pentathlon?", new String[]{"Athletics", "Swimming", "Equestrian", "Modern Pentathlon"}, 4);
        Question q8 = new Question("Which country was the first to host the Winter Olympics?", new String[]{"France", "Switzerland", "Norway", "United States"}, 3);
        Question q9 = new Question("Which Olympian is known for his legendary rivalry with Carl Lewis?", new String[]{"Michael Johnson", "Ben Johnson", "Usain Bolt", "Merlene Ottey"}, 2);
        Question q10 = new Question("The Olympic motto 'Citius, Altius, Fortius' is in which language?", new String[]{"Latin", "Greek", "French", "English"}, 1);


        Question[] questions = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10};


        Quiz quiz = new Quiz(questions);


        quiz.startQuiz();
    }
}
