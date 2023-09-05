public class _27_Remove_Element {
    public static int removeElement(int[] a, int val) {
        int count = 0;
        for(int i = 0; i <a.length; i++) {
            if(a[i] != val) {
                a[count] = a[i];
                count++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 2));
        System.out.println("DONE");
    }
}
