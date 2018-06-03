package com.example.dell.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] questionList={"The Miss Porters Network is a ....?","Every Network Interface Card has a _______ address, which is a unique identifier?",
    "Which is considered to be the computers short-term memory?","Which one has two examples of output devices?",
    "What is the brain of the computer?","Application software...","How do programs make request to the Operating System?",
    "What allows multiple programs to run on a computer?","Everything physical in a computer is attached to the...",
    "What does GUI stand for....?"};
    String[][] option={{"A. MAN","B. SAN","C. LAN","D. WAN"},{"A. GUI","B. MAC","C. NIC","D. CPU"},{"A. REM","B. ROM","C. RAM","D. RIM"},
            {"A. Monitor and Scanner","B. Speaker and keyboard","C. Printer and scanner","D. Speaker and printer"},
            {"A. Motherboard","B. Memory","C. CPU","D. NIC"},{"A. Tells the computer components what to do","B. Let's the computer interact with the user",
            "C. Let's the user perform a task.","D. Is encoded on a piece of hardware."},{"A. GUI","B. API","C. TCP","D. SMB"},
            {"A. NIC","B. OS","C. API","D. GUI"},{"A. Hard drive","B. CPU","C. Memory","D. Motherboard"},
            {"A. Graphical User Interim","B. Geographical User Interruption","C. Graphical User Interface","D. Gain Upper Intensity"}};
    String[] answer={"LAN","MAC","RAM","Speaker and printer","CPU","Let's user perform a task","API","OS","Motherboard",
            "Graphical User Interface",};
    int questionNumber=1,score=0;
    int[][] set=new int[10][2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button questionView=(Button)findViewById(R.id.question_view);
        questionView.setText(questionNumber+"."+questionList[questionNumber-1]);
        Button firstButtonView=(Button)findViewById(R.id.firstOption);
        firstButtonView.setText(option[questionNumber-1][0]);
        Button secondButtonView=(Button)findViewById(R.id.secondOption);
        secondButtonView.setText(option[questionNumber-1][1]);
        Button thirdButtonView=(Button)findViewById(R.id.thirdOption);
        thirdButtonView.setText(option[questionNumber-1][2]);
        Button fourthButtonView=(Button)findViewById(R.id.fourthOption);
        fourthButtonView.setText(option[questionNumber-1][3]);


    }
    public void updateScore(){

        TextView scoreView=(TextView)findViewById(R.id.score_view);
        score+=10;
        scoreView.setText(("Score : "+score));

    }
    public void reset()
    {
        Button firstButtonView=(Button)findViewById(R.id.firstOption);
        firstButtonView.setBackgroundColor(Color.parseColor("#FD8A00"));
        Button secondButtonView=(Button)findViewById(R.id.secondOption);
        secondButtonView.setBackgroundColor(Color.parseColor("#FD8A00"));;
        Button thirdButtonView=(Button)findViewById(R.id.thirdOption);
        thirdButtonView.setBackgroundColor(Color.parseColor("#FD8A00"));;
        Button fourthButtonView=(Button)findViewById(R.id.fourthOption);
        fourthButtonView.setBackgroundColor(Color.parseColor("#FD8A00"));;
    }
    public void nextQuestion(){

        Button questionView = (Button) findViewById(R.id.question_view);
        Button firstButtonView=(Button)findViewById(R.id.firstOption);
        Button secondButtonView=(Button)findViewById(R.id.secondOption);
        Button thirdButtonView=(Button)findViewById(R.id.thirdOption);
        Button fourthButtonView=(Button)findViewById(R.id.fourthOption);
        questionNumber+=1;
        if(questionNumber<=10) {
            if (set[questionNumber - 1][0] == 1 && questionNumber > 1) {
                switch (set[questionNumber - 1][1]) {
                    case 1:
                        firstButtonView.setBackgroundColor((Color.GREEN));
                        secondButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        thirdButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        fourthButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        break;

                    case 2:
                        firstButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        secondButtonView.setBackgroundColor((Color.GREEN));
                        thirdButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        fourthButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        break;
                    case 3:
                        firstButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        secondButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        thirdButtonView.setBackgroundColor((Color.GREEN));
                        fourthButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        break;
                    case 4:
                        firstButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        secondButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        thirdButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        fourthButtonView.setBackgroundColor((Color.GREEN));
                        break;
                }

                questionView.setText(questionNumber + "." + questionList[questionNumber - 1]);
                firstButtonView.setText(option[questionNumber - 1][0]);
                secondButtonView.setText(option[questionNumber - 1][1]);
                thirdButtonView.setText(option[questionNumber - 1][2]);
                fourthButtonView.setText(option[questionNumber - 1][3]);

            } else if (questionNumber <= 10) {
                questionView.setText(questionNumber + "." + questionList[questionNumber - 1]);
                firstButtonView.setText(option[questionNumber - 1][0]);
                secondButtonView.setText(option[questionNumber - 1][1]);
                thirdButtonView.setText(option[questionNumber - 1][2]);
                fourthButtonView.setText(option[questionNumber - 1][3]);
                reset();
            } else
                questionNumber = 1;
        }
    }
    public void previousQuestion(){
        Button questionView = (Button) findViewById(R.id.question_view);
        Button firstButtonView=(Button)findViewById(R.id.firstOption);
        Button secondButtonView=(Button)findViewById(R.id.secondOption);
        Button thirdButtonView=(Button)findViewById(R.id.thirdOption);
        Button fourthButtonView=(Button)findViewById(R.id.fourthOption);
        if(questionNumber-2>-1) {
            if (set[questionNumber - 2][0] == 1 && questionNumber > 1) {
                switch (set[questionNumber - 2][1]) {
                    case 1:
                        firstButtonView.setBackgroundColor((Color.GREEN));
                        secondButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        thirdButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        fourthButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        break;

                    case 2:
                        firstButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        secondButtonView.setBackgroundColor((Color.GREEN));
                        thirdButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        fourthButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        break;
                    case 3:
                        firstButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        secondButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        thirdButtonView.setBackgroundColor((Color.GREEN));
                        fourthButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        break;
                    case 4:
                        firstButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        secondButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        thirdButtonView.setBackgroundColor((Color.parseColor("#FD8A00")));
                        fourthButtonView.setBackgroundColor((Color.GREEN));
                        break;
                }

                questionView.setText(questionNumber - 1 + "." + questionList[questionNumber - 2]);
                firstButtonView.setText(option[questionNumber - 2][0]);
                secondButtonView.setText(option[questionNumber - 2][1]);
                thirdButtonView.setText(option[questionNumber - 2][2]);
                fourthButtonView.setText(option[questionNumber - 2][3]);
                questionNumber -= 1;
            } else if (questionNumber > 1) {
                questionView.setText(questionNumber - 1 + "." + questionList[questionNumber - 2]);
                firstButtonView.setText(option[questionNumber - 2][0]);
                secondButtonView.setText(option[questionNumber - 2][1]);
                thirdButtonView.setText(option[questionNumber - 2][2]);
                fourthButtonView.setText(option[questionNumber - 2][3]);
                questionNumber -= 1;
                reset();
            } else
                questionNumber = 1;
        }
    }
    public void nextButtonCalled(View view){
        nextQuestion();
    }
    public void previousButtonCalled(View view){
        previousQuestion();
    }
    public void firstButtonCalled(View view){

        int answerOption=questionNumber-1;
        String selectedAnswer;
        Button firstButtonView=(Button)findViewById(R.id.firstOption);
        firstButtonView.setBackgroundColor(0XFFFF0000);
        selectedAnswer=(firstButtonView.getText()).toString();
        selectedAnswer=selectedAnswer.substring(3,selectedAnswer.length());
        if(answer[answerOption].equals(selectedAnswer)) {
            firstButtonView.setBackgroundColor(Color.GREEN);
            set[questionNumber-1][0]=1;
            set[questionNumber-1][1]=1;
            updateScore();

        }
    }
    public void secondButtonCalled(View view){

        int answerOption=questionNumber-1;
        String selectedAnswer;
        Button secondButtonView=(Button)findViewById(R.id.secondOption);
        secondButtonView.setBackgroundColor(0XFFFF0000);
        selectedAnswer=(secondButtonView.getText()).toString();
        selectedAnswer=selectedAnswer.substring(3,selectedAnswer.length());
        if(answer[answerOption].equals(selectedAnswer)) {
            secondButtonView.setBackgroundColor(Color.GREEN);
            set[questionNumber-1][0]=1;
            set[questionNumber-1][1]=2;
            updateScore();

        }
    }
    public void thirdButtonCalled(View view){

        int answerOption=questionNumber-1;
        String selectedAnswer;
        Button thirdButtonView=(Button)findViewById(R.id.thirdOption);
        thirdButtonView.setBackgroundColor(0XFFFF0000);
        selectedAnswer=(thirdButtonView.getText()).toString();
        selectedAnswer=selectedAnswer.substring(3,selectedAnswer.length());
        if(answer[answerOption].equals(selectedAnswer)) {
            thirdButtonView.setBackgroundColor(Color.GREEN);
            set[questionNumber-1][0]=1;
            set[questionNumber-1][1]=3;
            updateScore();

        }
    }
    public void fourthButtonCalled(View view){

        int answerOption=questionNumber-1;
        String selectedAnswer;
        Button fourthButtonView=(Button)findViewById(R.id.fourthOption);
        fourthButtonView.setBackgroundColor(0XFFFF0000);
        selectedAnswer=(fourthButtonView.getText()).toString();
        selectedAnswer=selectedAnswer.substring(3,selectedAnswer.length());
        if(answer[answerOption].equals(selectedAnswer)) {
            fourthButtonView.setBackgroundColor(Color.GREEN);
            set[questionNumber-1][0]=1;
            set[questionNumber-1][1]=4;
            updateScore();

        }
    }
}
