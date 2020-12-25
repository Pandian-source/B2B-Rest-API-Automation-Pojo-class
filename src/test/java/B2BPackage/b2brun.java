package B2BPackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import B2BPackage.ExtraOptions;
import B2BPackage.Firstb2btest;
import B2BPackage.FlightReq;
import B2BPackage.Passengers;
import B2BPackage.Sector;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import B2BPackage.Airlines;
import B2BPackage.Country;
public class b2brun {

@Test
public void B2BFlightRestAPIAutomation()
		{
			Firstb2btest firstb2btest = new Firstb2btest();	
		    FlightReq flightReq = new FlightReq();
		    firstb2btest.setFlightReq(flightReq);
			flightReq.setAccountId("OQ==");
			flightReq.setOrgAccountId("9");
			flightReq.setTripType("multi");
			flightReq.setCurrency("LKR");
			flightReq.setAlternetDates("0");
			flightReq.setCabin("Y");
			
			flightReq.setShareUrlId("");
			flightReq.setLocalPccCountry("CA");
			flightReq.setSearchType("lowFareSearch");
			
			
			Sector sectors = new Sector ();
			sectors.setDepartureDate("2021-02-18");
			sectors.setDestinationNearByAirport("N");
		    sectors.setDestination("YYC");
			sectors.setOrigin("YVR");
		    sectors.setOriginNearByAirport("N");
		    
		    Sector sectorsreturn = new Sector();
		    sectorsreturn.setDepartureDate("2021-02-21");
		    sectorsreturn.setDestinationNearByAirport("N");
		    sectorsreturn.setDestination("YYZ");
		    sectorsreturn.setOrigin("YYC");
		    sectorsreturn.setOriginNearByAirport("N");
		    
		    List<Sector>allsectors = new ArrayList<Sector>();
		    allsectors.add(sectorsreturn);
		    allsectors.add(sectorsreturn);
		    flightReq.setSectors(allsectors);
		    
		    Passengers passengers = new Passengers();
			flightReq.setPassengers(passengers);
			passengers.setAdult(1);
			passengers.setChild(0);
			passengers.setInfant(0);
			passengers.setLapInfant(0);
			passengers.setJunior(0);
			passengers.setSeniorCitizen(0);
			passengers.setYouth(0);
			
			ExtraOptions extraOptions = new ExtraOptions();
			flightReq.setExtraOptions(extraOptions);
			extraOptions.setDirectFlights(false);
			extraOptions.setFreeBaggage(true);
			extraOptions.setRefundableFaresOnly(false);
			extraOptions.setNearByAirports(false);
			extraOptions.setAvoidUs(false);
			extraOptions.setAllowUpsaleFare(false);
			
			//AIRLINES FILTER//
			Airlines airlines = new Airlines();
			flightReq.setAirlines(airlines);
			airlines.setAirlineType("include");
			
			ArrayList<String>allairlines = new ArrayList<String>();
			allairlines.add("WS");
			airlines.setAirlines(allairlines);
			
			//COUNTRY FILTER//
			Country country = new Country();
			flightReq.setCountry(country);
			country.setCountryType("exclude");
			
			
			ArrayList<String>allcountry = new ArrayList<String>();
			allcountry.add("US");
			country.setCountry(allcountry);
			
			//STOPS FILTER//
			
			Stops stops = new Stops();
			flightReq.setStops(stops);
			stops.setStopType("include");
			
			
			ArrayList<String>allstops = new ArrayList<String>();
			allstops.add("CMB");
			allstops.add("MAA");
			stops.setStops(allstops);
			
		    Gson gson = new GsonBuilder().setPrettyPrinting().create();
		    String jsonEmp = gson.toJson(firstb2btest);
		    
		    //JSONParser parser = new JSONParser();
		   // JSONObject jsonObj = (JSONObject)parser.parse(jsonEmp);
		    System.out.print(jsonEmp);
		    
		    RestAssured.baseURI ="https://b2b2capi.tltid.com";
			RequestSpecification requestspecification = RestAssured.given();
			requestspecification.header("content-type", "application/json");
			requestspecification.header("Connection", "keep-alive");
			
			//B2B API TESTING//
			requestspecification.header("Authorization", "c20ad4d76fe97759aa27a0c99bff67101585545954");
			
			//B2C API TESTING
			requestspecification.header("portal-origin", "https://b2cui2.tltid.com/lk/");
			
			requestspecification.body(jsonEmp);
			Response response= requestspecification.request(Method.POST,"/api/flights/getResult/deal");
		    String responseBody = response.getBody().asString();
			System.out.println("Response body is:"+responseBody);
			int status_code = response.getStatusCode();
			Assert.assertEquals(status_code, "200");
			String status = response.jsonPath().get("status");
			Assert.assertEquals(status, status_code);
			
		}
}
