package com.example.zzh.myapplication.UI;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zzh on 2017/5/1.
 */

public class CustomButton extends android.support.v7.widget.AppCompatButton {
	public CustomButton(Context context) {
		super(context);
		initView();
	}

	public CustomButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initView();
	}

	public interface IDoSomethingDelegate {
		void doSomething(View v);
	}

	private IDoSomethingDelegate doSomethingDelegate;
	public void setClickDelegate(IDoSomethingDelegate delegate) {
		this.doSomethingDelegate = delegate;
	}

	public void initView() {
		this.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (doSomethingDelegate != null) {
					doSomethingDelegate.doSomething(v);
				}
			}
		});
	}

}
