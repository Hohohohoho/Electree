package com.sgen.electree;

import com.sgen.electree.newgroup.AddGroupActivity;
import com.sgen.electree.newgroup.MakeGroupActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity implements View.OnClickListener {
	Button addAlert;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        
        addAlert = (Button)findViewById(R.id.loginBtn);
        addAlert.setOnClickListener(this);
    }

	@Override
	public void onClick(View view) {
		if (view == addAlert) {
			new AlertDialog.Builder(this)
			.setMessage("그룹을 추가/생성 하시겠습니까?")
			.setCancelable(true)
			.setPositiveButton("그룹 추가", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					startActivity(new Intent(getBaseContext(), AddGroupActivity.class));
				}
			})
			.setNeutralButton("그룹 생성", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					startActivity(new Intent(getBaseContext(), MakeGroupActivity.class));
				}
			})
			.create().show();
		}
		
	}
}