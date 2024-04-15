package com.example.funkiddoquizzes;

import android.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity implements View.OnClickListener{
    TextView questionTextView;
    TextView totalQuestionTextView;
    Button ansA,ansB,ansC,ansD;
    Button btn_submit;

    int score=0;
    int totalQuestion = QuestionAnswer2.questions.length;
    int currentQuestionIndex =0;
    String selectedAnswer="";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        totalQuestionTextView = findViewById(R.id.totalquestion);
        questionTextView = findViewById(R.id.questions);
        ansA = findViewById(R.id.answ_a);
        ansB = findViewById(R.id.answ_b);
        ansC= findViewById(R.id.answ_c);
        ansD = findViewById(R.id.answ_d);
        btn_submit = findViewById(R.id.btnsubmit);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        btn_submit.setOnClickListener(this);


        totalQuestionTextView.setText("Total question: "+totalQuestion);

        loadNewQuestion();
    }

    private void loadNewQuestion(){
        if(currentQuestionIndex == totalQuestion){
            finishQuiz();
            return;
        }
        questionTextView.setText(QuestionAnswer2.questions[currentQuestionIndex]);
        ansA.setText(QuestionAnswer2.choice[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer2.choice[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer2.choice[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer2.choice[currentQuestionIndex][3]);

        selectedAnswer="";

    }

    private void finishQuiz(){
        String passStatus;
        if(score >= totalQuestion*0.6){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Your Score is "+score+" Out of "+totalQuestion)
                .setPositiveButton("Restart",((dialog, i) -> restartQuiz() ))
                .setCancelable(false)
                .show();
    }

    private void restartQuiz(){
        score = 0;
        currentQuestionIndex=0;
        loadNewQuestion();
    }

    @Override
    public void onClick(View view){
        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;

        if(clickedButton.getId() == R.id.btn_submit) {
            if(!selectedAnswer.isEmpty()){
                if(selectedAnswer.equals(QuestionAnswer2.correctAnswer[currentQuestionIndex])){
                    score++;
                }else{
                    clickedButton.setBackgroundColor(Color.MAGENTA);
                }
                currentQuestionIndex++;
                loadNewQuestion();
            }else{

            }
        }
        else{
            selectedAnswer=clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.YELLOW);
        }
    }
}