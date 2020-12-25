package B2BPackage;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightReq {

@SerializedName("account_id")
@Expose
private String accountId;
@SerializedName("org_account_id")
@Expose
private String orgAccountId;
@SerializedName("trip_type")
@Expose
private String tripType;
@SerializedName("currency")
@Expose
private String currency;
@SerializedName("alternet_dates")
@Expose
private String alternetDates;
@SerializedName("cabin")
@Expose
private String cabin;
@SerializedName("sectors")
@Expose
private List<Sector> sectors = null;
@SerializedName("passengers")
@Expose
private Passengers passengers;
@SerializedName("extra_options")
@Expose
private ExtraOptions extraOptions;
@SerializedName("shareUrlId")
@Expose
private String shareUrlId;
@SerializedName("stops")
@Expose
private Stops stops;
@SerializedName("airlines")
@Expose
private Airlines airlines;
@SerializedName("country")
@Expose
private Country country;
@SerializedName("local_pcc_country")
@Expose
private String localPccCountry;
@SerializedName("search_type")
@Expose
private String searchType;

public String getAccountId() {
return accountId;
}

public void setAccountId(String accountId) {
this.accountId = accountId;
}

public String getOrgAccountId() {
return orgAccountId;
}

public void setOrgAccountId(String orgAccountId) {
this.orgAccountId = orgAccountId;
}

public String getTripType() {
return tripType;
}

public void setTripType(String tripType) {
this.tripType = tripType;
}

public String getCurrency() {
return currency;
}

public void setCurrency(String currency) {
this.currency = currency;
}

public String getAlternetDates() {
return alternetDates;
}

public void setAlternetDates(String alternetDates) {
this.alternetDates = alternetDates;
}

public String getCabin() {
return cabin;
}

public void setCabin(String cabin) {
this.cabin = cabin;
}

public List<Sector> getSectors() {
return sectors;
}

public void setSectors(List<Sector> sectors) {
this.sectors = sectors;
}

public Passengers getPassengers() {
return passengers;
}

public void setPassengers(Passengers passengers) {
this.passengers = passengers;
}

public ExtraOptions getExtraOptions() {
return extraOptions;
}

public void setExtraOptions(ExtraOptions extraOptions) {
this.extraOptions = extraOptions;
}

public String getShareUrlId() {
return shareUrlId;
}

public void setShareUrlId(String shareUrlId) {
this.shareUrlId = shareUrlId;
}
public Stops getStops() {
return stops;
}

public void setStops(Stops stops) {
this.stops = stops;
}
public Airlines getAirlines() {
return airlines;
}

public void setAirlines(Airlines airlines) {
this.airlines = airlines;
}

public Country getCountry() {
return country;
}

public void setCountry(Country country) {
this.country = country;
}

public String getLocalPccCountry() {
return localPccCountry;
}

public void setLocalPccCountry(String localPccCountry) {
this.localPccCountry = localPccCountry;
}

public String getSearchType() {
return searchType;
}

public void setSearchType(String searchType) {
this.searchType = searchType;
}

}
