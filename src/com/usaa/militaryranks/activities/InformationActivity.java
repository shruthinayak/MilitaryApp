package com.usaa.militaryranks.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.usaa.militaryranks.R;
import com.usaa.militaryranks.classes.Globals;
import com.usaa.militaryranks.classes.Ranks;

public class InformationActivity extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_rank_info);
	TextView title = (TextView) findViewById(R.id.txtTitle);
	TextView payGrade = (TextView) findViewById(R.id.txtPayGrade);
	TextView abbreviation = (TextView) findViewById(R.id.txtAbbreviation);
	TextView defenceType = (TextView) findViewById(R.id.txtTitleDefence);
	Ranks rankObj = Globals.rankObj;
	ImageView icon = (ImageView) findViewById(R.id.imgRank);
	defenceType.setText(Globals.defenceObj.getName());
	title.setText(rankObj.getTitle());
	payGrade.setText(rankObj.getPayGrade());
	abbreviation.setText(rankObj.getAbbreviation());
	Picasso.with(getApplicationContext()).load(rankObj.getInsigniaImageHD()).into(icon);
}
}
