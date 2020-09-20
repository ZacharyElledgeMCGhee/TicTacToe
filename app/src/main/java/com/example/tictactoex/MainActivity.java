package com.example.tictactoex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button[][] buttons=new Button[3][3];

    private boolean player1Turn = true;

    private int roundCount;

    private int player1points;

    private int player2points;
     private TextView textViewPlater1;
  private TextView textViewPlater2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPlater1=findViewById(R.id.text_view_p1);
        textViewPlater2=findViewById(R.id.text_view_p2);

        for(int i = 0; i <3; i++)
        {
            for (int j=0; j<3;j++)
            {
                String buttonID = "button_"+i+j;
                int resID= getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);
            }
        }
        Button buttonReset = findViewById(R.id.button_reset);
        buttonReset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){

            }
        });
    }

    @Override
    public void onClick(View v) {
        if (!((Button) v).getText().toString().equals("")){
            return;
        }

        if(player1Turn){
            ((Button)v).setText("X");

        }
        else{
            ((Button) v).setText("O");

        }

        roundCount++;

    }

    private boolean checkForWin(){
        String[][] field = new String[3][3];

        for (int i=0; i<3;i++)
        {
            for(int j =0; j<3;j++){
                field[i][j]=buttons[i][j].getText().toString();
            }
        }
        for(int i=0;i<3;i++){
             if(field[i][0].equals(field[i][1])
                && field[i][0].equals(field[i][2])
                && field[i][0].equals(""))
            {
                return true;
            } }}}}}


}