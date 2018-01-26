package com.example.android.cookies;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        /**Find a reference to the ImageView in the layout. Change the image.*/
        ImageView afterCookieImage = (ImageView) findViewById(R.id.cookie_image_view);
        afterCookieImage.setImageResource(R.drawable.after_cookie);

        /**Find a reference to the TextView in the layout. Change the text*/
        TextView afterCookieText = (TextView) findViewById(R.id.status_text_view);
        afterCookieText.setText("I'm so full");
    }
}