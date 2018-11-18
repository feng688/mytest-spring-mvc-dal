package com.feng.service;

import com.feng.model.User;

/**
 * 
 * @author fengqi
 *
 */
public interface TestDalService {

	/**
	 * 新增
	 * 
	 * @param scheduleJobVo
	 * @return
	 */
	public Long insert(User user);

	/**
	 * 直接修改 只能修改运行的时间，参数、同异步等无法修改
	 * 
	 * @param scheduleJobVo
	 */
	public void update(User user);

	/**
	 * 删除重新创建方式
	 * 
	 * @param scheduleJobVo
	 */
	public void delUpdate(User user);

	/**
	 * 删除
	 * 
	 * @param scheduleJobId
	 */
	public void delete(Integer userId);

}
