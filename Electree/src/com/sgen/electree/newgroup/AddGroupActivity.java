package com.sgen.electree.newgroup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.sgen.electree.R;

public class AddGroupActivity extends Activity {
	Button addAlert;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_group);
		
		addAlert = (Button)findViewById(R.id.addGroupBtn);
        addAlert.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getBaseContext(), NewGroupResultActivity.class));
			}
		});
	}
}
