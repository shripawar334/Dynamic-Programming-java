import java.util.*;

public class stair{
    
    static int count_way(int n){  // basic recursion code-method-1
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return count_way(n-1)+count_way(n-2);
    }

    static int count_way_memoization(int n,int arr[]){  // efficient code than basic code-method-2
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return count_way(n-1)+count_way(n-2);
    }
    static int count_way_tabulation(int n,int arr[]){  // efficient code than basic code-method-3
       arr[0]=1;
       arr[1]=1;
       for(int i=2;i<arr.length;i++){
        arr[i]=arr[i-1]+arr[i-2];
       }
       return arr[n];
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        System.out.println(count_way_tabulation(n, arr));
    }
}