package sapple.com.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityC extends AppCompatActivity {
	String str = "Activity C";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        findViewById(R.id.btnActivityC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _data = getIntent().getStringExtra("DATA");
                Intent _intentC = new Intent(ActivityC.this, ActivityD.class);
                _intentC.putExtra("DATA", _data);
                startActivityForResult(_intentC, 300);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 300 && resultCode == Activity.RESULT_OK) {
//            if (data != null) {
//                Toast.makeText(this, "data is still alive", Toast.LENGTH_SHORT).show();
                setResult(resultCode, data);
                finish();
//            } else {
//                Toast.makeText(this, "data is not alive", Toast.LENGTH_SHORT).show();
//            }
        }
    }
}
