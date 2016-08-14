/**
 * copyright@www.laulyl.com
 */
package com.easy.tr.model;

import java.io.Serializable;
/**
 * @author laulyl
 * @time 2016-08-14 16:06:09
 * @description create by laulyl project
 */
public class Driver implements Serializable {

	private Long id;
	private Long userId;
	private Byte drivingAge;
	private String driverLicenseIcon;
	private static final long serialVersionUID = 1471161969671L;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setDrivingAge(Byte drivingAge) {
		this.drivingAge = drivingAge;
	}

	public Byte getDrivingAge() {
		return this.drivingAge;
	}

	public void setDriverLicenseIcon(String driverLicenseIcon) {
		this.driverLicenseIcon = driverLicenseIcon;
	}

	public String getDriverLicenseIcon() {
		return this.driverLicenseIcon;
	}
}
