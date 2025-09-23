import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int peak = secondpeakelements(arr);
        if(peak==-1){
            System.out.println("no peak elements");
        }
        else{
            System.out.println(peak);
        }
    }
    public static int secondpeakelements(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if((i==0||arr[i]>arr[i-1]) && (i==n-1 || arr[i]>arr[i+1])){
                count++;
                if(count==2){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
