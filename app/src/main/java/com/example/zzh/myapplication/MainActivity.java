package com.example.zzh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zzh.myapplication.Item.BaseItem;
import com.example.zzh.myapplication.Item.ItemOne;
import com.example.zzh.myapplication.Item.ItemTwo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	private RecyclerView mRecyclerview;
	private ArrayList<BaseItem> mData;

	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initData();

		mRecyclerview = (RecyclerView) findViewById(R.id.recyclerview);
		mRecyclerview.setLayoutManager(new LinearLayoutManager(this));
		mRecyclerview.setAdapter(new CustomAdapter(mData));
	}

	public void initData() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				mData.add(new ItemOne());
			} else {
				mData.add(new ItemTwo());
			}
		}
	}
}
