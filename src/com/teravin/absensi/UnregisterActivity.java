package com.teravin.absensi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UnregisterActivity extends Activity {

private Button btnUnregister;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.unregister);
		
		btnUnregister = (Button) findViewById(R.id.btnUnregister);
		btnUnregister.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
	}
}
