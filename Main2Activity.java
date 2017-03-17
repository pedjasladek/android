package gravedigger.example.student.com.treci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button button6;
    Button button5;
    Button button4;
    Button button9;
    Button button8;
    Button button7;
    Button button3;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button9= (Button) findViewById(R.id.button9);
        button6= (Button) findViewById(R.id.button6);
        button5= (Button) findViewById(R.id.button5);
        button4= (Button) findViewById(R.id.button4);
        button8= (Button) findViewById(R.id.button8);
        button7= (Button) findViewById(R.id.button7);
        button3= (Button) findViewById(R.id.button3);
        button2= (Button) findViewById(R.id.button2);




        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setEnabled(false);
                button5.setEnabled(false);
                button4.setEnabled(false);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setEnabled(true);
                button5.setEnabled(true);
                button4.setEnabled(true);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setEnabled(true);
                button5.setEnabled(true);
                button4.setEnabled(true);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

}
