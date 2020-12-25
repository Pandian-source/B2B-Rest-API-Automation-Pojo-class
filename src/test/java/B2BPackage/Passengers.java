package B2BPackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Passengers {

@SerializedName("adult")
@Expose
private Integer adult;
@SerializedName("child")
@Expose
private Integer child;
@SerializedName("lap_infant")
@Expose
private Integer lapInfant;
@SerializedName("infant")
@Expose
private Integer infant;
@SerializedName("senior_citizen")
@Expose
private Integer seniorCitizen;
@SerializedName("youth")
@Expose
private Integer youth;
@SerializedName("junior")
@Expose
private Integer junior;

public Integer getAdult() {
return adult;
}

public void setAdult(Integer adult) {
this.adult = adult;
}

public Integer getChild() {
return child;
}

public void setChild(Integer child) {
this.child = child;
}

public Integer getLapInfant() {
return lapInfant;
}

public void setLapInfant(Integer lapInfant) {
this.lapInfant = lapInfant;
}

public Integer getInfant() {
return infant;
}

public void setInfant(Integer infant) {
this.infant = infant;
}

public Integer getSeniorCitizen() {
return seniorCitizen;
}

public void setSeniorCitizen(Integer seniorCitizen) {
this.seniorCitizen = seniorCitizen;
}

public Integer getYouth() {
return youth;
}

public void setYouth(Integer youth) {
this.youth = youth;
}

public Integer getJunior() {
return junior;
}

public void setJunior(Integer junior) {
this.junior = junior;
}

}