package ch.ethz.twimight.application;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import android.app.Application;

public class TwimightApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		// Create global configuration and initialize ImageLoader with this
		// configuration
		DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisc(true).build();
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext()).defaultDisplayImageOptions(options).build();
		ImageLoader.getInstance().init(config);
	}
}
