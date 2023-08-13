package GeeksForGeeks;

public class SegEvenAndOddNum {
    public static void main(String args[]){
        int arr[] = {3, 1, 5, 7, 8, 2, 4, 6};
        int i=-1, j=0;
        while(j < arr.length){
            if(arr[j] % 2 == 0){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        for(int I=0;I<arr.length;I++){
            System.out.print(arr[I] + " ");
        }
    }
}
