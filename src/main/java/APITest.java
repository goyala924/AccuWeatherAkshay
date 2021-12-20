import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {

	public static float getAPITemp(String city) {
		RestAssured.baseURI = "https://api.openweathermap.org/data/2.5";

		RequestSpecification request = RestAssured.given();

		Response response = request.queryParam("q", city)
				.queryParam("appid", "7fe67bf08c80ded756e598d6f8fedaea").get("/weather");

		System.out.println("API status code = " + response.getStatusCode());

		float temperatureKelvin = response.jsonPath().get("main.temp");
		System.out.println("API temp found = " + temperatureKelvin);
		return temperatureKelvin;
	}

}
