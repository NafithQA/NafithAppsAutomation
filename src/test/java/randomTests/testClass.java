package randomTests;

public class testClass {

    public static void main(String[] args) {

        String otpNumber = "123456";

        // Creating array of string length
        String[] arr = new String[otpNumber.length()];

        // Copy character by character into array
        for (int i = 0; i < otpNumber.length(); i++) {
            arr[i] = String.valueOf(otpNumber.charAt(i));
        }

        for (int i = 0; i < otpNumber.length(); i++) {

            System.out.println(arr[i]);
        }
    }

}