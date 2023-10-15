package helpers.Queries;

public class OtherQueries {

    public static String otpNumber(String phoneNumber) {

        String query = "SELECT OTPCode from OTPMessages where PhoneNumber LIKE '%" + phoneNumber + "'";
        return query;
    }
}