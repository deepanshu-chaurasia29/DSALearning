package com.deepu.dsa.arrays;

public class maximumWealth {
    public static void main(String[] args) {
//        int[][] accounts = {
//                {1,2},   // customer 1 having wealth = 1+2 = 3
//                {1,3,4},  // customer 2 having wealth = 1+3+4= 8
//                {3,4,5,6}   // customer 3 having wealth = 3+4+5+6 = 18
//        };
//        int wealth = yourWealth(accounts);
//        System.out.println(wealth);

        // (EFFICIENT SOLUTION)
        int[][] accounts = {
                {1,2},   // customer 1 having wealth = 1+2 = 3
                {1,3,4},  // customer 2 having wealth = 1+3+4= 8
                {3,4,5,6}   // customer 3 having wealth = 3+4+5+6 = 18
        };
        System.out.println(maxWealth(accounts));


    }

//    static int yourWealth(int[][] arr){
//        ArrayList<Integer> totalWealth = new ArrayList<>();
//
//        for(int row=0; row<arr.length; row++){
//            int sum = 0;
//            for(int col=0; col<arr[row].length; col++){
//                sum += arr[row][col];
//            }
//            totalWealth.add(sum);
//        }
//        int max = totalWealth.get(0);
//        for(int e:totalWealth){
//            if(e>max)
//                max = e;
//        }return max;
//
//    }

    static int maxWealth(int[][] accounts){
        int maxAmount=0;
        for(int i=0;i<accounts.length;i++){
            int amount=0;
            for(int j=0;j<accounts[i].length;j++){
                amount=amount+accounts[i][j];

            }
            if(amount>maxAmount){
                maxAmount=amount;
            }
        }
        return maxAmount;
    }
}
