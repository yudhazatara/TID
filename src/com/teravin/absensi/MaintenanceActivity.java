package com.teravin.absensi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaintenanceActivity extends Activity {
	
	private Button btnMaintenance;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.maintenance);
		
		btnMaintenance = (Button) findViewById(R.id.btnMaintenance);
		btnMaintenance.setOnClickListener(new View.OnClickListener() {

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
