package server.service;

import pojo.Pec_r;

public interface ITestService {

	public Pec_r getBValue(String pk);

	public int deleteBValue(String pk);

	public int addBValue(Pec_r pec_r);

}
