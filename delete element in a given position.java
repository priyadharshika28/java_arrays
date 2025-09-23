import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int[] res = deleteelement(arr,pos);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static int[] deleteelement(int[] arr,int pos){
        int n = arr.length;
        if(pos<0 || pos>n){
            System.out.println("Invalid pos");
            return arr;
        }
        for(int i=pos-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        int[] newarr = new int[n];
        for(int i=0;i<n;i++){
            newarr[i] = arr[i];
        }
        return newarr;
    }
}
