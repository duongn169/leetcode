public class _344_Reverse_String {
    // public static void swap(char[] arr, int i, int j) {
    //     if(i < j) {
    //         char t = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = t;
    //         swap(arr, i + 1 , j - 1);
    //     }
    // }

    // public static void reverseString(char[] s) {
    //     swap(s, 0, s.length -1);
    // }
     public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) { 
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
            start++;
            end--;
        }
     }


    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};
       reverseString(s);
      
    }
}
