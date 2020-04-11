package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

public class MainActivity extends AppCompatActivity {

    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10, btn_0, btn_c, btn_plus, btn_minus, btn_mul, btn_div, btn_equal;
    private TextView tv_num, tv_result;
    Double valueone, valuetwo;
    boolean addition, subtraction, multiplication, division;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transparentStatusAndNavigation();
        getWindow().getDecorView().setSystemUiVisibility(SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        tv_num = findViewById(R.id.tv_num);
        tv_result = findViewById(R.id.tv_result);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_10 = findViewById(R.id.btn_10);
        btn_0 = findViewById(R.id.btn_0);
        btn_c = findViewById(R.id.btn_c);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        btn_equal = findViewById(R.id.btn_equal);
        btn_back = findViewById(R.id.btn_back);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "9");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + "0");
            }
        });
        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_result.setText(tv_result.getText() + ".");
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_num.setText("");
                tv_result.setText("");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Double.parseDouble(tv_result.getText() + "");
                addition = true;
                tv_result.setText(String.valueOf(valueone) + "+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Double.parseDouble(tv_result.getText() + "");
                subtraction = true;
                tv_result.setText(String.valueOf(valueone) + "-");
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Double.parseDouble(tv_result.getText() + "");
                multiplication = true;
                tv_result.setText(String.valueOf(valueone) + "*");

            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Double.parseDouble(tv_result.getText() + "");
                division = true;
                tv_result.setText(String.valueOf(valueone) + "/");
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = tv_result.getText().toString();
                if (str.length() >= 1) {
                    str = str.substring(0, str.length() - 1);
                    tv_result.setText(str);
                }
                ;
                if (str.length() < 1) {
                    tv_result.setText("");
                }
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = tv_result.getText().toString();

                if (addition == true) {
                    valuetwo = Double.parseDouble((str.substring(str.lastIndexOf("+") + 1, str.length())));
                    tv_num.setText(String.valueOf(valueone) + "+" + String.valueOf(valuetwo));
                    tv_result.setText((valueone + valuetwo) + "");
                    addition = false;
                }
                if (subtraction == true) {
                    valuetwo = Double.parseDouble((str.substring(str.lastIndexOf("-") + 1, str.length())));
                    tv_num.setText(String.valueOf(valueone) + "-" + String.valueOf(valuetwo));
                    tv_result.setText((valueone - valuetwo) + "");
                    subtraction = false;
                }
                if (multiplication == true) {
                    valuetwo = Double.parseDouble((str.substring(str.lastIndexOf("*") + 1, str.length())));
                    tv_num.setText(String.valueOf(valueone) + "*" + String.valueOf(valuetwo));
                    tv_result.setText((valueone * valuetwo) + "");
                    multiplication = false;
                }
                if (division == true) {
                    valuetwo = Double.parseDouble((str.substring(str.lastIndexOf("/") + 1, str.length())));
                    tv_num.setText(String.valueOf(valueone) + "/" + String.valueOf(valuetwo));
                    tv_result.setText((valueone / valuetwo) + "");
                    division = false;
                }
            }

        });

    }

    private void transparentStatusAndNavigation() {
        //make full transparent statusBar
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            );
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            getWindow().setNavigationBarColor(Color.TRANSPARENT);
        }
    }

    private void setWindowFlag(final int bits, boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}
