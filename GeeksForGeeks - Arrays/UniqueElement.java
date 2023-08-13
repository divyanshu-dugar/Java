package GeeksForGeeks;

public class UniqueElement {
    public static void main(String args[]){
        int arr[] = {2,2,4,4,6,6,7,8,8};
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if(c==1){
                System.out.println(arr[i]);
            }
        }
    }
}
