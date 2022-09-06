package sherryl.assigment7c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup Jawaban1, Jawaban2, Jawaban3, Jawaban4, Jawaban5, Jawaban6, Jawaban7, Jawaban8, Jawaban9, Jawaban10;
    private Button btnJawab;
    private RadioButton jwb1, jwb2a, jwb1b, jwb1c, jwb2d, jwb2e, jwb1f, jwb2g, jwb2h, jwb1i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Jawaban1 = findViewById(R.id.Jawaban1);
        Jawaban2 = findViewById(R.id.Jawaban2);
        Jawaban3 = findViewById(R.id.Jawaban3);
        Jawaban4 = findViewById(R.id.Jawaban4);
        Jawaban5 = findViewById(R.id.Jawaban5);
        Jawaban6 = findViewById(R.id.Jawaban6);
        Jawaban7 = findViewById(R.id.Jawaban7);
        Jawaban8 = findViewById(R.id.Jawaban8);
        Jawaban9 = findViewById(R.id.Jawaban9);
        Jawaban10 = findViewById(R.id.Jawaban10);

        btnJawab = (Button) findViewById(R.id.btnJawab);
        btnJawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pointA = Jawaban1.getCheckedRadioButtonId();
                jwb1 = (RadioButton) findViewById(pointA);

                int pointB = Jawaban2.getCheckedRadioButtonId();
                jwb2a = (RadioButton) findViewById(pointB);

                int pointC = Jawaban3.getCheckedRadioButtonId();
                jwb1b = (RadioButton) findViewById(pointC);

                int pointD = Jawaban4.getCheckedRadioButtonId();
                jwb1c = (RadioButton) findViewById(pointD);

                int pointE = Jawaban5.getCheckedRadioButtonId();
                jwb2d = (RadioButton) findViewById(pointE);

                int pointF = Jawaban6.getCheckedRadioButtonId();
                jwb2e = (RadioButton) findViewById(pointF);

                int pointG = Jawaban7.getCheckedRadioButtonId();
                jwb1f = (RadioButton) findViewById(pointG);

                int pointH = Jawaban8.getCheckedRadioButtonId();
                jwb2g = (RadioButton) findViewById(pointH);

                int pointI = Jawaban9.getCheckedRadioButtonId();
                jwb2h = (RadioButton) findViewById(pointI);

                int pointJ = Jawaban10.getCheckedRadioButtonId();
                jwb1i = (RadioButton) findViewById(pointJ);
                int nilai = 0;


                if (jwb1.getText().toString().equals("10")) {
                    nilai = nilai + 10; }
                if (jwb2a.getText().toString().equals("3")) {
                    nilai = nilai + 10; }
                if (jwb1b.getText().toString().equals("5")) {
                    nilai = nilai + 10;}
                if (jwb1c.getText().toString().equals("10")) {
                    nilai = nilai + 10; }
                if (jwb2d.getText().toString().equals("17")) {
                    nilai = nilai + 10; }
                if (jwb2e.getText().toString().equals("5")) {
                    nilai = nilai + 10; }
                if (jwb1f.getText().toString().equals("50")) {
                    nilai = nilai + 10; }
                if (jwb2g.getText().toString().equals("6")) {
                    nilai = nilai + 10; }
                if (jwb2h.getText().toString().equals("91")) {
                    nilai = nilai + 10; }
                if (jwb1i.getText().toString().equals("35")) {
                    nilai = nilai + 10; }
                Toast.makeText(getApplicationContext(), "Skor Quiz anda adalah "+nilai, Toast.LENGTH_SHORT).show();
            }

        });
    }
}

