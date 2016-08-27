package com.nazrul.gitexampleandriodstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btClick1;
    private Button btClick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btClick1 = (Button) findViewById(R.id.btClick);
        btClick2 = (Button) findViewById(R.id.btClick2);

        btClick1.setOnClickListener(this);
        btClick2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btClick:

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);

                break;
            case R.id.btClick2:
                Intent intent1 = new Intent(getApplicationContext(), SeponActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
