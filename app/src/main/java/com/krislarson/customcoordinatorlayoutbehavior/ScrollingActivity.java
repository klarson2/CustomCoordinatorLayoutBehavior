package com.krislarson.customcoordinatorlayoutbehavior;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;

import de.hdodenhof.circleimageview.CircleImageView;

public class ScrollingActivity extends AppCompatActivity {

   private Rect mStart = new Rect();

   private Rect mTarget = new Rect();

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_scrolling);
      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      final ActionBar actionBar = getSupportActionBar();
      if (actionBar != null) {
         actionBar.setTitle("Abby");
         actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
         actionBar.setDisplayHomeAsUpEnabled(true);
      }

      final View target = findViewById(R.id.circle_collapsed_target);

      final CircleImageView circleImageView = (CircleImageView) findViewById(R.id.circle_image_view);

      AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);


//      FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//      fab.setOnClickListener(new View.OnClickListener() {
//         @Override
//         public void onClick(View view) {
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                  .setAction("Action", null).show();
//         }
//      });
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.menu_scrolling, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      // Handle action bar item clicks here. The action bar will
      // automatically handle clicks on the Home/Up button, so long
      // as you specify a parent activity in AndroidManifest.xml.
      int id = item.getItemId();

      //noinspection SimplifiableIfStatement
      if (id == R.id.action_settings) {
         return true;
      }
      return super.onOptionsItemSelected(item);
   }
}
