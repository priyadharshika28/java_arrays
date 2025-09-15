import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = removeduplicates(arr);
        System.out.println(Arrays.toString(res)); // print as a list
    }
    public static int[] removeduplicates(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n-1;k++){
                        arr[k] = arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(arr,n);
    }
}
