

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String options, Quiz;
        int a, b, marks = 0;
        System.out.println("-----------------------------");
        System.out.println("******* WELCOME TO QUIZ*******");
        System.out.println("-----------------------------");
        System.out.println("Do you want to play the Quiz:");
        Quiz = sc.next();
        if (Quiz.equalsIgnoreCase("yes")) {
            System.out.println("QUESTION 1:");
            System.out.println("Who is the best captain in the IPL");
            System.out.println("1.Rohit\n2.Dhoni\n3.Virat\n4.Hardik");
            a = sc.nextInt();
            if (a == 2) {
                marks = 5;
                System.out.println("Marks Secured:" + marks);
                System.out.println("Correct!!!!");
            } else {

                System.out.println("Marks Secured:" + marks);
                System.out.println("Wrong!!!!");
            }

            System.out.println("QUESTION 2:");
            System.out.println("Who is called as MR.IPL");
            System.out.println("1.Virat\n2.Rohit\n3.Raina\n4.Gill");
            a = sc.nextInt();
            if (a == 3) {
                marks += 5;
                System.out.println("Marks Secured:" + marks);
                System.out.println("Correct!!!)");

            } else {
                System.out.println("Marks Secured:" + marks);
                System.out.println("Wrong!!!!");
            }
            System.out.println("QUESTION 2:");
            System.out.println("Who is world's Best Allrounder");
            System.out.println("1.Ben stokes\n2.Moeen Ali\n3.Hardik\n4.Jadeja");
            a = sc.nextInt();
            if ( a==4 ){
                marks +=5;
                 System.out.println("Marks Secured:" + marks);
                System.out.println("Correct!!!)");
                
            
            }else {
                System.out.println("Marks Secured:" + marks);
                System.out.println("Wrong!!!!");
            
            
            }
        } else {
            System.out.println("bye");
            System.out.println("Better Luck next time");

        }
    }

}
