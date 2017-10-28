package r_tidz.observice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import r_tidz.observice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Add fragmentActivity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragmentMain, new MainFragment()).commit();
        }




    }   //MainMethod
} //MainClass
