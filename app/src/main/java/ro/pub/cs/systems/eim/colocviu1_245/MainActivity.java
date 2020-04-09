package ro.pub.cs.systems.eim.colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add (View view) {
        EditText nextTerm = findViewById(R.id.nextTerm);
        String value = nextTerm.getText().toString();
        TextView result = findViewById(R.id.result);
        try {
            String newResult = result.getText().toString() + " + " + Integer.valueOf(value);
            result.setText(newResult);
        } catch (Exception e) {

        }



    }
}
