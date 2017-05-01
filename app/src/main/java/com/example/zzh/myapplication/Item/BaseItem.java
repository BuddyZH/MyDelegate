package com.example.zzh.myapplication.Item;

import android.view.View;
import android.widget.Toast;

import com.example.zzh.myapplication.UI.CustomButton;

/**
 * Created by zzh on 2017/5/1.
 */

public class BaseItem implements CustomButton.IDoSomethingDelegate {
	protected int type;

	public int getType() {
		return type;
	}

	@Override
	public void doSomething(View v) {
		Toast.makeText(v.getContext(), "you can do something here", Toast.LENGTH_SHORT).show();
	}
}
