import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        int[][] res = multiplymatrix(mat1,mat2);
        printdetails(res);
        
    }
    public static int[][] multiplymatrix(int[][] a,int[][] b){
        int row = a.length;
        int col = a[0].length;
        int[][] res = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j] = a[i][j]*b[i][j];
            }
        }
        return res;
    }
    public static void printdetails(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
