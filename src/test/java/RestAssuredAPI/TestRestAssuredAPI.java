package RestAssuredAPI;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class TestRestAssuredAPI {

    private String token = "1218daf1eab0558f96903834c537d28d0dca31777bacb98ff162f5d7866b6475";

    private String baseURI = "https://gorest.co.in/public/v2";

    private int userID = 5786257;

    @BeforeTest
    public void setUp() {RestAssured.baseURI = baseURI;}

    @Test
    public void testGetRequest(){
        Response response = RestAssured.given()
                .when()
                .get("/users");

        int statusCode = response.getStatusCode();
        System.out.println("status: " + statusCode);

        Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);

        JSONArray jsonArray = new JSONArray(responseBody);
        for (int i = 0; i < jsonArray.length();i++){
            JSONObject user = jsonArray.getJSONObject(i);
            Assert.assertTrue(user.has("id"));
            Assert.assertTrue(user.has("name"));
            Assert.assertTrue(user.has("email"));
            Assert.assertTrue(user.has("gender"));
            Assert.assertTrue(user.has("status"));
        }
    }


    @Test
    public void testPostRequest(){

        RequestSpecification request = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .header("Content-Type","application/json");

        String requestBody = "{"
                + "\"name\": \"Jesse Kruegers\","
                + "\"email\": \"fkruegers@street.com\","
                + "\"gender\": \"female\","
                + "\"status\": \"inactive\""
                + "}";

        Response response = request.body(requestBody).post("/users");

        int statusCode = response.getStatusCode();
        System.out.println("status: " + statusCode);
        Assert.assertEquals(statusCode,201);

        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        //int newUserId = response.jsonPath().getInt("data.id");
        //System.out.println("New User with Id: " + newUserId);

    }

    @Test
    public void testPutRequest(){

        RequestSpecification request = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .header("Content-Type","application/json");

        String requestBody = "{"
                + "\"name\": \"Mary Jane\","
                + "\"email\": \"mjane@hotmail.com\","
                + "\"gender\": \"female\","
                + "\"status\": \"active\""
                + "}";

        Response response = request.body(requestBody).put("/users/"+ 5786257);

        int statusCode = response.getStatusCode();
        System.out.println("status: " + statusCode);
        Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);
    }

    @Test
    public void testDeleteRequest(){

        Response response = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .when()
                .delete("/users/" + 5786257);

        int statusCode = response.getStatusCode();
        System.out.println("Response Status: " + statusCode);

    }
}
