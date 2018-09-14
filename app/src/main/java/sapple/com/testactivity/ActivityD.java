package sapple.com.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        findViewById(R.id.btnActivityD).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _data  = getIntent().getStringExtra("DATA");
                setResult(Activity.RESULT_OK, getIntent());
                finish();
            }
        });
    }
}
