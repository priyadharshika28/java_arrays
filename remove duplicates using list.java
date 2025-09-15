import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> res = removeduplicates(arr);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static List<Integer> removeduplicates(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int num:arr){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}
