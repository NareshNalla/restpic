package com.hcci.datavalidation.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class Medicine 
{
	
	private int medicine_Id;
	private String geo_type;
	private String geo_value;
	private String medicine_cd;
	private String medicine_json;
	public int getMedicine_Id() {
		return medicine_Id;
	}
	public void setMedicine_Id(int medicine_Id) {
		this.medicine_Id = medicine_Id;
	}
	public String getGeo_type() {
		return geo_type;
	}
	public void setGeo_type(String geo_type) {
		this.geo_type = geo_type;
	}
	public String getGeo_value() {
		return geo_value;
	}
	public void setGeo_value(String geo_value) {
		this.geo_value = geo_value;
	}
	public String getMedicine_cd() {
		return medicine_cd;
	}
	public void setMedicine_cd(String medicine_cd) {
		this.medicine_cd = medicine_cd;
	}
	public String getMedicine_json() {
		return medicine_json;
	}
	public void setMedicine_json(String medicine_json) {
		this.medicine_json = medicine_json;
	}
}