import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = countduplicates(arr);
        System.out.println(res);
    }
    public static int countduplicates(int[] arr){
        int n = arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
