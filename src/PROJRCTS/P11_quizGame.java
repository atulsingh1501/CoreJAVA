package PROJRCTS;

import java.util.Scanner;

public class P11_quizGame {
    static void main() {
        String []questions = {"A. what is the main function of router? ",
                "B. which part of the computer is considered the brain?",
                "C.what year was facebook launched?",
                "D.who is known as the father of computer",
                "E.what was the first programming language?"};

        String [][]options = {{"1. storing files", "2. Encrypting data", "3. directing internet traffic", "4. managing passwords"},
                {"1. CPU", "2. Hard Drive","3. RAM","4. GPU"},
                {"1. 2000", "2. 2004 ", "3. 2006", "4. 2008"},
                {"1. steve jobs ", "2. Bill gates", "3. Alan Turing", "4. charles babbege"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"},};
        int [] answer = {3,1,2,4,3};

        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("Welcome to Quiz game");
        System.out.println("*********************");

        int guess;
        int score = 0;

        for(int i = 0; i< questions.length;i++){
            System.out.println(questions[i]);
//            for(String option : options[i]){
//                System.out.println(option);
//            }
            for(int j = 0; j < options[i].length; j++){
                System.out.println(options[i][j]);
            }
            System.out.print("Enter the correct Option: ");
            guess = scanner.nextInt();
            if(guess == answer[i]){
                System.out.println("*************");
                System.out.println("correct option");
                System.out.println("*************");
                score++;
            }else{
                System.out.println("*************");
                System.out.println("wrong option");
                System.out.println("*************");
            }
        }
        System.out.println("your total score is: " + score);

    }
}
