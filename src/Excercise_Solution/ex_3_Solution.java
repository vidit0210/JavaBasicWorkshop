package Excercise_Solution;

import java.util.Scanner;

public class ex_3_Solution {
    public  static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String str=sc.next();
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }

        }

        if(numberFlag && capitalFlag && lowerCaseFlag)
        {
            System.out.println("Valid Password");
        }else {
            System.out.println("PLease Make Sure You have UUper Case,Lower Case and number");
        }


    }
}
