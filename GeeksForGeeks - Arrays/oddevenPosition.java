package GeeksForGeeks;
import java.util.*;
public class oddevenPosition {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 2, 5 };
        Arrays.sort(arr);
        int ans[] = new int[arr.length], s = 0, e = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                ans[i] = arr[e--];
            } else {
                ans[i] = arr[s++];
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i] + ",");
        }
    }
}
