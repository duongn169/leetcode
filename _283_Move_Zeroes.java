public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int curIndex = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[curIndex] = nums[i];
                curIndex++;
            }
        }
        for (; curIndex < n; curIndex++) {
            nums[curIndex] = 0;
        }
    }


    public static void main(String[] args) {
        int[] nums = {5,0,0,8,12};
        moveZeroes(nums);
        System.out.println("Done");
    }
}
