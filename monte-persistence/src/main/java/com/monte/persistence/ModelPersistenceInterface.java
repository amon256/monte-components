/**
 * ModelPersistenceInterface.java
 * 作者: fengmengyue
 * 创建日期: 2014年12月29日
 */
package com.monte.persistence;

import com.monte.model.AbstractModel;

/**
 * 模型数据持久化接口
 * @author fengmengyue
 *
 */
public interface ModelPersistenceInterface<T extends AbstractModel> {
	
	/**
	 * 新增数据
	 * @param model
	 * @return
	 */
	public boolean add(AbstractModel model);
	
	/**
	 * 更新数据
	 * @param model
	 * @return
	 */
	public boolean update(AbstractModel model);
	
	/**
	 * 保存数据，不存在则新增，存在则更新
	 * @param model
	 * @return
	 */
	public boolean save(AbstractModel model);
	
	/**
	 * 删除数据
	 * @param model
	 * @return
	 */
	public boolean delete(AbstractModel model);
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
}
