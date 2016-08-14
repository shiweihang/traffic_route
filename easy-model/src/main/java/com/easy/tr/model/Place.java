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
public class Place implements Serializable {

	private Long id;// 主键
	private String placeName;// 地点名称
	private Double x;// x坐标
	private Double y;// y坐标
	private Long sortIndex;// 排序字段
	private Long sourceId;// 资源id
	private Byte placeType;// 地点所属类型 1=属于driver资源  2=属于乘客资源
	private Date estimateTime;// 预计发车时间
	private String description;// 备注
	private Byte state;// 1=进行中 3=人满 5=已过期
	private static final long serialVersionUID = 1471161969679L;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceName() {
		return this.placeName;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getX() {
		return this.x;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double getY() {
		return this.y;
	}

	public void setSortIndex(Long sortIndex) {
		this.sortIndex = sortIndex;
	}

	public Long getSortIndex() {
		return this.sortIndex;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public Long getSourceId() {
		return this.sourceId;
	}

	public void setPlaceType(Byte placeType) {
		this.placeType = placeType;
	}

	public Byte getPlaceType() {
		return this.placeType;
	}

	public void setEstimateTime(Date estimateTime) {
		this.estimateTime = estimateTime;
	}

	public Date getEstimateTime() {
		return this.estimateTime;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Byte getState() {
		return this.state;
	}
}
