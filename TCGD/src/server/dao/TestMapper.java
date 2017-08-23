package server.dao;

import pojo.Pec_r;

public interface TestMapper {

	Pec_r getBValue(String pk);

	int deleteBValue(String pk);

	int addBValue(Pec_r pec_r);

}