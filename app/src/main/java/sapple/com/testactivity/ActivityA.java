package sapple.com.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {
    String data = "Sapple";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnStartActivityA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intentA = new Intent(ActivityA.this, ActivityB.class);
                _intentA.putExtra("DATA", data);
                startActivityForResult(_intentA, 200);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                Toast.makeText(this, data.getStringExtra("DATA"), Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "data is not found", Toast.LENGTH_LONG).show();
            }
        }
    }
}
