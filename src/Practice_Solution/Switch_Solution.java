package Practice_Solution;

import java.util.Scanner;

public class Switch_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Floor");
        int floor = sc.nextInt();
        switch (floor)
        {
            case 1:
                System.out.println("Lift is on 1st Floor");
                break;
            case 2:
                System.out.println("Lift is on 2nd Floor");
                break;

            case 3:
                System.out.println("Lift is on 3rd Floor");
                break;
            case 4:
                System.out.println("Lift is on 4th Floor");
                break;
            case 5:
                System.out.println("Lift is on 5th Floor");
                break;
            case 6:
                System.out.println("Lift is on 6th Floor");
                break;

            case 7:
                System.out.println("Lift is on 7th Floor");
                break;

            default:
                System.out.println("Invalid");

        }

    }
}
