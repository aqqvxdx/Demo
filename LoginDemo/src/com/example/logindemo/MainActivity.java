package com.example.logindemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 Button login = (Button) findViewById(R.id.login);
		EditText userNameEditText = (EditText) findViewById(R.id.useName);
		EditText passwordEditText = (EditText) findViewById(R.id.password);
		final Editable userName = userNameEditText.getText();
		final Editable password = passwordEditText.getText();
		login.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if("1".equals(userName.toString()) && "1".equals(password.toString())){
					/*
					 SpannableString sbs=new SpannableString(text);
					  sbs.setSpan(new ClickableSpan() {
						@Override
						public void onClick(View widget) {
							Intent intent=new Intent(MainActivity.this,LoginSuccess.class);
							startActivity(intent);
						}
					}, 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						login.setText(sbs);
						login.setMovementMethod(LinkMovementMethod.getInstance());*/
						//Intent intent=new Intent(MainActivity.this,LoginSuccess.class);
						//startActivity(intent);
					//setContentView(R.layout.);
					Intent intent=new Intent(MainActivity.this,LoginSuccessActivity.class);
					startActivity(intent);
				}else{
					Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_LONG).show();
					Toast.makeText(MainActivity.this, password, Toast.LENGTH_LONG).show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
