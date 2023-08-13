import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " numbers into the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the number to be searched: ");
        int key = sc.nextInt();
        for (int i = 0; i < size; i++)
            if (arr[i] == key)
                flag = true;
        if (flag == true)
            System.out.println("Found");
        else
            System.out.println("Not Found");
        sc.close();
    }
}
