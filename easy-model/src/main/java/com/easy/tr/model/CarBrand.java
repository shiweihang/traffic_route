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
public class CarBrand implements Serializable {

	private Long id;
	private String brandName;
	private Long parentId;// 父节点
	private Long rootId;// 根节点
	private static final long serialVersionUID = 1471161969667L;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setRootId(Long rootId) {
		this.rootId = rootId;
	}

	public Long getRootId() {
		return this.rootId;
	}
}
