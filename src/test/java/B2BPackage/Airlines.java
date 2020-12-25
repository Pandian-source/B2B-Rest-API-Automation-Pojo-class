package B2BPackage;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Airlines {

@SerializedName("airline_type")
@Expose
private String airlineType;
@SerializedName("airlines")
@Expose
private List<String> airlines = null;

public String getAirlineType() {
return airlineType;
}

public void setAirlineType(String airlineType) {
this.airlineType = airlineType;
}

public List<String> getAirlines() {
return airlines;
}

public void setAirlines(List<String> airlines) {
this.airlines = airlines;
}


	
}

