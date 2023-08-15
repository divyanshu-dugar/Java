package GeeksForGeeks;

public class subArraySum {
    public static void main(String args[]) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int currSum = 0, resSum = 5;
        for (int i = 0; i < arr.length; i++) {
            currSum = arr[i];

            if (currSum == resSum) {
                System.out.println("Sum found at position " + i);
                return;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    currSum += arr[j];

                    if (currSum == resSum) {
                        System.out.println("Sum Found at Positions: " + i + " " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("Sum Not Found");

    }
}
