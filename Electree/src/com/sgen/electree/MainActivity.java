package com.sgen.electree;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements OnClickListener {
	
	private int NUM_PAGES = 5;
	
	public final static int FRAGMENT1_HOME = 0;
	public final static int FRAGMENT2_GROUP = 1;
	public final static int FRAGMENT3_DEVICE = 2;
	public final static int FRAGMENT4_STATICS = 3;
	public final static int FRAGMENT5_ACCOUNT = 4;
	
	private ViewPager viewPager;
	
	private Button homeBtn, groupBtn, deviceBtn, statBtn, accBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		viewPager = (ViewPager)findViewById(R.id.pager);
		viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
		viewPager.setCurrentItem(FRAGMENT1_HOME);
		
		homeBtn = (Button)findViewById(R.id.home_btn);
		groupBtn = (Button)findViewById(R.id.group_btn);
		deviceBtn = (Button)findViewById(R.id.device_btn);
		statBtn = (Button)findViewById(R.id.stat_btn);
		accBtn = (Button)findViewById(R.id.acc_btn);
		
		homeBtn.setOnClickListener(this);
		groupBtn.setOnClickListener(this);
		deviceBtn.setOnClickListener(this);
		statBtn.setOnClickListener(this);
		accBtn.setOnClickListener(this);		
	}
	
	private class pagerAdapter extends FragmentPagerAdapter{

		public pagerAdapter(android.support.v4.app.FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			switch(position){
				case FRAGMENT1_HOME:
					return new Fragment1_Home();
				case FRAGMENT2_GROUP:
					return new Fragment2_Group();
				case FRAGMENT3_DEVICE:
					return new Fragment3_Device();
				case FRAGMENT4_STATICS:
					return new Fragment4_Statics();
				case FRAGMENT5_ACCOUNT:
					return new Fragment5_Account();
				default:
					return null;
			}
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return NUM_PAGES;
		}
		
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.home_btn:
				viewPager.setCurrentItem(FRAGMENT1_HOME);
				break;
			case R.id.group_btn:
				viewPager.setCurrentItem(FRAGMENT2_GROUP);
				break;
			case R.id.device_btn:
				viewPager.setCurrentItem(FRAGMENT3_DEVICE);
				break;
			case R.id.stat_btn:
				viewPager.setCurrentItem(FRAGMENT4_STATICS);
				break;
			case R.id.acc_btn:
				viewPager.setCurrentItem(FRAGMENT5_ACCOUNT);
				break;
		}
	}
}
