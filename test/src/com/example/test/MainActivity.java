package com.example.test;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
	Button addAlert;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addAlert = (Button)findViewById(R.id.loginBtn);
        addAlert.setOnClickListener(this);
    }

	@Override
	public void onClick(View view) {
		if (view == addAlert) {
			new AlertDialog.Builder(this)
			.setMessage("�׷��� �߰�/���� �Ͻðڽ��ϱ�?")
			.setCancelable(true)
			.setPositiveButton("�׷� �߰�",
			new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.setNeutralButton("�׷� ����", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.create().show();
		}
		
	}
}
