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
public class Reply implements Serializable {

	private Long id;
	private Long userId;
	private Long placeId;
	private String description;
	private static final long serialVersionUID = 1471161969682L;

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

	public void setPlaceId(Long placeId) {
		this.placeId = placeId;
	}

	public Long getPlaceId() {
		return this.placeId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
