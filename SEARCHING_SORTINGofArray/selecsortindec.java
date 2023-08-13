package SEARCHING_SORTINGofArray;

import java.util.*;

public class selecsortindec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("ENTER THE NUMBERS INTO THE ARRAY");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print(" BEFORE SORTING ");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i] + ",");

        for (int i = 0; i < size; i++) {
            int max = arr[i];
            int maxindex = i;
            for (int j = i; j < size; j++) {
                if (arr[j] > max)
                {
                    max = arr[j];
                maxindex = j;
                }
            }
            if (arr[i] < arr[maxindex]) {
                int a = arr[i];
                arr[i] = arr[maxindex];
                arr[maxindex] = a;
            }
        }
        System.out.println("AFTER SORTING");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ",");

        sc.close();
    }

}
