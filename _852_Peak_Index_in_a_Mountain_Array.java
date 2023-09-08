public class _852_Peak_Index_in_a_Mountain_Array {
    
    public static int find(int[] arr, int iLeft, int iRight) {

        if(iRight -iLeft >= 2) {
            int iMid = (iLeft + iRight) /2;

           if(arr[iMid] > arr[iMid - 1]&& arr[iMid] > arr[iMid + 1]) {
            return iMid;
           }else if(arr[iMid - 1] < arr[iMid]) {//di chuyen ve ben phai
                return find(arr, iMid, iRight);
           }else {
                 return find(arr, iLeft, iMid);
           }
        }else {
            return -1;
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int index = find(arr, 0, arr.length - 1);
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,12,100,8};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
