package com.teravin.absensi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TerminalActivation extends Activity {

	private EditText merchantID;
	private Button btnCheck, btnReg;
	private TextView name, location, merchantName, merchantLocation;
	
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.terminal_activation);
		
		merchantID = (EditText) findViewById(R.id.merchantID);
		btnCheck = (Button) findViewById(R.id.btnCheck);
		btnReg = (Button) findViewById(R.id.btnRegTerminal);
		name = (TextView) findViewById(R.id.name);
		location = (TextView) findViewById(R.id.location);
		merchantName = (TextView) findViewById(R.id.merchantName);
		merchantLocation =(TextView) findViewById(R.id.merchantLocation);
		
		changeView(View.VISIBLE);
		name.setVisibility(View.GONE);
		location.setVisibility(View.GONE);
		merchantName.setVisibility(View.GONE);
		merchantLocation.setVisibility(View.GONE);
		btnReg.setVisibility(View.GONE);
		btnCheck.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 btnCheck.setVisibility(View.GONE);
			}
		});
	}
	
	public void changeView(int view) {

        name.setVisibility(view);
        location.setVisibility(view);
        merchantName.setVisibility(view);
        merchantLocation.setVisibility(view);
        btnCheck.setVisibility(view);
        btnReg.setVisibility(view);
        
    }
}
