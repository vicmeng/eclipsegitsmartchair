package org.mybatis.entity;

public class personcard {
	private int cardid;
	private String info;
	
	
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "personcard [cardid=" + cardid + ", info=" + info + "]";
	}
	
}
