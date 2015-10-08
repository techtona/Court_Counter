package id.shopedia.courtcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView tvScoreTeamA;
    private TextView tvScoreTeamB;
    private Button btn3A;
    private Button btn2A;
    private Button btnFreeA;
    private Button btn3B;
    private Button btn2B;
    private Button btnFreeB;
    private Button btnReset;
    private int scoreA;
    private int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        tvScoreTeamA = (TextView) findViewById(R.id.tv_score_team_a);
        tvScoreTeamB = (TextView) findViewById(R.id.tv_score_team_b);
        btn3A = (Button) findViewById(R.id.btn_3_a);
        btn2A = (Button) findViewById(R.id.btn_2_a);
        btnFreeA = (Button) findViewById(R.id.btn_free_a);
        btnFreeB = (Button) findViewById(R.id.btn_free_b);
        btn3B = (Button) findViewById(R.id.btn_3_b);
        btn2B = (Button) findViewById(R.id.btn_2_b);
        btnReset = (Button) findViewById(R.id.btn_reset);

        scoreA = scoreB = 0;

        btn3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addPointToTeamA(3);

            }


        });
        btn3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addPointToTeamB(3);

            }


        });
        btnFreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addPointToTeamA(1);

            }


        });
        btnFreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addPointToTeamB(1);

            }


        });
        btn2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addPointToTeamB(2);

            }


        });
        btn2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addPointToTeamA(2);

            }


        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetPoint();
                tvScoreTeamB.setText(scoreB+"");
                tvScoreTeamA.setText(scoreA+"");

            }


        });

    }

    private void addPointToTeamA(int point){
        scoreA += point;
        tvScoreTeamA.setText(scoreA+"");
    }

    private void addPointToTeamB(int point){
        scoreB += point;
        tvScoreTeamB.setText(scoreB+"");
    }

    private void resetPoint(){
        scoreA = scoreB = 0;
    }

}
