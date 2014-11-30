package com.sgen.electree.adapter;

import com.sgen.electree.R;
import com.sgen.electree.data.DeviceData;
import com.sgen.electree.data.DeviceList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

public class DeviceAdapter extends BaseAdapter {
	private Context context, baseContext;
	private DeviceList dataList;
	private LayoutInflater inflater;
	private ImageButton dIcon;
	private CheckBox favorCheck;
	private TextView dName;
	
	public DeviceAdapter(Context context, Context baseContext) {
		this.context = context;
		this.baseContext = baseContext;
		
		dataList = new DeviceList();
		
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getCount() {
		return dataList.deviceList.size();
	}

	@Override
	public DeviceData getItem(int position) {
		return dataList.deviceList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return dataList.deviceList.get(position).getId();
	}

	@Override
	public View getView(final int position, View v, final ViewGroup parent) {
		final DeviceData device = dataList.deviceList.get(position);
		
		View view = v;
		
		if(v == null){
			view = inflater.inflate(R.layout.custom_grid_device, null);
			
			view.setLayoutParams(new GridView.LayoutParams(getCellWidthDP(), getCellWidthDP() + getCellWidthDP()/3));
		} else {
			view = v;
		}
		
		if(device != null){
			dName = (TextView)view.findViewById(R.id.dName);
			dName.setText(device.getdName());
			dIcon = (ImageButton)view.findViewById(R.id.dIcon);
			
			String resName = "@drawable/" + "icon_" + device.getdIcon();
			String packName = baseContext.getPackageName(); // 패키지명
			int resId = baseContext.getResources().getIdentifier(resName, "drawable", packName);
			
			dIcon.setImageResource(resId);
			favorCheck = (CheckBox)view.findViewById(R.id.favor);
			favorCheck.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					if(device.isFavor())
						dataList.deviceList.get(position).setFavor(false);
					else
						dataList.deviceList.get(position).setFavor(true);
				}
			});
			favorCheck.setChecked(device.isFavor());
		}
		
		return view;
	}
	
	private int getCellWidthDP()
    {
        int width = context.getResources().getDisplayMetrics().widthPixels - 40;
        int cellWidth = width/3;
         
        return cellWidth;
    }
	
}
