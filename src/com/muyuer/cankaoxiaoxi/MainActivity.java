package com.muyuer.cankaoxiaoxi;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	private WebView webView;

	
   //public static final String PUBLISHER_ID = "56OJzM6IuNNrZ187s0";
   //public static final String FlexibleInlinePPID = "16TLmeuoApdfsNUGKipKCv_z";
	
	RelativeLayout mAdContainer;
	//DomobAdView mAdviewFlexibleAdView;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		
		webView = (WebView) findViewById(R.id.news_webview);
		
		webView.getSettings().setJavaScriptEnabled(true);
		//webView.getSettings().setBlockNetworkImage(true);
		webView.loadUrl("http://m.cankaoxiaoxi.com/");
		webView.setWebViewClient(new HelloWebViewClient());
		
		
		
		
		/*
		mAdContainer = (RelativeLayout) findViewById(R.id.adcontainer);
	
		// Create ad view
		mAdviewFlexibleAdView = new DomobAdView(this, MainActivity.PUBLISHER_ID, MainActivity.FlexibleInlinePPID, DomobAdView.INLINE_SIZE_FLEXIBLE);
		mAdviewFlexibleAdView.setAdEventListener(new DomobAdEventListener() {
						
			@Override
			public void onDomobAdReturned(DomobAdView adView) {
				Log.i("DomobSDKDemo", "onDomobAdReturned");				
			}

			@Override
			public void onDomobAdOverlayPresented(DomobAdView adView) {
				Log.i("DomobSDKDemo", "overlayPresented");
			}

			@Override
			public void onDomobAdOverlayDismissed(DomobAdView adView) {
				Log.i("DomobSDKDemo", "Overrided be dismissed");				
			}

			@Override
			public void onDomobAdClicked(DomobAdView arg0) {
				Log.i("DomobSDKDemo", "onDomobAdClicked");				
			}

			@Override
			public void onDomobAdFailed(DomobAdView arg0, ErrorCode arg1) {
				Log.i("DomobSDKDemo", "onDomobAdFailed");				
			}

			@Override
			public void onDomobLeaveApplication(DomobAdView arg0) {
				Log.i("DomobSDKDemo", "onDomobLeaveApplication");				
			}

			@Override
			public Context onDomobAdRequiresCurrentContext() {
				return MainActivity.this;
			}
		});
		
		mAdContainer.addView(mAdviewFlexibleAdView);
		*/

	}
	


	  private class HelloWebViewClient extends WebViewClient {
          @Override
          public boolean shouldOverrideUrlLoading(WebView view, String url) {
                  view.loadUrl(url);
                  return true;
          }
	  }
 
          public boolean onKeyDown(int keyCode, KeyEvent event) {       
              if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {       
            	  webView.goBack();       
                         return true;       
              }       
              return super.onKeyDown(keyCode, event);       
          }   
	  
	  
}
  

