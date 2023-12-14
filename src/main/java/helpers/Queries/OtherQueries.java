package helpers.Queries;

public class OtherQueries {

    public static String otpNumber(String phoneNumber) {

        String query = "SELECT OTPCode from OTPMessages where PhoneNumber LIKE '%" + phoneNumber + "'";
        return query;
    }

    public static String getTcTrucks() {

        String query = "select top 1 id  from [NSTAR_QA].[dbo].[Fleet]\n" +
                "    where [VehicleType]='TRUCKS' and [StakeholderId]='20959' and StatusCode = 'NEW' order by id desc";
        return query;
    }
}
