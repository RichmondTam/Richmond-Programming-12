import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String q1 = "1+1?\n"
                + "(a)2 (b)4";
        String q2 ="2+2?\n"
                +"(a)4 (b)6";
        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2,"a" )
        };
        runTest(questions);


    }

    public static void runTest(Question[] questions) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("What is the answer of")
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].quiz);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].answer)) {
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong");
            }


        }
    }
}
