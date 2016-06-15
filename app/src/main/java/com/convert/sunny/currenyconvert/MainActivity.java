package com.convert.sunny.currenyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button convert;
    private EditText money;
    private TextView eur1,yen1,mxn1,hkd1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declare();
    }

    private void declare() {
        convert = (Button)findViewById(R.id.convert);
        convert.setOnClickListener(this);
        money= (EditText)findViewById(R.id.money);
        eur1= (TextView)findViewById(R.id.eur1);
        yen1= (TextView)findViewById(R.id.yen1);
        mxn1= (TextView)findViewById(R.id.mxn1);
        hkd1= (TextView)findViewById(R.id.hkd1);
    }

    public void onClick(View v) {
        String usdnum = money.getText().toString();
        switch (v.getId()){
            case R.id.convert:
                double eurdis = Double.parseDouble(usdnum)*.89;
                double yendis = Double.parseDouble(usdnum)*106.05;
                double mxndis = Double.parseDouble(usdnum)*18.83;
                double hkddis = Double.parseDouble(usdnum)*7.76;
                eur1.setText(String.valueOf(eurdis));
                yen1.setText(String.valueOf(yendis));
                mxn1.setText(String.valueOf(mxndis));
                hkd1.setText(String.valueOf(hkddis));
                break;
        }

    }
}
