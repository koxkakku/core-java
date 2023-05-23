/**
 * 
 */
package com.sharad.learn.corejava.inheritence.phone;

import java.io.Serializable;

/**
 * @author koxkakku
 *
 */
public class Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1838885314822448640L;
	private String imei;
	private String brand;
	private String version;
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Model [imei=" + imei + ", brand=" + brand + ", version=" + version + "]";
	}
	public Model(String imei, String brand, String version) {
		super();
		this.imei = imei;
		this.brand = brand;
		this.version = version;
	}
	
	
}
