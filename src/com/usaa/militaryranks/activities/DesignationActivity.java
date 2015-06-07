package com.usaa.militaryranks.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.usaa.militaryranks.R;
import com.usaa.militaryranks.adapters.DesignationAdapter;
import com.usaa.militaryranks.classes.Globals;

public class DesignationActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_designation);
		ListView listRankTypes = (ListView) findViewById(R.id.listRanks);
		DesignationAdapter adapter=new DesignationAdapter(DesignationActivity.this, Globals.defenceObj.getRanks());
		listRankTypes.setAdapter(adapter);
		listRankTypes.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> listView, View view, int position,
					long arg3) {
				Intent intent = new Intent(getBaseContext(), InformationActivity.class);
				Globals.rankObj=Globals.defenceObj.getRanks().get(position);
				startActivity(intent);
			}
		});
		}

}
