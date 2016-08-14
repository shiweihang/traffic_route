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
public class Car implements Serializable {

	private Long id;
	private Long userId;
	private Long driverId;
	private Long carBrandId;// 品牌ID
	private Long color;// 颜色
	private String number;// 车牌号
	private Integer seatNumber;// 座位数量
	private static final long serialVersionUID = 1471161969652L;

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

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public Long getDriverId() {
		return this.driverId;
	}

	public void setCarBrandId(Long carBrandId) {
		this.carBrandId = carBrandId;
	}

	public Long getCarBrandId() {
		return this.carBrandId;
	}

	public void setColor(Long color) {
		this.color = color;
	}

	public Long getColor() {
		return this.color;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Integer getSeatNumber() {
		return this.seatNumber;
	}
}
