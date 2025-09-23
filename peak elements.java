import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = peakelements(arr);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static ArrayList<Integer> peakelements(int[] arr){
        ArrayList<Integer> peak = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if((i==0||arr[i]>arr[i-1]) && (i==n-1 || arr[i]>arr[i+1])){
                peak.add(arr[i]);
            }
        }
        return peak;
    }
}
