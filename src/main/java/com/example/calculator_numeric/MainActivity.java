package com.example.calculator_numeric;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity
{
    private EditText edittext1, edittext2;
    private Button buttonSum,buttonSub,buttonMul,buttonDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton()
    {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        buttonSum = (Button) findViewById(R.id.btn1);
        buttonSum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;

                Toast.makeText(getApplicationContext(),"Addition is  :"+String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
        buttonSub = (Button) findViewById(R.id.btn2);
        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sub=a-b;
                Toast.makeText(getApplicationContext(),"Subtraction is :"+String.valueOf(sub), Toast.LENGTH_LONG).show();
            }
        });
        buttonMul = (Button) findViewById(R.id.btn3);
        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int mul=a*b;
                Toast.makeText(getApplicationContext(),"Multiplication is :"+String.valueOf(mul), Toast.LENGTH_LONG).show();
            }
        });
        buttonDiv = (Button) findViewById(R.id.btn4);
        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int div=a/b;
                Toast.makeText(getApplicationContext(),"Division is :"+String.valueOf(div), Toast.LENGTH_LONG).show();
            }
        });
    }
}
