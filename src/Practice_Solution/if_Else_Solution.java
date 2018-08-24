package Practice_Solution;

import java.util.Scanner;

public class if_Else_Solution {
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Age");
        age = sc.nextInt();
        if(age>13)
        {
            System.out.println("Welcome "+ name);
        }else
        {
            System.out.println("Age Restriction Not Allowed");
        }


    }
}
