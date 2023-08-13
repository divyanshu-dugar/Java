package GeeksForGeeks;

public class largestThreeDistinct {
    public static void main(String args[]) {
        int arr[] = { 10, 4, 3, 50, 23, 90 };
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }
        System.out.print("Largest Three Numbers are: " + first + "," + second + "," + third);
    }
}
