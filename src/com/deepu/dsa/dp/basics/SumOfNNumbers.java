package com.deepu.dsa.dp.basics;

public class SumOfNNumbers {
    static void main() {
        sumUptoN(10,0);
        System.out.println(sumUptoNRet(10));
    }
    static void sumUptoN(int n,int sum){
        if(n == 1){
            sum += 1;
            System.out.println(sum);
            return;
        }
        sum += n;
        sumUptoN(n-1,sum);
    }
    static int sumUptoNRet(int n){
        if(n == 0){
            return 0;
        }
        return n + sumUptoNRet(n-1);
    }

}
