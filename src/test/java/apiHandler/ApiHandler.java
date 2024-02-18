package apiHandler;

import helpers.DatabaseHandler;
import helpers.Queries.OtherQueries;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.ArrayList;
import static io.restassured.RestAssured.given;
public class ApiHandler {
    static String token;
    public static void main(String[] args) {
        adminLogin();
        adminReviewTrucksOwner();
        acceptReviewTrucksOwner();
    }
    public static void TrucksRegistrationTC() {
        adminLogin();
        adminReviewTrucksTC();
        acceptReviewTrucksTC();
    }
    public static void TrailerRegistrationTC() {
        adminLogin();
        adminReviewTrailersTC();
        acceptReviewTrailersTC();
    }
    public static void EquipmentRegistrationTC() {
        adminLogin();
        adminReviewEquipmentTC();
        acceptReviewEquipmentTC();
    }

    public static void TrucksRegistrationOwner() {
        adminLogin();
        adminReviewTrucksOwner();
        acceptReviewTrucksOwner();
    }
    public static void TrailerRegistrationOwner() {
        adminLogin();
        adminReviewTrailersOwner();
        acceptReviewTrailersOwner();
    }
    public static void EquipmentRegistrationOwner() {
        adminLogin();
        adminReviewEquipmentOwner();
        acceptReviewEquipmentOwner();
    }

    public static void RegistrationExternalStakeholder() {
        adminLogin();
        adminReviewStakeholder();
        acceptReviewStakeholder();
    }
    public static void adminLogin() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/";
        String response = given().log().all().header("accept", "*/*")
                 .header("Accept", "*/*")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"AreaCode\": \"968\",\n" +
                        "  \"PhoneNumber\": \"555555555555\",\n" +
                        "  \"Password\": \"Aa@123456\",\n" +
                        "  \"DeviceInfo\": {\n" +
                        "    \"PlayerId\": \"string\",\n" +
                        "    \"AppVersion\": \"string\",\n" +
                        "    \"DeviceId\": \"string\",\n" +
                        "    \"DeviceManufacture\": \"string\",\n" +
                        "    \"DeviceOs\": \"string\",\n" +
                        "    \"OSVersion\": \"string\",\n" +
                        "    \"DeviceModel\": \"string\"\n" +
                        "  }\n" +
                        "}")
                .when().log().all().post("UsersAuth/LogIn").asString();

        JsonPath js = new JsonPath(response);
        token = js.get("result.token");
        System.out.println("Token is : " + token);
    }
    public static void adminReviewStakeholder() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewStakeholders());
        String id = testData.get(0);

        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody)
                .put("Registration/Review");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void acceptReviewStakeholder() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewStakeholders());
        String id = testData.get(0);
        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("Registration/Accept");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void adminReviewTrucksTC( ) {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
            ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewTrucksTC());
            String id = testData.get(0);

            // JSON payload
            String requestBody = "{\"id\": \"" + id + "\"}";

            Response response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + token)
                    .body(requestBody)
                    .put("Fleets/Review");

            int statusCode = response.getStatusCode();
            String responseBody = response.getBody().asString();

            System.out.println("Status Code: " + statusCode);
            System.out.println("Response Body: " + responseBody);

    }
    public static void acceptReviewTrucksTC() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewTrucksTC());
        String id = testData.get(0);
        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("Fleets/Accept");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void adminReviewTrailersTC() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewTrailersTC());
        String id = testData.get(0);

        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody)
                .put("Fleets/Review");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void acceptReviewTrailersTC() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewTrailersTC());
        String id = testData.get(0);
        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("Fleets/Accept");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void adminReviewEquipmentTC() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewEquipmentTC());
        String id = testData.get(0);

        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody)
                .put("Fleets/Review");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void acceptReviewEquipmentTC() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewEquipmentTC());
        String id = testData.get(0);
        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("Fleets/Accept");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }

    public static void adminReviewTrucksOwner( ) {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewTrucksOwner());
        String id = testData.get(0);

        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody)
                .put("Fleets/Review");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);

    }
    public static void acceptReviewTrucksOwner() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewTrucksOwner());
        String id = testData.get(0);
        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("Fleets/Accept");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void adminReviewTrailersOwner() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewTrailersOwner());
        String id = testData.get(0);

        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody)
                .put("Fleets/Review");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void acceptReviewTrailersOwner() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewTrailersOwner());
        String id = testData.get(0);
        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("Fleets/Accept");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void adminReviewEquipmentOwner() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewEquipmentOwner());
        String id = testData.get(0);

        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody)
                .put("Fleets/Review");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    public static void acceptReviewEquipmentOwner() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewEquipmentOwner());
        String id = testData.get(0);
        // JSON payload
        String requestBody = "{\"id\": \"" + id + "\"}";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .put("Fleets/Accept");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }

}
