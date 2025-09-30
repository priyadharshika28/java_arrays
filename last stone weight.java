import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = laststoneweight(arr);
        System.out.println(res);
    }
    public static int laststoneweight(int[] arr){
        int n = arr.length;
        while(true){
            int m1 = -1;
            int m2 = -1;
            int i1 = -1;
            int i2 = -1;
            for(int i=0;i<n;i++){
                if(arr[i]>m1){
                    m2 = m1;i2=i1;
                    m1 = arr[i];i1=i;
                }
                else if(arr[i]>m2){
                    m2 = arr[i];
                    i2=i;
                }
            }
            if(m1==0) return 0;
            if(m2==0) return m1;
            arr[i1] = m1-m2;
            arr[i2] = 0;    
        }
    }
}
