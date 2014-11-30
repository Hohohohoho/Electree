package com.sgen.electree.data;

public class DeviceData {
	private int id;
	private boolean favor, cdt;
	private String dName, dIcon;	
	
	public DeviceData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeviceData(int id, boolean favor, boolean cdt, String dName,
			String dIcon) {
		super();
		this.id = id;
		this.favor = favor;
		this.cdt = cdt;
		this.dName = dName;
		this.dIcon = dIcon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFavor() {
		return favor;
	}

	public void setFavor(boolean favor) {
		this.favor = favor;
	}

	public boolean isCdt() {
		return cdt;
	}

	public void setCdt(boolean cdt) {
		this.cdt = cdt;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdIcon() {
		return dIcon;
	}

	public void setdIcon(String dIcon) {
		this.dIcon = dIcon;
	}
}
