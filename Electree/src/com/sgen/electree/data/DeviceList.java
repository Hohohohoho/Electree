package com.sgen.electree.data;

import java.util.ArrayList;

public class DeviceList {
	public ArrayList<DeviceData> deviceList;

	public DeviceList() {
		super();
		
		deviceList = new ArrayList<DeviceData>();
		
		deviceList.add(new DeviceData(0, false, false, "드라이기", "tob"));
		deviceList.add(new DeviceData(1, false, false, "노트북", "pc"));
		deviceList.add(new DeviceData(2, false, false, "스피커", "music"));
		deviceList.add(new DeviceData(3, false, false, "게임기", "card"));
	}
}
