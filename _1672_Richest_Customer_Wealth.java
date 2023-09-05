public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        int customer = accounts.length;
        int bank = accounts[0].length;
        for (int i = 0; i < customer; i++) {
            
            for (int j = 0; j < bank; j++) {
                sum += accounts[i][j];
                
            } 
           if (sum > max) max = sum;
           sum = 0;
        }


        return max;
    }

    public static void main(String[] args) {
        //int[][] a = {{1,5},{7,3},{3,5}};
        int[][] a= {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(a));
    }
}
