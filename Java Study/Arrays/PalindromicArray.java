package Arrays;

public class PalindromicArray {
    public static void main(String[] args) {
        int arr[] = { 111, 222, 333, 444, 555 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int rev = 0;
            int temp = arr[i];// 111 //222
            while (temp > 0) {
                int rem = temp % 10;
                rev = (rev * 10) + rem;
                temp = temp / 10;

            }
            if (rev != arr[i]) {
                break;
            }
            rev = 0;
            count++;

        }

        if (count == arr.length) {
            System.out.println("the array is palindromic");

        } else {
            System.out.println("Not palindromic");
        }

    }
}
