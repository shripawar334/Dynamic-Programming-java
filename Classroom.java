public class Classroom{
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+ fibo(n-2);
    }
    static int fibo_dp(int n,int[]arr){  // this is called memoization
        if(n==0 || n==1){
            return n;                   //memoization=using recursion and storing the                           solutions of subproblems
        }
        if(arr[n]!=0){
            return arr[n];
        }
        return fibo_dp(n-1, arr)+fibo_dp(n-2, arr);
    }

    static int fibo_tabulation(int n,int[]arr){
        arr[0]=0;
        arr[1]=1;
        int m=arr.length;                   //tabulation=without recursion we are                                   solving the problem
        for(int i=2;i<m;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];

    }

    public static void main(String[] args) {
        int n=6;
        int arr[]=new int[n+1];
        int ans=fibo_tabulation(n, arr);
        System.out.println(ans);
    }
}