package B2BPackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtraOptions {

@SerializedName("direct_flights")
@Expose
private Boolean directFlights;
@SerializedName("free_baggage")
@Expose
private Boolean freeBaggage;
@SerializedName("avoid_us")
@Expose
private Boolean avoidUs;
@SerializedName("near_by_airports")
@Expose
private Boolean nearByAirports;
@SerializedName("refundable_fares_only")
@Expose
private Boolean refundableFaresOnly;
@SerializedName("allow_upsale_fare")
@Expose
private Boolean allowUpsaleFare;

public Boolean getDirectFlights() {
return directFlights;
}

public void setDirectFlights(Boolean directFlights) {
this.directFlights = directFlights;
}

public Boolean getFreeBaggage() {
return freeBaggage;
}

public void setFreeBaggage(Boolean freeBaggage) {
this.freeBaggage = freeBaggage;
}

public Boolean getAvoidUs() {
return avoidUs;
}

public void setAvoidUs(Boolean avoidUs) {
this.avoidUs = avoidUs;
}

public Boolean getNearByAirports() {
return nearByAirports;
}

public void setNearByAirports(Boolean nearByAirports) {
this.nearByAirports = nearByAirports;
}

public Boolean getRefundableFaresOnly() {
return refundableFaresOnly;
}

public void setRefundableFaresOnly(Boolean refundableFaresOnly) {
this.refundableFaresOnly = refundableFaresOnly;
}

public Boolean getAllowUpsaleFare() {
return allowUpsaleFare;
}

public void setAllowUpsaleFare(Boolean allowUpsaleFare) {
this.allowUpsaleFare = allowUpsaleFare;
}

}
