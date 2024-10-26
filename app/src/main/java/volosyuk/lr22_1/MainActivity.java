package volosyuk.lr22_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button First, Second, Third;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        First = findViewById(R.id.first);
        Second = findViewById(R.id.second);
        Third = findViewById(R.id.third);

        First.setOnClickListener(view -> {
            Intent intent = new Intent(this, first.class);
            startActivity(intent);
        });
        Second.setOnClickListener(view -> {
            Intent intent = new Intent(this, second.class);
            startActivity(intent);
        });
        Third.setOnClickListener(view -> {
            Intent intent = new Intent(this, third.class);
            startActivity(intent);
        });

    }
}