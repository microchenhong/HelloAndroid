// hello 2..
package com.isoftpark.helloviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryImageAdapter extends BaseAdapter {
	int mGalleryItemBackground;
	private Context mContext;
	
	private Integer[] mImageIds = {
			R.drawable.sample_0,
			R.drawable.sample_1,
			R.drawable.sample_2,
			R.drawable.sample_3,
			R.drawable.sample_4,
			R.drawable.sample_5,
			R.drawable.sample_6,
			R.drawable.sample_7,
	};
	
	public GalleryImageAdapter(Context c) {
		mContext = c;
		TypedArray attr = mContext.obtainStyledAttributes(R.styleable.HelloGallery);
		mGalleryItemBackground = attr.getResourceId(R.styleable.HelloGallery_android_galleryItemBackground, 0);
		attr.recycle();
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return mImageIds.length;
	}

	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView = new ImageView(mContext);
		
		imageView.setImageResource(mImageIds[position]);
		imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setBackgroundResource(mGalleryItemBackground);
		
		return imageView;
	}

}
