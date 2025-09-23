import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        freq_of_elements(arr);
    }
    public static void freq_of_elements(int[] arr){
        int i,j;
        int count;
        int n = arr.length;
        for(i=0;i<n;i++){
            if(arr[i]==-1){
                continue;
            }
            count=1;
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
}
