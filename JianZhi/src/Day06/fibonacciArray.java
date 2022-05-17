package Day06;

public class fibonacciArray {

    /**
     * дһ������������ n ����쳲�������Fibonacci�����еĵ� n ��� F(N)����쳲��������еĶ������£�
     * F(0) = 0,F(1)= 1
     * F(N) = F(N - 1) + F(N - 2), ���� N > 1.
     */


    //�ݹ�ⷨ
    public long solution1(int n){

        if (n < 0 || n == 0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        return solution1(n-1)+solution1(n-2);


    }

    //�Ľ��ⷨ ����ݹ����ظ�����
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
