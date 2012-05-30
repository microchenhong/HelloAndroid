package com.android.demo.notepad2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NoteEdit extends Activity {

	private EditText mTitleText;
	private EditText mBodyText;
	private Long   mRowId;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.note_edit);
		setTitle(R.string.edit_note);
		mTitleText = (EditText) findViewById(R.id.title);
		mBodyText = (EditText) findViewById(R.id.body);
		
		Button confirmButton = (Button)findViewById(R.id.confirm);
		confirmButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle bundle = new Bundle();
				bundle.putString(NotesDbAdapter.KEY_TITLE, mTitleText.getText().toString());
				bundle.putString(NotesDbAdapter.KEY_BODY, mBodyText.getText().toString());
				if (mRowId != null) {
					bundle.putLong(NotesDbAdapter.KEY_ROWID, mRowId);
				}
				
				Intent intent = new Intent();
				intent.putExtras(bundle);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		
		mRowId = null;
		Bundle extra = getIntent().getExtras();
		if (extra != null) {
			String title = extra.getString(NotesDbAdapter.KEY_TITLE);
			String body = extra.getString(NotesDbAdapter.KEY_BODY);
			mRowId = extra.getLong(NotesDbAdapter.KEY_ROWID);
			
			if (title != null) {
				mTitleText.setText(title);
			}
			
			if (body != null) {
				mBodyText.setText(body);
			}
		}
	}

}
