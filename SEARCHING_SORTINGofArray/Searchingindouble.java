package SEARCHING_SORTINGofArray;

import java.util.Scanner;

public class Searchingindouble {
    public static void main(String args[]) {
        boolean flag = false;
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        double arr[] = new double[size];
        System.out.println("Enter " + size + " numbers into the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextDouble();
        System.out.println("Enter the number to be searched: ");
        double key = sc.nextDouble();
        for (int i = 0; i < size; i++)
            if (arr[i] == key)
            {
                flag = true;
                index=i;
            }
        if (flag == true)
            System.out.println("Found at place "+(index+1));
        else
            System.out.println("Not Found");
        sc.close();
    }
}
