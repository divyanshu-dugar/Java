package GeeksForGeeks;

import java.util.Arrays;

public class maxMin {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 5, 4, 3, 2, 1 };
        Arrays.sort(arr);
        int min = 0, max = arr.length - 1;
        int temp[] = new int[arr.length];
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (flag) {
                temp[i] = arr[max--];
            } else {
                temp[i] = arr[min++];
            }
            flag = !flag;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        printArr(arr);
    }
}
