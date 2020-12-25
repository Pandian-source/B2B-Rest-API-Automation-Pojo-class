package B2BPackage;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stops {

@SerializedName("stop_type")
@Expose
private String stopType;
@SerializedName("stops")
@Expose
private List<String> stops = null;

public String getStopType() {
return stopType;
}

public void setStopType(String stopType) {
this.stopType = stopType;
}

public List<String> getStops() {
return stops;
}

public void setStops(List<String> stops) {
this.stops = stops;
}

}