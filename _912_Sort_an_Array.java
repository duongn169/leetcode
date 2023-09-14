import java.util.Arrays;

public class _912_Sort_an_Array {


    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        
        int i = 0, i1 = 0, i2 = 0;
        while(i < n) {
            if(i1< a1.length && i2 < a2.length) { // a1 && a2 != rong
                if(a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++; i1++;
                }else { //a2 nhỏ hơn
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }else {
                //a1 rỗng or a2 rỗng
                if(i1< a1.length) {
                    result[i] = a1[i1];
                    i++; i1++;
                }else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int[]a, int left, int right) {
        //THDB DKD
        if(left > right) return new int[0];

        if(left == right) {
            int[] singleElement = {a[left]};
            return singleElement;
        }
        //chia ra   
        System.out.println("Chia: " + left + " - " + right);
        int k = (left + right) / 2;
        int[] a1 = mergeSort(a, left, k);
        int[] a2 = mergeSort(a, k + 1, right);

        //tron vao
        int[] result = merge(a1, a2);
        System.out.println("Ket qua merge: " + Arrays.toString(result));
        return result;
        
    }
    
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[]  nums = {5,1,1,2,0,0};
        System.out.println(sortArray(nums));
    }
}
