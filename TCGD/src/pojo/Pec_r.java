package pojo;

import java.io.Serializable;

public class Pec_r implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	public Object bvalue;

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public Object getBvalue() {
		return bvalue;
	}

	public void setBvalue(Object bvalue) {
		this.bvalue = bvalue;
	}

}