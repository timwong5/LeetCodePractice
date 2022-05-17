package Day06;

public class fibonacciArray {

    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
     * F(0) = 0,F(1)= 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     */


    //递归解法
    public long solution1(int n){

        if (n < 0 || n == 0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        return solution1(n-1)+solution1(n-2);


    }

    //改进解法 避免递归中重复计算
    public long solution2(int n){

        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }


        long f0 = 0;
        long f1 = 1;

        long fn = 0;

        for (int i=2; i <= n ; i++){
            fn = f0+f1;

            f1 = f0;
            f0 = fn;
        }


        return fn;

    }
}
