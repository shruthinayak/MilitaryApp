package com.usaa.militaryranks.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.usaa.militaryranks.R;
import com.usaa.militaryranks.classes.Defence;

public class ListAdapter extends BaseAdapter {
	  private final Context context;
	  private final List<Defence> values;

	  public ListAdapter(Context context, List<Defence> values) {
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.activity_info_leg, parent, false);
	    TextView textView = (TextView) rowView.findViewById(R.id.txtDefenceType);
	    ImageView imageView = (ImageView) rowView.findViewById(R.id.imgBranch);
	    textView.setText(values.get(position).getName());
	    Picasso.with(context).load(values.get(position).getLogo()).into(imageView);

	    return rowView;
	  }

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return values.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return values.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	} 
