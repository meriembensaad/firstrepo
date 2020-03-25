package com.example.newapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText1=(EditText)findViewById(R.id.editText1);
        final EditText editText2=(EditText)findViewById(R.id.editText2);
        final EditText editText3=(EditText)findViewById(R.id.editText3);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        button2.setOnClickListener(new OnClickListener() {
        public void onClick(View arg0) {
        String url=editText3.getText().toString();
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(intent);} });
        
        button1.setOnClickListener(new OnClickListener() {
        public void onClick(View arg0) {
        String a=editText1.getText().toString();
        String b=editText1.getText().toString();
        Intent it = new Intent(MainActivity.this, Activity2.class);
        it.putExtra("Value1", a);
        it.putExtra("Value2", b);
        startActivity(it);
        } });
    
     
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

 