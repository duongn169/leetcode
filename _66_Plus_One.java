import java.util.Arrays;

public class _66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // Duyệt từ cuối mảng về đầu
        for (int i = n - 1; i >= 0; i--) {
            // Thêm 1 vào phần tử hiện tại
            digits[i] = digits[i] + 1;
            // Nếu phần tử hiện tại sau khi thêm 1 vẫn < 10, thì không cần nâng cấp nữa
            if(digits[i] < 10) {
                return digits;
            }
            // Nếu phần tử hiện tại sau khi thêm 1 là 10, đặt nó thành 0 và tiếp tục vòng lặp
            digits[i] = 0;
        }
         // Nếu vòng lặp kết thúc mà vẫn cần nâng cấp, 
         //tức là tất cả các phần tử đều là 9, ta cần tạo mảng mới có độ dài +1
         int[] result = new int[n + 1];
         result[0] = 1;

        return result;

    }
    public static void main(String[] args) {
        int[] digits = {10};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
