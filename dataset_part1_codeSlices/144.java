Triggering condition: handling a large image
Consequence: app crash

Below is the IID issue's code slice:	
//------------------------------code slice-----------------------------------------------
protected void onCreate(Bundle icicle) {
if (!mHasBackground)
findViewById(R.id.RootView).setBackgroundResource(R.drawable.csbackground);//The functional module of image decoding+displaying      buggy code
