package Practice_Solution;

import java.util.Scanner;

public class if_Else_if_Solution {
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter Num 1 :");
        num1 = sc.nextInt();
        System.out.println("Enter Num 2 :");
        num2=sc.nextInt();
        System.out.println("Enter Num 3 :");
        num3 =sc.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("Num1 is Greater"+num1);
        }else if (num2>num1 && num2>num3)
        {
            System.out.println("Num 2 is Greater");
        }else
        {
            System.out.println("Num3 is Greater");
        }
    }

}
