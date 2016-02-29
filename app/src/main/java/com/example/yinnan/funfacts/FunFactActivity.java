package com.example.yinnan.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactActivity extends AppCompatActivity {
    public static final String TAG = FunFactActivity.class.getSimpleName();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mView;
    private ColorBook mColorBook;
    private FactBook mFactBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        // assign variables
        mFactTextView = (TextView)findViewById(R.id.factTextView);
        mShowFactButton = (Button)findViewById(R.id.showFactButton);
        mView = (RelativeLayout) findViewById(R.id.background);
        mFactBook = new FactBook();
        mColorBook = new ColorBook();

        mShowFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFactTextView.setText(mFactBook.getFact());
                int color = mColorBook.getColor();
                mView.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        });

        //Toast.makeText(FunFactActivity.this, "Yay! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}
