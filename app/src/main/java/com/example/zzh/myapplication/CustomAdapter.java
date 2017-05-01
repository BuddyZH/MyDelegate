package com.example.zzh.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.zzh.myapplication.Data.BaseViewHolder;
import com.example.zzh.myapplication.Item.BaseItem;
import com.example.zzh.myapplication.Item.ItemOne;
import com.example.zzh.myapplication.Item.ItemTwo;
import com.example.zzh.myapplication.Item.Types;

import java.util.ArrayList;

/**
 * Created by zzh on 2017/5/1.
 */

public class CustomAdapter extends RecyclerView.Adapter<BaseViewHolder> {

	private ArrayList<BaseItem> mItemList = new ArrayList<>();

	public CustomAdapter(ArrayList<BaseItem> itemList) {
		this.mItemList = itemList;
	}

	@Override
	public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		if (viewType == Types.TYPE_ONE) {
			BaseViewHolder holder = new ItemOne.ItemOneViewHolder(LayoutInflater.from(parent.getContext())
					.inflate(R.layout.item_one_view, parent, false));
			return holder;
		} else if (viewType == Types.TYPE_TWO) {
			BaseViewHolder holder = new ItemTwo.ItemTwoViewHolder(LayoutInflater.from(parent.getContext())
					.inflate(R.layout.item_two_view, parent, false));
			return holder;
		}
		return null;
	}

	@Override
	public void onBindViewHolder(BaseViewHolder holder, int position) {
		BaseItem baseItem = getItem(position);
		holder.onBind(baseItem);
	}

	@Override
	public int getItemViewType(int position) {
		BaseItem baseItem = getItem(position);
		if (baseItem != null) {
			return baseItem.getType();
		}
		return 0;
	 }

	@Override
	public int getItemCount() {
		return mItemList.size();
	}

	public BaseItem getItem(int i) {
		return (BaseItem) mItemList.get(i);
	}
}
