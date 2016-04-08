package com.example.mylist;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ImageTextListViewActivity extends Activity implements OnItemClickListener{

	public static final String[] names=new String[]{"name1","name2","name3"};
	
	public static final String [] locations=new String[]{"location1","location2","location3"};
	
	public static final Integer [] images={R.drawable.user1,R.drawable.user2,R.drawable.user3};
	
	public static final Double [] phones = new Double []{120.0,456.0,789.0};
	
	ListView listView;
	List<RowItem> rowItems;
	
	@Override
    public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rowItems = new ArrayList<RowItem>();
		
		for(int i=0;i<names.length;i++)
		{
			RowItem item = new RowItem(images[i], names[i], locations[i],phones[i]);
			
			rowItems.add(item);
		}
		
		listView = (ListView)findViewById(R.id.list);
		
		CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
		
	} //method
	@Override
	 public void onItemClick(AdapterView<?> parent, View view, int position,
	            long id) {
		Toast toast = Toast.makeText(getApplicationContext(), "Name :"+rowItems.get(position), Toast.LENGTH_LONG);
		//toast.setGravity(gravity, xOffset, yOffset)
		toast.show();
	}
	
}//class
