package com.slidingmenu.example;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SampleListFragment extends ListFragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list, null);
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		SampleAdapter adapter = new SampleAdapter(getActivity());
		//for (int i = 0; i < 5; i++) {
<<<<<<< HEAD
			adapter.add(new SampleItem("�T��", R.drawable.ic_message));
			adapter.add(new SampleItem("�D�ʰӫ~", R.drawable.ic_shopping));
			adapter.add(new SampleItem("�x�D�D��", R.drawable.ic_hlepbuy));
			adapter.add(new SampleItem("�ӫ~����", R.drawable.ic_shoppingcar));			
			adapter.add(new SampleItem("�n�X", R.drawable.ic_logout));
			adapter.add(new SampleItem("�j�M", R.drawable.ic_search));
=======
			adapter.add(new SampleItem("�D�ʰӫ~", R.drawable.logo));
			adapter.add(new SampleItem("�x�D�D��", R.drawable.logo));
			adapter.add(new SampleItem("�ӫ~����", R.drawable.logo));			
			adapter.add(new SampleItem("�n�X", R.drawable.logo));
			adapter.add(new SampleItem("�j�M", android.R.drawable.ic_menu_search));
>>>>>>> 8a5e5307ce0ac1146797033c41e9889b93665bd7
			

		//}
		setListAdapter(adapter);
	}

	private class SampleItem {
		public String tag;
		public int iconRes;
		public SampleItem(String tag, int iconRes) {
			this.tag = tag; 
			this.iconRes = iconRes;
		}
	}

	public class SampleAdapter extends ArrayAdapter<SampleItem> {

		public SampleAdapter(Context context) {
			super(context, 0);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = LayoutInflater.from(getContext()).inflate(R.layout.row, null);
			}
			ImageView icon = (ImageView) convertView.findViewById(R.id.row_icon);
			icon.setImageResource(getItem(position).iconRes);
			TextView title = (TextView) convertView.findViewById(R.id.row_title);
			title.setText(getItem(position).tag);

			return convertView;
		}

		protected void setContentView(int contentFrame) {
			// TODO Auto-generated method stub
			
		}

	}
}
