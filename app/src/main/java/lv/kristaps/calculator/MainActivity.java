package lv.kristaps.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonPoint, buttonClear, buttonEqual, buttonMC,
            buttonMR, buttonMS;

    EditText calcEditText;

    float Value1, Value2;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    SharedPreferences sharedpreferences;
    public static final String preference = "prefCalc";
    public static final String key = "calcKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        buttonAdd = (Button) findViewById(R.id.button_add);
        buttonSub = (Button) findViewById(R.id.button_subtract);
        buttonMul = (Button) findViewById(R.id.button_multiply);
        buttonDiv = (Button) findViewById(R.id.button_divide);
        buttonClear = (Button) findViewById(R.id.button_clear);
        buttonPoint = (Button) findViewById(R.id.button_point);
        buttonEqual = (Button) findViewById(R.id.button_equal);
        buttonMC = (Button) findViewById(R.id.button_memClear);
        buttonMR = (Button) findViewById(R.id.button_memRead);
        buttonMS = (Button) findViewById(R.id.button_memSave);
        calcEditText = (EditText) findViewById(R.id.calculation);
        sharedpreferences = getSharedPreferences(preference, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + "0");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText(calcEditText.getText() + ".");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText("");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcEditText == null) {
                    calcEditText.setText("");
                } else {
                    Value1 = Float.parseFloat(calcEditText.getText() + "");
                    mAddition = true;
                    calcEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcEditText == null) {
                    calcEditText.setText("");
                } else {
                    Value1 = Float.parseFloat(calcEditText.getText() + "");
                    mSubtract = true;
                    calcEditText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcEditText == null) {
                    calcEditText.setText("");
                } else {
                    Value1 = Float.parseFloat(calcEditText.getText() + "");
                    mMultiplication = true;
                    calcEditText.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcEditText == null) {
                    calcEditText.setText("");
                } else {
                    Value1 = Float.parseFloat(calcEditText.getText() + "");
                    mDivision = true;
                    calcEditText.setText(null);
                }
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(calcEditText.getText() + "");

                if (mAddition == true) {
                    calcEditText.setText(Value1 + Value2 + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    calcEditText.setText(Value1 - Value2 + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    calcEditText.setText(Value1 * Value2 + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    if(Value2 != 0) {
                        calcEditText.setText(Value1 / Value2 + "");
                        mDivision = false;
                    } else {
                        Toast.makeText(MainActivity.this, "Can't divide with 0", Toast.LENGTH_SHORT).show();
                        calcEditText.setText("");
                    }
                }
            }
        });

        buttonMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(key, calcEditText.getText().toString());
                editor.apply();
                Toast.makeText(MainActivity.this, "Saved in memory", Toast.LENGTH_SHORT).show();
            }
        });

        buttonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(key, "");
                editor.apply();
                Toast.makeText(MainActivity.this, "Memory cleared", Toast.LENGTH_SHORT).show();
            }
        });

        buttonMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedpreferences = getSharedPreferences(MainActivity.preference, MODE_PRIVATE);
                String text = sharedpreferences.getString(MainActivity.key, "");
                if (text.equals("")) {
                    Toast.makeText(MainActivity.this, "Nothing found", Toast.LENGTH_SHORT).show();
                } else {
                    calcEditText.setText(text);
                    Toast.makeText(MainActivity.this, "Read from memory", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}