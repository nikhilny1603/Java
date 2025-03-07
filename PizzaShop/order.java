package com.dkte.pizzaShop.entities;

public class order {
	private int oid;
	private int cid;
	private int mid;
	
	public order()
	{
		
	}

	public order(int oid, int cid, int mid) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.mid = mid;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "order [oid=" + oid + ", cid=" + cid + ", mid=" + mid + "]";
	}
	
	

}
