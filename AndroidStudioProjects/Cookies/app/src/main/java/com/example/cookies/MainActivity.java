package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView beforeCookieImageVIew = (ImageView) findViewById ( R.id.android_cookie_image_view );
        beforeCookieImageVIew.setImageResource ( R.drawable.after_cookie );

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView statusTextView = (TextView) findViewById ( R.id.status_text_view );
        statusTextView.setText ( "I am so full!" );

    }
}