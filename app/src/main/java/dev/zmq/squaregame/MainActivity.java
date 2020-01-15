package dev.zmq.squaregame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import dev.zmq.squaregame.view.CustomView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView customView=new CustomView(this);
        //customView=(CustomView)findViewById(R.id.rect);
    }
}
