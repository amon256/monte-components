/**
 * AbstractModel.java
 * 作者: fengmengyue
 * 创建日期: 2014年12月29日
 */
package org.monte.model;

import java.io.Serializable;

/**
 * 所有模型基类，带有统一ID属性，即物理主键。
 * @author fengmengyue
 *
 */
public abstract class AbstractModel<T extends Serializable> {
	/**
	 * ID
	 */
	private T id;

	/**
	 * ID
	 */
	public T getId() {
		return id;
	}

	/**
	 * ID
	 */
	public void setId(T id) {
		this.id = id;
	}
}
