package com.example.myfirsthelloapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirsthelloapplication.utils.Calculator;


/**
 * 计算器类
 */

public class CalActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    TextView inputandgetresult;
    TextView outputtheexp;
    Button btn_plus;
    Button btn_minus;
    Button btn_divide;
    Button btn_multply;
    Button btn_point;
    Button btn_equal;
    Button btn_clear;
    Button btn_del;
    Button btn_sin;
    Button btn_cos;
    Button btn_leftBracket;
    Button btn_rightBracket;
    Button btn_tan;
    Button btn_mi;
//    Button btn_sqrt;
//    Button btn_square;
//    Button btn_cube;
//    Button btn_bin;
//    Button btn_oct;
//    Button btn_dec;
//    Button btn_hex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if(this.getResources().getConfiguration().orientation ==Configuration.ORIENTATION_PORTRAIT){
//            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//        }

        setContentView(R.layout.cal_layout);
        //


        //根据id获取view对象
        inputandgetresult = (TextView) findViewById(R.id.inputandgetresult);
        outputtheexp = (TextView) findViewById(R.id.outputtheexp);
        button0 = (Button) findViewById(R.id.btn_0);
        button1 = (Button) findViewById(R.id.btn_1);
        button2 = (Button) findViewById(R.id.btn_2);
        button3 = (Button) findViewById(R.id.btn_3);
        button4 = (Button) findViewById(R.id.btn_4);
        button5 = (Button) findViewById(R.id.btn_5);
        button6 = (Button) findViewById(R.id.btn_6);
        button7 = (Button) findViewById(R.id.btn_7);
        button8 = (Button) findViewById(R.id.btn_8);
        button9 = (Button) findViewById(R.id.btn_9);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multply = (Button) findViewById(R.id.btn_multply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_leftBracket = (Button) findViewById(R.id.btn_leftBracket);
        btn_rightBracket = (Button) findViewById(R.id.btn_rightBracket);
        btn_tan = (Button) findViewById(R.id.btn_tan);
        btn_mi = (Button)findViewById(R.id.btn_mi);
//        btn_sqrt = (Button) findViewById(R.id.btn_sqrt);
//        btn_square = (Button) findViewById(R.id.btn_square);
//        btn_cube = (Button) findViewById(R.id.btn_cube);
//        btn_bin = (Button) findViewById(R.id.btn_bin);
//        btn_oct = (Button) findViewById(R.id.btn_oct);
//        btn_dec = (Button) findViewById(R.id.btn_dec);
//        btn_hex = (Button) findViewById(R.id.btn_hex);
        //设置欢迎信息

        //绑定单击事件
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("9");
            }
        });
        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append(".");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("-");
            }
        });
        btn_multply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("*");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("/");
            }
        });
        btn_leftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("(");
            }
        });
        //左括号读入

        btn_rightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append(")");
            }
        });
        //右括号读入

        //幂符号
        btn_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("^");
            }
        });

        //正弦单击事件
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("sin(");
            }
        });

        //余弦单击事件
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputandgetresult.append("cos(");
            }
        });

        //正切符号
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inputandgetresult.append("tan(");

            }
        });
        //正切求值


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp = inputandgetresult.getText().toString();

            //    double result = Calculator.conversion(exp);
         //       Toast.makeText(CalActivity.this, "输入错误", Toast.LENGTH_LONG).show();
                if (Double.isNaN(Calculator.conversion(exp))) {
                    Toast.makeText(CalActivity.this, "输入错误,请检查表达式是否正确", Toast.LENGTH_LONG).show();
                }
                //if ()
                else {
                    outputtheexp.setText(inputandgetresult.getText().toString() + "=");
                    inputandgetresult.setText(Calculator.conversion(exp) + "");
                }


            }
        });
        //等于号，输出结果

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputtheexp.setText("");
                inputandgetresult.setText("");
            }
        });
        //清零

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = inputandgetresult.getText().toString();
                if (!"".equals(str)) {

                    String substring = str.substring(0, str.length() - 1);
                    inputandgetresult.setText(substring);
                }

            }
        });
        //回退

    }


    /**
     * 重写onCreateOptionsMenu方法，添加选项菜单
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //实例化MenuInflater对象，用于解析菜单资源文件，传递参数为上下文对象this
        MenuInflater menuInflater = new MenuInflater(this);
        //解析菜单资源文件，
        menuInflater.inflate(R.menu.menu_change, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * 重写onOptionsItemSelected，点击逻辑
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //分支判断哪个组件被点击
        switch (item.getItemId()) {
            case R.id.contactauthor:
                //创建intent对象用于activity转换
                Intent intent_contact = new Intent(CalActivity.this, ContactAuthorActivity.class);
                startActivity(intent_contact);
                break;
            case R.id.help:
                Intent intent_help = new Intent(CalActivity.this, HelpAvtivity.class);
                startActivity(intent_help);
                break;
            case R.id.unitconversion:
                Intent intent_unit = new Intent(CalActivity.this, UnitConversionActivity.class);
                startActivity(intent_unit);
                break;
            case R.id.binaryconversion:
                Intent intent_binary = new Intent(CalActivity.this, BinaryConversionActivity.class);
                startActivity(intent_binary);
                break;
            case R.id.calculator:
                Intent intent_cal = new Intent(CalActivity.this, CalActivity.class);
                startActivity(intent_cal);
                break;
            case R.id.exit:
                finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }



}


