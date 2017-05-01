package com.example.zzh.myapplication.Item;

import android.view.View;

import com.example.zzh.myapplication.Data.BaseViewHolder;
import com.example.zzh.myapplication.R;
import com.example.zzh.myapplication.UI.CustomButton;

/**
 * Created by zzh on 2017/5/1.
 */

public class ItemOne extends BaseItem {

	public ItemOne() {
		this.type = Types.TYPE_ONE;
	}


	public static class ItemOneViewHolder extends BaseViewHolder {

		public ItemOneViewHolder(View itemView) {
			super(itemView);
		}

		@Override
		public void onBind(BaseItem baseItem) {
			super.onBind(baseItem);
			CustomButton customButton = (CustomButton) itemView.findViewById(R.id.custom_button);
			customButton.setClickDelegate(baseItem);
		}
	}


}
