package B2BPackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Firstb2btest {

@SerializedName("flight_req")
@Expose
private FlightReq flightReq;

public FlightReq getFlightReq() {
return flightReq;
}

public void setFlightReq(FlightReq flightReq) {
this.flightReq = flightReq;
}

}