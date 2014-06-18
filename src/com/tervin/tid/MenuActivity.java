package com.tervin.tid;

import com.example.tid.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {
	
	private Button btnRegTerm, btnUnreg, btnVisit;

	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
				
		btnRegTerm = (Button) findViewById(R.id.btnRegTerminal);
		btnRegTerm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnUnreg = (Button) findViewById(R.id.btnUnreg);
		btnUnreg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnVisit = (Button) findViewById(R.id.btnVisit);
		btnVisit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public void onResume() {
		
	}
}
