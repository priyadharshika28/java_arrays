import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> res = uniqueelements(arr);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static HashSet<Integer> uniqueelements(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        for(int num:arr){
            if(!set.add(num)){
                dup.add(num);
            }
        }
        set.removeAll(dup);
        return set;
    }
}
