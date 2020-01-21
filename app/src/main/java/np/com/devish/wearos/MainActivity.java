package np.com.devish.wearos;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView, tvOutput;
    private EditText etText;
    private Button btnShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        tvOutput = findViewById(R.id.tvOutput);
        etText = findViewById(R.id.etText);
        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(etText.getText().toString());
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
