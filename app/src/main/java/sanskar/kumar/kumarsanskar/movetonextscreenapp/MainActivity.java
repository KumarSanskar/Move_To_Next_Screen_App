package sanskar.kumar.kumarsanskar.movetonextscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button moveToNextScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moveToNextScreen = findViewById(R.id.button);
        moveToNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                intent is used to move from one activity to another
                the first parameter is the current location and second is the target location
                 */
                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}