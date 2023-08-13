package SEARCHING_SORTINGofArray;

import java.util.*;

public class selectionsortinasc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("ENTER " + size + " NUMBERS INTO THE ARRAY");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println(" BEFORE SORTING : ");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i] + ",");

        for (int i = 0; i < size; i++) {
            int min = arr[i];
            int minindex = i;
            for (int j = i; j < size; j++) {
                if (arr[j] < min)
                    
                {
                    min = arr[j];
                    minindex = j;
                }
            }
        

        if (arr[i] > arr[minindex]) {
            int a = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = a;
        }
    }

        System.out.println("AFTER SORTING");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ",");
        sc.close();
    }

}
