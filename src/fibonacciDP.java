import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class fibonacciDP {
    static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    //bottom - up
    public static int fibonacci(int n) {
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //memoization top - bottom
    public static int fibonacci2(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else {
            if(memo.containsKey(n)) return memo.get(n);
            int next = fibonacci2(n - 1) + fibonacci2(n - 2);
            memo.put(n, next);
            return next;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        long startime = System.currentTimeMillis();
        for(int i=0; i<=n; i++){
            System.out.println(fibonacci2(i));;
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime - startime);
    }
}
