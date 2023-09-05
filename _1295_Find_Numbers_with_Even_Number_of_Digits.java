public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            int amountWord = calculateWord(a);
            if(amountWord%2 == 0) {
                count++;
            }
        }
        return count;
    }
    private static int calculateWord(int a) {
        int count = 0;
        int result = a;
        while(result != 0) {
            result = a /10;
            a = result;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(calculateWord(99));


    }
}
