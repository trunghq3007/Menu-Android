package com.example.admin.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                break;
        }

        return super.onTouchEvent(event);


    }

    public void openToolBar(View view) {
        Intent intent = new Intent(this, ToolbarActivity.class);
        startActivity(intent);
    }

    public void openOptionMenu(View view) {
        Intent intent = new Intent(this, OptionMenuActivity.class);
        startActivity(intent);
    }

    public void openContextMenu(View view) {
        Intent intent = new Intent(this, ContextMenuActivity.class);
        startActivity(intent);
    }
}
