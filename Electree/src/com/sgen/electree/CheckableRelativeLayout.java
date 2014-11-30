package com.sgen.electree;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RelativeLayout;

public class CheckableRelativeLayout extends RelativeLayout implements Checkable{ 
	
	// �� Ŭ������ �������� �ǵ帱�� �ϳ����̿���.
	// �ϴ� �� Ŭ������ RelativeLayout�� ��ӹ޾Ƽ� checkbox�� ��Ȱ�� �۵��ϴ� ���ο� RelativeLayout�� ����°� �����ε�,
	// �ٸ��� ���ͳݿ� �ִ� ���� �״�α�, �ٲ� �κ���
	
	final String NS = "http://schemas.android.com/apk/res/com.sgen.electree";
	// ��� ���̿���!
	// *��������
	//  �� �ڿ� com.eos.checklist�� ������ ��Ű�������� �����ֽø� �Ǵµ�,
	//  �� Ŭ������ �ִ� ��Ű�� ����!! gen�� R������ �ִ� ��Ű������ ���ּž��ؿ�!
	
	final String ATTR = "checkable";
	// �׸��� �� �κж����� res/values/attrs.xml�̶� ������ ��������.
	// ����!
	
	// custom_view.xml ���̾ƿ� �ҽ� ���ø� ���⼭ ���� CheckableRelativeLayout�� �����ϰ� �ִ°� Ȯ���Ҽ��ֽ���!

	int checkableId;
	Checkable checkable;

	public CheckableRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		checkableId = attrs.getAttributeResourceValue(NS, ATTR, 0);
	}
	
	@Override
	public boolean isChecked() {
		checkable = (Checkable) findViewById(checkableId);
		if(checkable == null)
			return false;
		return checkable.isChecked();
	}

	@Override
	public void setChecked(boolean checked) {
		checkable = (Checkable) findViewById(checkableId);
		if(checkable == null)
			return;
		checkable.setChecked(checked);
	}

	@Override
	public void toggle() {
		checkable = (Checkable) findViewById(checkableId);
		if(checkable == null)
			return;
		checkable.toggle();
	}
}
