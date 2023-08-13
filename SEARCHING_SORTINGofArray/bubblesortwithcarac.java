package SEARCHING_SORTINGofArray;

import java.util.*;

public class bubblesortwithcarac {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size = sc.nextInt();
        char arr[] = new char[size];
        System.out.println("ENTER THE CHARACTERS INTO THE ARRAY");
        for (int i = 0; i < size; i++)
            arr[i] = sc.next().charAt(0);
        sc.close();
        System.out.println("BEFORE SORTING");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ",");

        for (int j = 0; j < size; j++)
            for (int i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    char a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        System.out.println("\n AFTER SORTING");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ",");

    }

}
