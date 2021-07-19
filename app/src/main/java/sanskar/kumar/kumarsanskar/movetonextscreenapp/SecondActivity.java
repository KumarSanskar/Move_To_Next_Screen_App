package sanskar.kumar.kumarsanskar.movetonextscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button moveToFirstScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        moveToFirstScreen = (Button) findViewById(R.id.button2);
        moveToFirstScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}