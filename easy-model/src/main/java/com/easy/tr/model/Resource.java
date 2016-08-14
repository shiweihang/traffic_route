/**
 * copyright@www.laulyl.com
 */
package com.easy.tr.model;

import java.util.Date;
import java.io.Serializable;
/**
 * @author laulyl
 * @time 2016-08-14 16:06:09
 * @description create by laulyl project
 */
public class Resource implements Serializable {

	private Long id;
	private Long userId;
	private Long carId;
	private Date createTime;// 创建时间
	private Date publishTime;// 发布时间
	private Byte state;// 1=未发布 5=已发布 9=已过期
	private String description;
	private Byte resourceType;
	private static final long serialVersionUID = 1471161969688L;

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

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public Long getCarId() {
		return this.carId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Byte getState() {
		return this.state;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setResourceType(Byte resourceType) {
		this.resourceType = resourceType;
	}

	public Byte getResourceType() {
		return this.resourceType;
	}
}
