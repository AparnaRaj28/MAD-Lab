import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bprod,bdiv,beq,ac;
EditText et;
String s;
    char op;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        bplus=(Button)findViewById(R.id.plus);
        bminus=(Button)findViewById(R.id.minus);
        bprod=(Button)findViewById(R.id.prod);
        bdiv=(Button)findViewById(R.id.div);
        ac=(Button)findViewById(R.id.ac);
        beq=(Button)findViewById(R.id.eq);
        et=(EditText) findViewById(R.id.et);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                et.setText(s+"0");
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                a=Integer.parseInt(s);
                op='+';
                et.setText("");
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                a=Integer.parseInt(s);
                op='-';
                et.setText("");
            }
        });
        bprod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                a=Integer.parseInt(s);
                op='*';
                et.setText("");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                a=Integer.parseInt(s);
                op='/';
                et.setText("");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et.getText().toString();
                b=Integer.parseInt(s);
                switch (op)
                {
                    case '+':
                        c=a+b;
                        break;
                    case '-':
                        c=a-b;
                        break;
                    case '*':
                        c=a*b;
                        break;
                    case '/':
                        c=a/b;
                        break;
                }
                et.setText(String.valueOf(c));
            }
        });

    }
}
