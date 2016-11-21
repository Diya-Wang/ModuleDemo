package com.diya.modulea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author Diya Wang
 * @Title: ModuleDemo
 * @Package com.diya.modulea
 * @Description:
 * @date 2016/11/18 15:15
 */
public class MainActivityModuleA extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Toast.makeText(MainActivityModuleA.this,"test",0).show();
					Intent intent = new Intent();
					Class clazz = Class.forName("com.diya.moduleb.ActivityModuleB");
					intent.setClass(MainActivityModuleA.this, clazz);
					startActivity(intent);
				} catch (ClassNotFoundException e) {
				}
			}
		});
	}
}
