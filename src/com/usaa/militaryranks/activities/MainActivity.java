package com.usaa.militaryranks.activities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings.Global;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.usaa.militaryranks.R;
import com.usaa.militaryranks.adapters.ListAdapter;
import com.usaa.militaryranks.classes.Defence;
import com.usaa.militaryranks.classes.Globals;
import com.usaa.militaryranks.classes.Top;

public class MainActivity extends Activity {
	private static final String LOGTAG = "Filter";
	private static Gson gson = new Gson();
	private static Top root;
	String[] defenceTypes = {"Army","Marines","Air Force","Navy","Coast Guard"};
	List<Defence> defenceObjs=new ArrayList<Defence>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		parseJsonAndPopulateObject();
		ListView listDefenceTypes = (ListView) findViewById(R.id.listDefenceTypes);
		defenceObjs.add(root.getArmy());
		defenceObjs.add(root.getMarines());
		defenceObjs.add(root.getNavy());
		defenceObjs.add(root.getAirForce());
		defenceObjs.add(root.getCoastGuard());
		ListAdapter adapter=new ListAdapter(MainActivity.this, defenceObjs);
		listDefenceTypes.setAdapter(adapter);
		listDefenceTypes.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> listView, View view, int position,
					long arg3) {
				Intent intent = new Intent(getBaseContext(), DesignationActivity.class);
				Globals.defenceObj=defenceObjs.get(position);
				startActivity(intent);
			}
		});
		}
	private void parseJsonAndPopulateObject() {
		try {
			InputStream rankJson = getAssets().open("ranks.json");
			BufferedReader in = new BufferedReader(new InputStreamReader(
					rankJson, "UTF-8"));
			StringBuilder buf = new StringBuilder();
			String str;
			while ((str = in.readLine()) != null) {
				buf.append(str);
			}
			in.close();
			root = gson.fromJson(buf.toString(), Top.class);
			root.getArmy().setName("Army");
			root.getNavy().setName("Navy");
			root.getAirForce().setName("Air Force");
			root.getCoastGuard().setName("Coast Guard");
			root.getMarines().setName("Marines");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Toast.makeText(this, "Couldn't load file. Try again!",
					Toast.LENGTH_LONG).show();
		}
	}

}
