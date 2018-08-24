package Practice_Solution;


public class Methods_Solution {

    public static int avg(int arr[])
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum= sum+arr[i];
        }
        return sum/arr.length;
    }


    public static void main(String[] args)
    {
        int x[] = {100,100};
        System.out.println(avg(x));
        int y[] = {50,60,70};
        System.out.println(avg(y));
    }
}
