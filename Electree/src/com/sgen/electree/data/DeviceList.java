package com.sgen.electree.data;

import java.util.ArrayList;

public class DeviceList {
	public ArrayList<DeviceData> deviceList;

	public DeviceList() {
		super();
		
		deviceList = new ArrayList<DeviceData>();
		
		deviceList.add(new DeviceData(0, false, false, "����̱�", "tob"));
		deviceList.add(new DeviceData(1, false, false, "��Ʈ��", "pc"));
		deviceList.add(new DeviceData(2, false, false, "����Ŀ", "music"));
		deviceList.add(new DeviceData(3, false, false, "���ӱ�", "card"));
	}
}
