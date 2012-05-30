package com.isoftpark.hellolocalization;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloLocalizationActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button flagButton = (Button)findViewById(R.id.flag_button);
        flagButton.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.flag1));
        
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.dialog_text)
        .setCancelable(false)
        .setTitle(R.string.dialog_title)
        .setPositiveButton("Done", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
        
        final AlertDialog alert = builder.create();
        
        // set click listener on the flag to show the dialog box
        flagButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				alert.show();
			}
		});
    }
}