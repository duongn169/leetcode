public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;

        if(n < 3) {
            return false;
        }
        boolean bIsIncreasing = true;
        for (int i = 0; (i + 1) < n; i++) {
            int j = i + 1;
            if(arr[i] > arr[j]) {//range is decreasing
                if(bIsIncreasing == false) {
                    // normal
                }
                else {
                    if(i == 0) {
                        return false;
                    }
                    bIsIncreasing = false;
                }
            }
            else if(arr[i] < arr[j]) { //range is increasing
                if(bIsIncreasing == true) {
                    //normal
                }
                else {
                    return false;
                }
            }
            else {//arr[i] == arr[j]
                return false;
            }
        }
        if(bIsIncreasing == false) { 
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,1,0};
        System.out.println(validMountainArray(arr));
    }
}
