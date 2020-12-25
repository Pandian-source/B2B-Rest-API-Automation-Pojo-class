package B2BPackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sector {

@SerializedName("departure_date")
@Expose
private String departureDate;
@SerializedName("destination")
@Expose
private String destination;
@SerializedName("destination_near_by_airport")
@Expose
private String destinationNearByAirport;
@SerializedName("origin")
@Expose
private String origin;
@SerializedName("origin_near_by_airport")
@Expose
private String originNearByAirport;

public String getDepartureDate() {
return departureDate;
}

public void setDepartureDate(String departureDate) {
this.departureDate = departureDate;
}

public String getDestination() {
return destination;
}

public void setDestination(String destination) {
this.destination = destination;
}

public String getDestinationNearByAirport() {
return destinationNearByAirport;
}

public void setDestinationNearByAirport(String destinationNearByAirport) {
this.destinationNearByAirport = destinationNearByAirport;
}

public String getOrigin() {
return origin;
}

public void setOrigin(String origin) {
this.origin = origin;
}

public String getOriginNearByAirport() {
return originNearByAirport;
}
public void setOriginNearByAirport(String originNearByAirport) {
this.originNearByAirport = originNearByAirport;
}

}