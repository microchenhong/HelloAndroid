package com.isoftpark.helloviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.Toast;


/*
public class HelloViewsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Linear Layout
        //setContentView(R.layout.mylinearlayout);
        
        // Table Layout
        //setContentView(R.layout.mytablelayout);
    
        // +++ Grid Layout +++
        setContentView(R.layout.mygridlayout);
        
        GridView gridView = (GridView)findViewById(R.id.gridview1);
        gridView.setAdapter(new ImageAdapter(this));
        
        gridView.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
        		Toast.makeText(HelloViewsActivity.this, "" + pos,	Toast.LENGTH_SHORT).show();
        	}
        });
        
        // --- Grid Layout ---
        

    }
}
*/

/*
public class HelloViewsActivity extends TabActivity {
    // Called when the activity is first created. 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // +++ Tab Layout +++
        
        setContentView(R.layout.mytabslayout);
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();	// The activity TabHost
        TabHost.TabSpec spec; // Reusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab
        
        // Create an Intent to launch an Activity for the tab (to be resued)
        intent = new Intent().setClass(this, ArtistsActivity.class);
        
        // Init a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("artists").setIndicator("Artists",
        		res.getDrawable(R.drawable.ic_tab_artists)).setContent(intent);

        tabHost.addTab(spec);
        
        // Do the same for the other tabs
        intent = new Intent().setClass(this, AlbumsActivity.class);
        spec = tabHost.newTabSpec("albums").setIndicator("Albums", 
        		res.getDrawable(R.drawable.ic_tab_artists)).setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, SongsActivity.class);
        spec = tabHost.newTabSpec("songs").setIndicator("Songs", 
        		res.getDrawable(R.drawable.ic_tab_artists)).setContent(intent);
        tabHost.addTab(spec);
        
        tabHost.setCurrentTab(2);
        
        // --- Tab Layout ---
    }
}
*/

/*
public class HelloViewsActivity extends ListActivity {
	//@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	 
	  setListAdapter(new ArrayAdapter<String>(this, R.layout.my_list_item, COUNTRIES));
	  ListView lv = getListView();
	  lv.setTextFilterEnabled(true);
	  lv.setOnItemClickListener(new OnItemClickListener() {
		  public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
			  // When clicked, show a toast with the TextView text
			  Toast.makeText(getApplicationContext(), ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
		  }
	  });
	}
	
	static final String[] COUNTRIES = new String[] {
	    "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
	    "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
	    "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
	    "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
	    "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
	    "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory",
	    "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi",
	    "Cote d'Ivoire", "Cambodia", "Cameroon", "Canada", "Cape Verde",
	    "Cayman Islands", "Central African Republic", "Chad", "Chile", "China",
	    "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo",
	    "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic",
	    "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic",
	    "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
	    "Estonia", "Ethiopia", "Faeroe Islands", "Falkland Islands", "Fiji", "Finland",
	    "Former Yugoslav Republic of Macedonia", "France", "French Guiana", "French Polynesia",
	    "French Southern Territories", "Gabon", "Georgia", "Germany", "Ghana", "Gibraltar",
	    "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau",
	    "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong", "Hungary",
	    "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica",
	    "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos",
	    "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg",
	    "Macau", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands",
	    "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova",
	    "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia",
	    "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand",
	    "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "Northern Marianas",
	    "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru",
	    "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar",
	    "Reunion", "Romania", "Russia", "Rwanda", "Sqo Tome and Principe", "Saint Helena",
	    "Saint Kitts and Nevis", "Saint Lucia", "Saint Pierre and Miquelon",
	    "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Saudi Arabia", "Senegal",
	    "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands",
	    "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Korea",
	    "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden",
	    "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "The Bahamas",
	    "The Gambia", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey",
	    "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Virgin Islands", "Uganda",
	    "Ukraine", "United Arab Emirates", "United Kingdom",
	    "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan",
	    "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Wallis and Futuna", "Western Sahara",
	    "Yemen", "Yugoslavia", "Zambia", "Zimbabwe"
	  };
}
*/

/*
public class HelloViewsActivity extends Activity {
	//@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.my_date_picker);
	  
	  // Capture our View elements
	  mDateDisplay = (TextView)findViewById(R.id.dateDisplay1);
	  mPickDate = (Button)findViewById(R.id.pickDate1);
	  mTimeDisplay = (TextView)findViewById(R.id.timeDisplay1);
	  mPickTime = (Button)findViewById(R.id.pickTime1);
	  
	  // Add a click listener
	  mPickDate.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showDialog(DATE_DIALOG_ID);
			}
	  	});
	  
	  mPickTime.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showDialog(TIME_DIALOG_ID);
		}
	  });
	  
	  	// Get the current date
	  	final Calendar c = Calendar.getInstance();
	  	mYear = c.get(Calendar.YEAR);
	  	mMonth = c.get(Calendar.MONDAY);
	  	mDay = c.get(Calendar.DAY_OF_MONTH);
	    mHour = c.get(Calendar.HOUR_OF_DAY);
	    mMinute = c.get(Calendar.MINUTE);
	    
	  	// Display the current date (this method is blow)
	  	updateDisplay();
	}
	
	// Update the date in the TextView
	private void updateDisplay() {
		mDateDisplay.setText(
				new StringBuilder().append(mMonth + 1).append("-")
				.append(mDay).append("-")
				.append(mYear).append(" ")
				);
		
		mTimeDisplay.setText(new StringBuilder()
				.append(mHour).append(":")
				.append(mMinute).append(" "));
		
	}
	
	// The callback recieved when the user "sets" the date in the dialog
	private DatePickerDialog.OnDateSetListener mDateSetListener = 
			new DatePickerDialog.OnDateSetListener() {
				
				public void onDateSet(DatePicker view, int year, int monthOfYear,
						int dayOfMonth) {
					// TODO Auto-generated method stub
					mYear = year;
					mMonth = monthOfYear;
					mDay = dayOfMonth;
					updateDisplay();
				}
			};
			
	// The callback recived when the user "sets" the time in the dialog
	private TimePickerDialog.OnTimeSetListener mTimeSetListener = 
			new TimePickerDialog.OnTimeSetListener() {
		
				public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
					// TODO Auto-generated method stub
					mHour = hourOfDay;
					mMinute = minute;
					updateDisplay();
				}
			};
			
	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:
			return new DatePickerDialog(this, mDateSetListener, mYear, mMonth, mDay);
	
		case TIME_DIALOG_ID:
			return new TimePickerDialog(this, mTimeSetListener, mHour, mMinute, true);
		}
		
		return null;
	}
	
	private TextView mDateDisplay;
	private TextView mTimeDisplay;
	private Button mPickDate;
	private Button mPickTime;
	private int mYear;
	private int mMonth;
	private int mDay;
	private int mHour;
	private int mMinute;
	static final int DATE_DIALOG_ID = 110;
	static final int TIME_DIALOG_ID = 112;
}
*/

/*
public class HelloViewsActivity extends Activity {
	//@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.my_form_stuff);
	  
	  final EditText edit = (EditText)findViewById(R.id.editText1);
	  edit.setOnKeyListener(new OnKeyListener() {
		
		public boolean onKey(View v, int keyCode, KeyEvent event) {
			// TODO Auto-generated method stub
			// If the event is a key-down event on the "enter" button
			if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
				(keyCode == KeyEvent.KEYCODE_ENTER)) {
				// Perform action on key press
				Toast.makeText(getApplicationContext(), "my--" + edit.getText(), Toast.LENGTH_LONG).show();
				return  true;
			}
			return false;
		}
	});
	  
	  // RatingBar
	  final RatingBar rb = (RatingBar) findViewById(R.id.ratingButton1);
	  rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
		
		public void onRatingChanged(RatingBar ratingBar, float rating,
				boolean fromUser) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "New Rating:" + rating, Toast.LENGTH_SHORT).show();
			
		}
	  });
	  
	  // Spinner 
	  Spinner spinner = (Spinner)findViewById(R.id.spinner1);
	  ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, 
			  R.array.planets_array, android.R.layout.simple_spinner_item);
	  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	  spinner.setAdapter(adapter);
	  spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
		  public void onItemSelected(AdapterView<?> parent,
				  View v, int pos, long id) {
			  Toast.makeText(getApplicationContext(), "The planet is " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
		  }
		  
		  public void onNothingSelected(AdapterView<?> parent) {
			  // Do nothing.
		  }
	  });
	  
	  // Auto-complete 
	  AutoCompleteTextView autoTextView = (AutoCompleteTextView)findViewById(R.id.autocomplete_country);
	  ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.my_list_item, COUNTRIES);
	  autoTextView.setAdapter(adapter1);
	}
	
	public void onButtonAndroidClicked(View v) {
		Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_LONG).show();
	}
	
	public void onCheckBoxClicked(View v) {
		if (((CheckBox)v).isChecked()) {
			Toast.makeText(getApplicationContext(), "Selected", Toast.LENGTH_SHORT).show();
		}
		else {
			Toast.makeText(getApplicationContext(), "Un-Selected", Toast.LENGTH_SHORT).show();
		}
	}
	
	public void	onRadioButtonClicked(View v) {
		RadioButton rb = (RadioButton)v;
		Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
	}
	
	public void onToggleButtonClicked(View v) {
		ToggleButton tb = (ToggleButton)v;
		Toast.makeText(this, tb.getText(), Toast.LENGTH_SHORT).show();
	}
	
	static final String[] COUNTRIES = new String[] {
		  "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
		  "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
		  "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
		  "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
		  "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
		  "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory",
		  "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi",
		  "Cote d'Ivoire", "Cambodia", "Cameroon", "Canada", "Cape Verde",
		  "Cayman Islands", "Central African Republic", "Chad", "Chile", "China",
		  "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo",
		  "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic",
		  "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic",
		  "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
		  "Estonia", "Ethiopia", "Faeroe Islands", "Falkland Islands", "Fiji", "Finland",
		  "Former Yugoslav Republic of Macedonia", "France", "French Guiana", "French Polynesia",
		  "French Southern Territories", "Gabon", "Georgia", "Germany", "Ghana", "Gibraltar",
		  "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau",
		  "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong", "Hungary",
		  "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica",
		  "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos",
		  "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg",
		  "Macau", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands",
		  "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova",
		  "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia",
		  "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand",
		  "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "Northern Marianas",
		  "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru",
		  "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar",
		  "Reunion", "Romania", "Russia", "Rwanda", "Sqo Tome and Principe", "Saint Helena",
		  "Saint Kitts and Nevis", "Saint Lucia", "Saint Pierre and Miquelon",
		  "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Saudi Arabia", "Senegal",
		  "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands",
		  "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Korea",
		  "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden",
		  "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "The Bahamas",
		  "The Gambia", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey",
		  "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Virgin Islands", "Uganda",
		  "Ukraine", "United Arab Emirates", "United Kingdom",
		  "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan",
		  "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Wallis and Futuna", "Western Sahara",
		  "Yemen", "Yugoslavia", "Zambia", "Zimbabwe"
		};
}
*/

/*
public class HelloViewsActivity extends Activity {
	//@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.my_gallery);
	  Gallery gallery = (Gallery)findViewById(R.id.gallery1);
	  gallery.setAdapter(new GalleryImageAdapter(this));
	  
	  gallery.setOnItemClickListener(new OnItemClickListener() {
	  	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
          Toast.makeText(HelloViewsActivity.this, "" + position, Toast.LENGTH_SHORT).show();
	  	}
	  });
	  
	  
	  
	}
}
*/

public class HelloViewsActivity extends Activity {
	//@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.my_webview);
	  
	  WebView webview = (WebView)findViewById(R.id.webview1);
	  webview.getSettings().setJavaScriptEnabled(true);
	  webview.loadUrl("http://google.com");

	  
	  
	  
	}
}
