package lt.laurencija.mainecoonquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_sreen);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            TextView resultView = (TextView) findViewById(R.id.result);
            int finalResult = extras.getInt("RESULT");
            resultView.setText(Integer.toString(finalResult));
        }
    }
}
