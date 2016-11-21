package com.diya.moduledemo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	public static final String ACTIVITY_MODEA= "com.diya.modulea.ActivityModuleA";
	private Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		context = MainActivity.this;

		findViewById(com.diya.modulea.R.id.bt1).setOnClickListener(new View.OnClickListener() {
			@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
			@Override
			public void onClick(View v) {
				try {
					Intent intent = new Intent();
					Class clazz = Class.forName(ACTIVITY_MODEA);
					intent.setClass(context,clazz);
					startActivity(intent);
				} catch (ClassNotFoundException e) {
					throw new RuntimeException(e);
				}
//				Intent intent =new Intent(MainActivity.this,ActivityModuleA.class);
//				startActivity(intent);
			}
		});
		PackageManager manager = this.getPackageManager();

		try {
			PackageInfo info = manager.getPackageInfo(this.getPackageName(),0);
			System.out.println(info.versionName + "|" +info.packageName );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
