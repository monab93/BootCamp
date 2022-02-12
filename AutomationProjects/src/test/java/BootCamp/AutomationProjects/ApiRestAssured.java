package BootCamp.AutomationProjects;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiRestAssured {

public static void main(String[] args) {
		// TODO Auto-generated method stub
//Get method		
Response  PrintRes= get("https://reqres.in/api/users?page=2");
PrintRes.prettyPrint();

//Post method
File po=new File("C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\ApiRest.json");
Response ot=given().contentType(ContentType.JSON).body(po).post("https://reqres.in/api/users");
ot.prettyPrint();

}
}
