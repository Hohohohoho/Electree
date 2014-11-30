package com.sgen.electree;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RelativeLayout;

public class CheckableRelativeLayout extends RelativeLayout implements Checkable{ 
	
	// 이 클래스는 여러분이 건드릴게 하나뿐이에요.
	// 일단 이 클래스는 RelativeLayout을 상속받아서 checkbox가 원활히 작동하는 새로운 RelativeLayout을 만드는게 목적인데,
	// 다른건 인터넷에 있던 예제 그대로그, 바꿀 부분은
	
	final String NS = "http://schemas.android.com/apk/res/com.sgen.electree";
	// 요게 끝이에요!
	// *주의할점
	//  맨 뒤에 com.eos.checklist를 본인의 패키지명으로 고쳐주시면 되는데,
	//  이 클래스가 있는 패키지 말고!! gen의 R파일이 있는 패키지명을 써주셔야해요!
	
	final String ATTR = "checkable";
	// 그리고 이 부분때문에 res/values/attrs.xml이란 파일을 만들었어요.
	// 참고!
	
	// custom_view.xml 레이아웃 소스 보시면 여기서 만든 CheckableRelativeLayout을 참조하고 있는걸 확인할수있슴다!

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
