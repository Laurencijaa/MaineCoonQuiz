package lt.laurencija.mainecoonquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private boolean question1Correct;
    private boolean question2Correct;
    private boolean question3_1Correct;
    private boolean question3_2Wrong;
    private boolean question3_3Wrong;
    private boolean question3_4Correct;
    private boolean question4Correct;
    private boolean question5Correct;
    private boolean question6Correct;
    private RadioButton radio1_1;
    private RadioButton radio1_2;
    private RadioButton radio1_3;
    private RadioButton radio1_4;
    private RadioButton radio2_1;
    private RadioButton radio2_2;
    private RadioButton radio2_3;
    private RadioButton radio2_4;
    private CheckBox check3_1;
    private CheckBox check3_2;
    private CheckBox check3_3;
    private CheckBox check3_4;
    private RadioButton radio4_1;
    private RadioButton radio4_2;
    private RadioButton radio4_3;
    private RadioButton radio4_4;
    private RadioButton radio5_1;
    private RadioButton radio5_2;
    private RadioButton radio5_3;
    private RadioButton radio5_4;
    private RadioButton radio6_1;
    private RadioButton radio6_2;
    private RadioButton radio6_3;
    private RadioButton radio6_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_screen);

        // Checking information of all radio buttons and check boxes
        radio1_1 = (RadioButton) findViewById(R.id.radio_1_1);
        radio1_2 = (RadioButton) findViewById(R.id.radio_1_2);
        radio1_3 = (RadioButton) findViewById(R.id.radio_1_3);
        radio1_4 = (RadioButton) findViewById(R.id.radio_1_4);
        radio2_1 = (RadioButton) findViewById(R.id.radio_2_1);
        radio2_2 = (RadioButton) findViewById(R.id.radio_2_2);
        radio2_3 = (RadioButton) findViewById(R.id.radio_2_3);
        radio2_4 = (RadioButton) findViewById(R.id.radio_2_4);
        check3_1 = (CheckBox) findViewById(R.id.check_3_1);
        check3_2 = (CheckBox) findViewById(R.id.check_3_2);
        check3_3 = (CheckBox) findViewById(R.id.check_3_3);
        check3_4 = (CheckBox) findViewById(R.id.check_3_4);
        radio4_1 = (RadioButton) findViewById(R.id.radio_4_1);
        radio4_2 = (RadioButton) findViewById(R.id.radio_4_2);
        radio4_3 = (RadioButton) findViewById(R.id.radio_4_3);
        radio4_4 = (RadioButton) findViewById(R.id.radio_4_4);
        radio5_1 = (RadioButton) findViewById(R.id.radio_5_1);
        radio5_2 = (RadioButton) findViewById(R.id.radio_5_2);
        radio5_3 = (RadioButton) findViewById(R.id.radio_5_3);
        radio5_4 = (RadioButton) findViewById(R.id.radio_5_4);
        radio6_1 = (RadioButton) findViewById(R.id.radio_6_1);
        radio6_2 = (RadioButton) findViewById(R.id.radio_6_2);
        radio6_3 = (RadioButton) findViewById(R.id.radio_6_3);
        radio6_4 = (RadioButton) findViewById(R.id.radio_6_4);
    }

    //Checking if correct option was picked for question 1
    public void radioClickedQuestion1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_1_1:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_1_2:
                if (checked)
                    //correct answer, give some points
                    question1Correct = true;
                    break;
            case R.id.radio_1_3:
                if (checked)
                    //incorrect answer, no points
                break;
            case R.id.radio_1_4:
                if (checked)
                    //incorrect answer, no points
                    break;
        }

    }

    //Checking if correct option was picked for question 2
    public void radioClickedQuestion2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_2_1:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_2_2:
                if (checked)
                    //correct answer, give some points
                    question2Correct = true;
                    break;
            case R.id.radio_2_3:
                if (checked)
                    //incorrect answer, no points
                break;
            case R.id.radio_2_4:
                if (checked)
                    //incorrect answer, no points
                    break;
        }

    }

    //Checking if correct option was picked for question 3
    public void checkClickedQuestion3(View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.check_3_1:
                if (checked)
                    //correct answer, give some points
                    question3_1Correct = true;
                    break;
            case R.id.check_3_2:
                if (checked)
                    //incorrect answer, no points
                    question3_2Wrong = true;
                    break;
            case R.id.check_3_3:
                if (checked)
                    //correct answer, give some points
                    question3_3Wrong = true;
                break;
            case R.id.check_3_4:
                if (checked)
                    //incorrect answer, no points
                    question3_4Correct = true;
                    break;
        }

    }

    //Checking if correct option was picked for question 4
    public void radioClickedQuestion4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_4_1:
                if (checked)
                    //correct answer, give some points
                    question4Correct = true;
                    break;
            case R.id.radio_4_2:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_4_3:
                if (checked)
                    //incorrect answer, no points
                break;
            case R.id.radio_4_4:
                if (checked)
                    //incorrect answer, no points
                    break;
        }

    }

    //Checking if correct option was picked for question 5
    public void radioClickedQuestion5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_5_1:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_5_2:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_5_3:
                if (checked)
                    //correct answer, give some points
                    question5Correct = true;
                break;
            case R.id.radio_5_4:
                if (checked)
                    //incorrect answer, no points
                    break;
        }

    }

    //Checking if correct option was picked for question 6
    public void radioClickedQuestion6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_6_1:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_6_2:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_6_3:
                if (checked)
                    //correct answer, give some points
                    question6Correct = true;
                break;
            case R.id.radio_6_4:
                if (checked)
                    //incorrect answer, no points
                    break;
        }

    }

    //add checking if all radio buttons were clicked (make boolean null and add checking if not null)
    private int countResult() {
        int result = 0;

        if (question1Correct) result += 12;
        if (question2Correct) result += 12;
        if (question3_1Correct) result += 10;
        if (!question3_2Wrong) result += 10;
        if (!question3_3Wrong) result += 10;
        if (question3_4Correct) result += 10;
        if (question4Correct) result += 12;
        if (question5Correct) result += 12;
        if (question6Correct) result += 12;
        return result;

    }


    private String checkforUnanswered() {
        String userAlert = "";

        RadioGroup question1 = (RadioGroup) findViewById(R.id.question1);
        if (question1.getCheckedRadioButtonId() == -1) userAlert += "Please answer question 1";

        RadioGroup question2 = (RadioGroup) findViewById(R.id.question2);
        if (question2.getCheckedRadioButtonId() == -1) userAlert += "\nPlease answer question 2";

        CheckBox qyestion3_1 = (CheckBox)findViewById(R.id.check_3_1);
        CheckBox qyestion3_2 = (CheckBox)findViewById(R.id.check_3_2);
        CheckBox qyestion3_3 = (CheckBox)findViewById(R.id.check_3_3);
        CheckBox qyestion3_4 = (CheckBox)findViewById(R.id.check_3_4);
        if (!qyestion3_1.isChecked()){
            if (!qyestion3_2.isChecked()){
                if (!qyestion3_3.isChecked()){
                    if (!qyestion3_4.isChecked()){
                        userAlert += "\nPlease answer question 3";
                    }
                }
            }
        }

        RadioGroup question4 = (RadioGroup) findViewById(R.id.question4);
        if (question4.getCheckedRadioButtonId() == -1) userAlert += "\nPlease answer question 4";

        RadioGroup question5 = (RadioGroup) findViewById(R.id.question5);
        if (question5.getCheckedRadioButtonId() == -1) userAlert += "\nPlease answer question 5";

        RadioGroup question6 = (RadioGroup) findViewById(R.id.question6);
        if (question6.getCheckedRadioButtonId() == -1) userAlert += "\nPlease answer question 6";

        return userAlert;

    }

    public void checkResult(View view) {

        if (checkforUnanswered().equals("")) {
            Intent intent = new Intent(this, AnswerActivity.class);
            intent.putExtra("RESULT", countResult()+"%");
            startActivity(intent);
        } else {
            String userAlert = checkforUnanswered();
            Toast toast = Toast.makeText(getApplicationContext(), userAlert, Toast.LENGTH_LONG);
            toast.show();
        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putBoolean("question 1-1", radio1_1.isChecked());
        savedInstanceState.putBoolean("question 1-2", radio1_2.isChecked());
        savedInstanceState.putBoolean("question 1-3", radio1_3.isChecked());
        savedInstanceState.putBoolean("question 1-4", radio1_4.isChecked());
        savedInstanceState.putBoolean("question 2-1", radio2_1.isChecked());
        savedInstanceState.putBoolean("question 2-2", radio2_2.isChecked());
        savedInstanceState.putBoolean("question 2-3", radio2_3.isChecked());
        savedInstanceState.putBoolean("question 2-4", radio2_4.isChecked());
        savedInstanceState.putBoolean("question 3-1", check3_1.isChecked());
        savedInstanceState.putBoolean("question 3-2", check3_2.isChecked());
        savedInstanceState.putBoolean("question 3-3", check3_3.isChecked());
        savedInstanceState.putBoolean("question 3-4", check3_4.isChecked());
        savedInstanceState.putBoolean("question 4-1", radio4_1.isChecked());
        savedInstanceState.putBoolean("question 4-2", radio4_2.isChecked());
        savedInstanceState.putBoolean("question 4-3", radio4_3.isChecked());
        savedInstanceState.putBoolean("question 4-4", radio4_4.isChecked());
        savedInstanceState.putBoolean("question 5-1", radio5_1.isChecked());
        savedInstanceState.putBoolean("question 5-2", radio5_2.isChecked());
        savedInstanceState.putBoolean("question 5-3", radio5_3.isChecked());
        savedInstanceState.putBoolean("question 5-4", radio5_4.isChecked());
        savedInstanceState.putBoolean("question 6-1", radio6_1.isChecked());
        savedInstanceState.putBoolean("question 6-2", radio6_2.isChecked());
        savedInstanceState.putBoolean("question 6-3", radio6_3.isChecked());
        savedInstanceState.putBoolean("question 6-4", radio6_4.isChecked());

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        //Set all radio buttons and check boxes from saves instance state
        radio1_1.setChecked(savedInstanceState.getBoolean("question 1-1"));
        radio1_2.setChecked(savedInstanceState.getBoolean("question 1-2"));
        radio1_3.setChecked(savedInstanceState.getBoolean("question 1-3"));
        radio1_4.setChecked(savedInstanceState.getBoolean("question 1-4"));
        radio2_1.setChecked(savedInstanceState.getBoolean("question 2-1"));
        radio2_2.setChecked(savedInstanceState.getBoolean("question 2-2"));
        radio2_3.setChecked(savedInstanceState.getBoolean("question 2-3"));
        radio2_4.setChecked(savedInstanceState.getBoolean("question 2-4"));
        check3_1.setChecked(savedInstanceState.getBoolean("question 3-1"));
        check3_2.setChecked(savedInstanceState.getBoolean("question 3-2"));
        check3_3.setChecked(savedInstanceState.getBoolean("question 3-3"));
        check3_4.setChecked(savedInstanceState.getBoolean("question 3-4"));
        radio4_1.setChecked(savedInstanceState.getBoolean("question 4-1"));
        radio4_2.setChecked(savedInstanceState.getBoolean("question 4-2"));
        radio4_3.setChecked(savedInstanceState.getBoolean("question 4-3"));
        radio4_4.setChecked(savedInstanceState.getBoolean("question 4-4"));
        radio5_1.setChecked(savedInstanceState.getBoolean("question 5-1"));
        radio5_2.setChecked(savedInstanceState.getBoolean("question 5-2"));
        radio5_3.setChecked(savedInstanceState.getBoolean("question 5-3"));
        radio5_4.setChecked(savedInstanceState.getBoolean("question 5-4"));
        radio6_1.setChecked(savedInstanceState.getBoolean("question 6-1"));
        radio6_2.setChecked(savedInstanceState.getBoolean("question 6-2"));
        radio6_3.setChecked(savedInstanceState.getBoolean("question 6-3"));
        radio6_4.setChecked(savedInstanceState.getBoolean("question 6-4"));



    }

}


