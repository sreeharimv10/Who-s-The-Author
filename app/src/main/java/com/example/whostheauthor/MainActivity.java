package com.example.whostheauthor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText mBookInput;
    private TextView mTitletext, mAuthorText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBookInput  = (EditText) findViewById(R.id.book)      ;
        mTitletext  = (TextView) findViewById(R.id.titletext) ;
        mAuthorText = (TextView) findViewById(R.id.authortext);
    }

    public void searchBooks(View view)
    {
        String queryString = mBookInput.getText().toString();

        new FetchBook(mTitletext,mAuthorText).execute(queryString);

    }
}