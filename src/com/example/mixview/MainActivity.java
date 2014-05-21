package com.example.mixview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    
    int[] images = new int[] {
            R.drawable.java,
            R.drawable.ee,
            R.drawable.classic,
            R.drawable.ajax,
            R.drawable.xml,
    };
    
    int currentImg = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.root);

        final ImageView imageView = new ImageView(this);
        imageView.setImageResource(images[0]);
        imageView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        imageView.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                imageView.setImageResource(images[++currentImg % images.length]);
            }
        });
        layout.addView(imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
