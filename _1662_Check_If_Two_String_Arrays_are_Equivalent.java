public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String result1 ="";
        // String result2 = "";

        // for (String string : word1) {
        //     result1 += string;
            
        // }
        // for (String string : word2) {
        //     result2 += string;
            
        // }

        // return result1.equals(result2);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String string : word1) {
            sb1.append(string);
        }

        for (String string : word2) {
            sb2.append(string);
        }
        return sb1.toString().equals(sb2.toString());
    }


    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
