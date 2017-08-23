package server.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pojo.Pec_r;
import server.dao.TestMapper;
import server.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService {
	@Resource
	private TestMapper testDao;

	@Override
	public Pec_r getBValue(String pk) {
		return this.testDao.getBValue(pk);
	}

	@Override
	public int deleteBValue(String pk) {
		return this.testDao.deleteBValue(pk);
	}

	@Override
	public int addBValue(Pec_r pec_r) {
		return this.testDao.addBValue(pec_r);
	}
}
