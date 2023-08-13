package SEARCHING_SORTINGofArray;

import java.util.*;

public class binarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size = sc.nextInt();
        char arr[] = new char[size];
        System.out.println("ENTER THE CHARACTERS INTO THE ARRAY");
        for (int i = 0; i < size; i++)
            arr[i] = sc.next().charAt(0);

        for (int j = 0; j < size; j++)
            for (int i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    char a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        System.out.println("ENTER THE KEY ELEMENT");
        char key = sc.next().charAt(0);

        boolean found = false;
        int lb = 0, ub = size - 1;
        while (lb < ub) {
            int mid = (lb + ub) / 2;
            if (arr[mid] > key)
                ub = mid - 1;
            else if (arr[mid] < key)
                lb = mid + 1;
            else if (arr[mid] == key) {
                found = true;
                break;
            }
            sc.close();
        }
        if (found)
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");

    }
}
