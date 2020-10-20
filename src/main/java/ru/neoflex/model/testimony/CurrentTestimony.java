package ru.neoflex.model.testimony;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class CurrentTestimony {

	@SerializedName("coldWater")
	private int coldWater;

	@SerializedName("gas")
	private int gas;

	@SerializedName("electricity")
	private int electricity;

	@SerializedName("hotWater")
	private int hotWater;

	public int getColdWater(){
		return coldWater;
	}

	public int getGas(){
		return gas;
	}

	public int getElectricity(){
		return electricity;
	}

	public int getHotWater(){
		return hotWater;
	}

	public void setColdWater(int coldWater) {
		this.coldWater = coldWater;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}

	public void setHotWater(int hotWater) {
		this.hotWater = hotWater;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CurrentTestimony that = (CurrentTestimony) o;
		return coldWater == that.coldWater &&
				gas == that.gas &&
				electricity == that.electricity &&
				hotWater == that.hotWater;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coldWater, gas, electricity, hotWater);
	}
}