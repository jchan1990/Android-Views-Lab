package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Button member variables
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // put your Java code in here

        // create references to the views inside activity_main.xml
        mButton1 = (Button) findViewById(R.id.button_1);
        mButton2 = (Button) findViewById(R.id.button_2);
        mButton3 = (Button) findViewById(R.id.button_3);
        mButton4 = (Button) findViewById(R.id.button_4);
        mButton5 = (Button) findViewById(R.id.button_5);

        // create OnClickListener for the buttons
        View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button_1:
                        Toast.makeText(view.getContext(), "You clicked on the button below views"
                                + " number 1 and 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_2:
                        Toast.makeText(view.getContext(), "You clicked on the button below views"
                                + " number 3 and 4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_3:
                        Toast.makeText(view.getContext(), "You clicked on the button below views"
                                + " number 5 and 6", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_4:
                        Toast.makeText(view.getContext(), "You clicked on the button below views"
                                + " number 7 and 8", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_5:
                        Toast.makeText(view.getContext(), "You clicked on the button below views"
                                + " number 9 and 10", Toast.LENGTH_SHORT).show();
                    default:
                        Toast.makeText(view.getContext(), "How did you get here?",
                                Toast.LENGTH_SHORT).show();

                }
            }
        };

        // set my onClickListener to the button
        mButton1.setOnClickListener(buttonOnClickListener);
        mButton2.setOnClickListener(buttonOnClickListener);
        mButton3.setOnClickListener(buttonOnClickListener);
        mButton4.setOnClickListener(buttonOnClickListener);
        mButton5.setOnClickListener(buttonOnClickListener);
    }


}
