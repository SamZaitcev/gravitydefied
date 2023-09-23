package org.happysanta.gd.Menu.Views;

import static org.happysanta.gd.Helpers.runOnUiThread;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;

public class MenuImageView extends AppCompatImageView {

	public MenuImageView(Context context) {
		super(context);
	}

	@Override
	public void setImageResource(final int resid) {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				MenuImageView.super.setImageResource(resid);
			}
		});
	}

	@Override
	public void setVisibility(final int visibility) {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				MenuImageView.super.setVisibility(visibility);
			}
		});
	}

}
