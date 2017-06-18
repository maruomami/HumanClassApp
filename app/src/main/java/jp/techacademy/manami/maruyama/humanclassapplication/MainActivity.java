package jp.techacademy.manami.maruyama.humanclassapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human Human = new Human("まなみ", 30,"インターフェース");

        Human.say();
        Human.think();


    }
}
