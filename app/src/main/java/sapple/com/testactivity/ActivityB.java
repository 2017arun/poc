package sapple.com.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        findViewById(R.id.btnActivityB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _data = getIntent().getStringExtra("DATA");
                Intent _intentB  = new Intent(ActivityB.this, ActivityC.class);
                _intentB.putExtra("DATA", _data);
                _intentB.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
                startActivity(_intentB);
                finish();
            }
        });
    }
}
