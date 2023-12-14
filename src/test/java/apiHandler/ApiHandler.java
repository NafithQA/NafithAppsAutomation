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
    public static void main() {
        adminLogin();
        adminReviewTrucks();
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

    public static void adminReviewTrucks() {

        RestAssured.baseURI = "http://82.212.90.190:8082/webGateway/"; // Set your base URL here

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ArrayList<String> testData = databaseHandler.getIdFromDataBase(OtherQueries.getTcTrucks());
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
}
