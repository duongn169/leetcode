public class _704_Binary_Search_using_recursion {


    public static  int search(int[] a, int key, int iLeft, int iRight) {

        if(iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight) /2;
        if(key == a[iMid]) {
            return iMid;
        }else if(key > a[iMid]) {
            return search(a, key,iMid + 1, iRight);
        }else {
            return search(a, key,iLeft, iMid - 1);
        }
    }


    public static  int search(int[] a, int key) {
        int n =a.length;
        return search(a, key, 0, n - 1);
    }
    public static void main(String[] args) {
        int[] a = {1,4,9,12,19,25,31,46,50,57,72};
        System.out.println(search(a, 31));
    }
}
