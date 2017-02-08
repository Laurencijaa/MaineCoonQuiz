package lt.laurencija.mainecoonquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    String finalResult;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_sreen);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            resultView = (TextView) findViewById(R.id.result);
            finalResult = extras.getString("RESULT");
            resultView.setText(finalResult);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putString("result", finalResult);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        resultView.setText(savedInstanceState.getString("result"));

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
