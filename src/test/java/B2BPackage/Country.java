package B2BPackage;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

@SerializedName("country_type")
@Expose
private String countryType;
@SerializedName("country")
@Expose
private List<String> country = null;

public String getCountryType() {
return countryType;
}
public void setCountryType(String countryType) {
this.countryType = countryType;
}

public List<String> getCountry() {
return country;
}

public void setCountry(List<String> country) {
this.country = country;
}

}