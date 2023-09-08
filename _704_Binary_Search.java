public class _704_Binary_Search {
    public static int search(int[] a, int key) {

        int n = a.length;
        int iLeft = 0;
        int iRight = n - 1;

        while(iLeft <= iRight) {
            int iMid = (iLeft + iRight) / 2;
            System.out.println("["+ iLeft + "," +iRight+ "] xet " + iMid);
            if(key == a[iMid]) {
                return iMid;
            }else if(key > a[iMid]) {
                iLeft = iMid + 1;

            }else {
                iRight = iMid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,4,9,12,19,25,31,46,50,57,72};
        System.out.println(search(a, 30));
    }
}
