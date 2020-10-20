package ru.neoflex.model.testimony;

import com.google.gson.annotations.SerializedName;

public class Cost {

	@SerializedName("coldWater")
	private String coldWater;

	@SerializedName("gas")
	private String gas;

	@SerializedName("electricity")
	private String electricity;

	@SerializedName("hotWater")
	private String hotWater;

	public String getColdWater(){
		return coldWater;
	}

	public String getGas(){
		return gas;
	}

	public String getElectricity(){
		return electricity;
	}

	public String getHotWater(){
		return hotWater;
	}
}