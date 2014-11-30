package com.sgen.electree;

import com.sgen.electree.adapter.DeviceAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class Fragment3_Device extends Fragment {
	private GridView deviceGrid;
	private DeviceAdapter adapter;
	
	public Fragment3_Device() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment3_device, container, false);
		
		deviceGrid = (GridView)view.findViewById(R.id.deviceGrid);
		
		adapter = new DeviceAdapter(getActivity(), getActivity().getBaseContext());
		
		deviceGrid.setAdapter(adapter);
		
		
		
		return view;
	}
}
