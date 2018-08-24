package Excercise;

import java.util.Scanner;

//Greet User with his/Her name
public class ex_1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String greet_message = "Hey! Welcome Back";
        String name;
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println(greet_message+"\t"+name);

    }

}
