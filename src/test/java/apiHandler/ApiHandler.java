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
        adminReviewStakeholder();
        acceptReviewStakeholder();
    }
    public static void TrucksRegistration() {
        adminLogin();
        adminReviewTrucks();
        acceptReviewTrucks();
    }
    public static void TrailerRegistration() {
        adminLogin();
        adminReviewTrailers();
        acceptReviewTrailers();
    }
    public static void EquipmentRegistration() {
        adminLogin();
        adminReviewEquipment();
        acceptReviewEquipment();
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
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getNewStakeholdersTC());
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
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getUnderReviewStakeholdersTC());
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
    public static void adminReviewTrucks() {

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
    public static void acceptReviewTrucks() {

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
    public static void adminReviewTrailers() {

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
    public static void acceptReviewTrailers() {

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
    public static void adminReviewEquipment() {

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
    public static void acceptReviewEquipment() {

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

}
