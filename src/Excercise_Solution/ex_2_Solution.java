package Excercise_Solution;

import java.util.Scanner;

public class ex_2_Solution {

    public static void main(String[] args) {
        int participation, knowledge, accuracy, attendace;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in Participation 1-5");
        participation = sc.nextInt();
        System.out.println("Enter Marks in Knowledge 1-5");
        knowledge = sc.nextInt();
        System.out.println("Enter Marks in Accuracy 1-5");
        accuracy = sc.nextInt();
        System.out.println("Enter Marks in Attendance 1-5");
        attendace = sc.nextInt();

        int sum = participation + knowledge + accuracy + attendace;
        if (sum <= 9) {
            System.out.print("Your Grade is : D \n Redo the Pracs");
        } else if (sum > 9 && sum <= 13) {
            System.out.println("Your Grade is : C ");

        } else if (sum > 13 && sum <= 17) {
            System.out.println("Your Grade is : B");
        } else {
            System.out.println("Your Grade is : A ");
        }
    }
}