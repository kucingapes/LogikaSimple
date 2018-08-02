package utsman.kucingapes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextA = findViewById(R.id.input_a);
        EditText editTextB = findViewById(R.id.input_b);
        TextView textView = findViewById(R.id.output);
        Button button = findViewById(R.id.generate);

        checkHasil(textView, button, editTextA, editTextB);
    }

    private void checkHasil(final TextView textView, Button button, final EditText editTextA, final EditText editTextB) {
        final String A = "A";
        final String B = "B";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hasilA = editTextA.getText().toString();
                String hasilB = editTextB.getText().toString();

                if (hasilA.equals(A) && hasilB.equals(B)) {
                    textView.setText("AB");
                } if (hasilA.equals(B) && hasilB.equals(B)) {
                    textView.setText("BB");
                } if (hasilA.equals(A) && hasilB.equals(A)) {
                    textView.setText("AA");
                } if (!hasilA.equals(A) &&
                        !hasilA.equals(B) &&
                        !hasilB.equals(A) &&
                        !hasilB.equals(B)) {
                    Toast.makeText(MainActivity.this, "lu salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
