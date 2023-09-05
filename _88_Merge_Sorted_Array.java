public class _88_Merge_Sorted_Array {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2) {
            insertElementIntoArray(ai, n1, m);
            m++;
            
        }
    }

    private static void insertElementIntoArray(int x, int[] a, int m) {
        boolean isFindK = false;
        for (int k = 0; k < m; k++) {
            if(a[k] > x ) {
                isFindK = true;
                for (int i = m- 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;

                break;
            }
        }
        if(isFindK == false) { 
            a[m] = x;
        }
    }
    public static void main(String[] args) {
        int[] n1= {2,3,4,5,0,0,0};
        int[] n2 = {0,3,6};
        merge(n1, 4, n2, 3);
        System.out.println("DONE");
    }
}
