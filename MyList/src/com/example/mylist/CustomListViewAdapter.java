package com.example.mylist;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends ArrayAdapter<RowItem>{

	Context context;
	public CustomListViewAdapter(Context context, int resourceId,
			List<RowItem> items) {
		super(context, resourceId, items);
		this.context=context;
		// TODO Auto-generated constructor stub
	}
	
	private class ViewHolder{
		ImageView img;
		TextView name;
		TextView lctn;
		TextView phone;
	}


public View getView(int position, View convertView, ViewGroup parent)
{
	ViewHolder holder = null;
	RowItem rowItem =getItem(position);
	
	LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
	if(convertView==null)
	{
		convertView=mInflater.inflate(R.layout.list_item, null);
		holder = new ViewHolder();
		holder.img=(ImageView)convertView.findViewById(R.id.myicon);
		holder.name=(TextView)convertView.findViewById(R.id.name);
		holder.lctn=(TextView)convertView.findViewById(R.id.lctn);
		holder.phone=(TextView)convertView.findViewById(R.id.phone);
		
		convertView.setTag(holder);
	}
	else
	holder = (ViewHolder)convertView.getTag();
	
	holder.lctn.setText(rowItem.getLocation());
	holder.name.setText(rowItem.getName());
	holder.phone.setText(Double.toString(rowItem.getPhone()));
	return convertView;
}

	
}

