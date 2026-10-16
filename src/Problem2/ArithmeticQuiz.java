package Problem2;

import java.util.Scanner;
import java.lang.Character;
public class ArithmeticQuiz {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of questions in the quiz:");
        int n = scan.nextInt();
        if (n<=0){
            System.out.println("NaN");
        }
        int[] correctAns = new int[n];
        System.out.println("Enter correct answers:");
        for (int i=0; i<n; i++){
            correctAns[i] = scan.nextInt();
        }
        char answer = 'y';
        do{
            System.out.println("Enter the answers to be graded:");
            int score = 0;
            for (int i=0; i<n; i++){
                int x = scan.nextInt();
                if (x==correctAns[i]){
                    score++;
                }
            }

            double percentCorrect = score / (double) n *100;

            System.out.println(String.format("The number of correct answers: %d", score));
            System.out.println(String.format("The final grade is : %.2f", percentCorrect));

            System.out.println("Grade another quiz? (y/n)");
            answer = Character.toLowerCase(scan.next().charAt(0));
        } while (answer=='y');
    }
}
