import java.util.Scanner;

public class OverLoading {
    void sum(int a, int b)
    {
        int sum=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+ sum);
    }
    void sum(double a, double b)
    {
        double sum=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+ sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        OverLoading obj=new OverLoading();
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        obj.sum(a, b);
        System.out.print("Enter the first number : ");
        double c=sc.nextDouble();
        System.out.print("Enter the second number : ");
        double d=sc.nextDouble();
        obj.sum(c, d);
        sc.close();
    }
}
