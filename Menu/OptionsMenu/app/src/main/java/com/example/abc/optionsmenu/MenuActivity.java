package com.example.abc.optionsmenu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity {

    public class MenuOptions extends Activity {
        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // TODO Auto-generated method stubme
            menu.add(0, 1, 1, "保存");
            menu.add(0,2,2,"退出");

            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // TODO Auto-generated method stub
            if(item.getItemId()==2){
                finish();
            }
            return super.onOptionsItemSelected(item);
        }
    }
}
