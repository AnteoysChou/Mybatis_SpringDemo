package com.tianj.demo.common.entity;
//ͨ��ʵ���࣬��Ӧ�����ݱ�
import java.sql.Date;

public class Employee {

	private Integer ID;

	private String xm; // ����
	
	private String num;//���

	public Integer getBh() {
		return ID;
	}

	public void setBh(Integer bh) {
		this.ID = bh;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
    
	@Override
    public String toString() {
        return "Employee [xm=" + xm + ", num=" + num +"]";
	}

}
