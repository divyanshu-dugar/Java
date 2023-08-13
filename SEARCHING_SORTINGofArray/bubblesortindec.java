package SEARCHING_SORTINGofArray;

import java.util.*;

public class bubblesortindec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("ENTER" +size+ "NUMBERS INTO THE ARRAY");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        sc.close();

        System.out.print("BEFORE SORTING");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i] + ",");

        for (int j = 0; j < size; j++)
            for (int i = 0; i < size - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        System.out.println("AFTER SORTING");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ",");

    }

}
