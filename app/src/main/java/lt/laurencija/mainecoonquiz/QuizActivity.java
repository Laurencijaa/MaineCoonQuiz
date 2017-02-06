package lt.laurencija.mainecoonquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private boolean question1Correct;
    private boolean question2Correct;
    private boolean question3Correct;
    private boolean question4Correct;
    private boolean question5Correct;
    private boolean question6Correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_screen);
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
                    //incorrect answer, no points
                    break;
            case R.id.radio_1_3:
                if (checked)
                    //correct answer, give some points
                    question1Correct = true;
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
                    //incorrect answer, no points
                    break;
            case R.id.radio_2_3:
                if (checked)
                    //correct answer, give some points
                    question2Correct = true;
                break;
            case R.id.radio_2_4:
                if (checked)
                    //incorrect answer, no points
                    break;
        }

    }

    //Checking if correct option was picked for question 3
    public void radioClickedQuestion3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_3_1:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_3_2:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_3_3:
                if (checked)
                    //correct answer, give some points
                    question3Correct = true;
                break;
            case R.id.radio_3_4:
                if (checked)
                    //incorrect answer, no points
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
                    //incorrect answer, no points
                    break;
            case R.id.radio_4_2:
                if (checked)
                    //incorrect answer, no points
                    break;
            case R.id.radio_4_3:
                if (checked)
                    //correct answer, give some points
                    question4Correct = true;
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

        if (question1Correct) result += 1;
        if (question2Correct) result += 1;
        if (question3Correct) result += 1;
        if (question4Correct) result += 1;
        if (question5Correct) result += 1;
        if (question6Correct) result += 1;
        return result;

    }


    private String checkforUnanswered() {
        String userAlert = "";

        RadioGroup question1 = (RadioGroup) findViewById(R.id.question1);
        if (question1.getCheckedRadioButtonId() == -1) userAlert += "Please answer question 1";

        RadioGroup question2 = (RadioGroup) findViewById(R.id.question2);
        if (question2.getCheckedRadioButtonId() == -1) userAlert += "\nPlease answer question 2";

        RadioGroup question3 = (RadioGroup) findViewById(R.id.question3);
        if (question3.getCheckedRadioButtonId() == -1) userAlert += "\nPlease answer question 3";

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
            int result = countResult();
            System.out.println(result);
        } else {
            String userAlert = checkforUnanswered();
            Toast toast = Toast.makeText(getApplicationContext(), userAlert, Toast.LENGTH_LONG);
            toast.show();
        }

    }

}
