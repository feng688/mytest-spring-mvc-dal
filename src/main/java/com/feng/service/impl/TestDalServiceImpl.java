package com.feng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dexcoder.dal.JdbcDao;
import com.dexcoder.dal.build.Criteria;
import com.feng.model.User;
import com.feng.service.TestDalService;

/**
 * 
 * @author fengqi
 *
 */
@Service
public class TestDalServiceImpl implements TestDalService {

	/** 调度工厂Bean */
//	@Autowired
//	private User user;

	/** 通用dao */
	@Autowired
	private JdbcDao jdbcDao;

	@Override
	public Long insert(User user) {
		Criteria criteria = Criteria.insert(User.class).into("name", "feng").into("age", "12").into("discription", "nihao");
		return jdbcDao.insert(criteria);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delUpdate(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer userId) {
		// TODO Auto-generated method stub

	}

}
