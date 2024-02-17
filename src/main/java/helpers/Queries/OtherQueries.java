package helpers.Queries;

public class OtherQueries {

    public static String otpNumber(String phoneNumber) {

        String query = "SELECT OTPCode from OTPMessages where PhoneNumber LIKE '%" + phoneNumber + "'";
        return query;
    }

    public static String getNewTrucksTC() {

        String query = "select top 1 id  from [NSTAR_QA].[dbo].[Fleet]\n" +
                "    where [VehicleType]='TRUCKS' and [StakeholderId]='20959' and StatusCode = 'NEW' order by id desc";
        return query;
    }
    public static String getUnderReviewTrucksTC() {

        String query = "select top 1 id  from [NSTAR_QA].[dbo].[Fleet]\n" +
                "    where [VehicleType]='TRUCKS' and [StakeholderId]='20959' and StatusCode = 'UNDER_REVIEW' order by id desc";
        return query;
    }
    public static String getNewTrailersTC() {

        String query = "select top 1 id  from [NSTAR_QA].[dbo].[Fleet]\n" +
                "    where [VehicleType]='TRAILERS' and [StakeholderId]='20959' and StatusCode = 'NEW' order by id desc";
        return query;
    }
    public static String getUnderReviewTrailersTC() {

        String query = "select top 1 id  from [NSTAR_QA].[dbo].[Fleet]\n" +
                "    where [VehicleType]='TRAILERS' and [StakeholderId]='20959' and StatusCode = 'UNDER_REVIEW' order by id desc";
        return query;
    }
    public static String getNewEquipmentTC() {

        String query = "select top 1 id  from [NSTAR_QA].[dbo].[Fleet]\n" +
                "    where [VehicleType]='EQUIPMENTS' and [StakeholderId]='20959' and StatusCode = 'NEW' order by id desc";
        return query;
    }
    public static String getUnderReviewEquipmentTC() {

        String query = "select top 1 id  from [NSTAR_QA].[dbo].[Fleet]\n" +
                "    where [VehicleType]='EQUIPMENTS' and [StakeholderId]='20959' and StatusCode = 'UNDER_REVIEW' order by id desc";
        return query;
    }
    public static String getNewStakeholdersTC() {

        String query = "select * from [NSTAR_QA].[dbo].Stakeholders  where\n" +
                "  StatusCode = 'NEW' order by id desc";
        return query;
    }
    public static String getUnderReviewStakeholdersTC() {

        String query = "select * from [NSTAR_QA].[dbo].Stakeholders  where\n" +
                "  StatusCode = 'UNDER_REVIEW' order by id desc";
        return query;
    }
}
