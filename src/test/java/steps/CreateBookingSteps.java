package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Booking;
import util.Datajson;
import util.Helper;
import util.Jsons;

import	static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

public class CreateBookingSteps extends Helper{
RequestSpecification res;
Booking response;
Jsons j=new Jsons();
Datajson dj=new Datajson();

    @Given("^Create request using payload$")
    public void create_request_using_payload() throws Throwable {
      // RestAssured.baseURI="https://restful-booker.herokuapp.com";
    	
        res=given().spec(requestdata()).body(dj.generatebooking());
    	
    }

    @When("^Add resource and hit Post method$")
    public void add_resource_and_hit_post_method() throws Throwable {
      response=  res.when().post("booking").as(Booking.class);
      
    }

    @Then("^Verify booking id is created$")
    public void verify_booking_id_is_created() throws Throwable {
    	int bookid=response.getBookingid();
    	String date=response.getBooking().getBookingdates().getCheckin();
    	System.out.println(bookid);
    	System.out.println(date);
    	
    }

	
	
}
