/**
 * AbstractModel.java
 * 作者: fengmengyue
 * 创建日期: 2014年12月29日
 */
package com.monte.model;


/**
 * 所有模型基类，带有统一ID属性，即物理主键。
 * @author fengmengyue
 *
 */
public abstract class AbstractModel {
	/**
	 * ID
	 */
	private String id;

	/**
	 * ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * ID
	 */
	public void setId(String id) {
		this.id = id;
	}
}
