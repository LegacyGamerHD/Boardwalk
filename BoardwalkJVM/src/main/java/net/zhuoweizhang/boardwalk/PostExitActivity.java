package net.zhuoweizhang.boardwalk;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;

public class PostExitActivity extends Activity {

	private ProgressBar progressBar;
	public static boolean doLaunch = false;

	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		//这个类曾经包含一个谷歌广告方法
        //如今被我移除了
        //所以实际上这里的代码是不必要单独存放于一个类中
        //请在之后的更新中将launch()方法移动至LaunchMinecraftTask类中
		if (doLaunch) {
			launch();
			doLaunch = false;
		}
	}


	private void launch() {
		startActivityForResult(new Intent(this, MainActivity.class), 1234);
	}
}
