package com.example.ryo.myapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText medtSex ,medtAge;
    private TextView mTxtR;
    private Button mbtnok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medtSex = (EditText) findViewById(R.id.edtSex);
        medtAge = (EditText) findViewById(R.id.edtAge);
        mTxtR = (TextView)  findViewById(R.id.txtR);
        mbtnok = (Button) findViewById(R.id.btnOK);

        mbtnok.setOnClickListener(btnOKOnClick);
    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener(){


        @Override
        public void onClick(View v){
            String strsex = medtSex.getText().toString();
            int iAge = Integer.parseInt(medtAge.getText().toString());
            String strSug = getString(R.string.txtR);

            if(strsex.equals(getString(R.string.sex_male)))
                if(iAge < 28)
                    strSug +=getString(R.string.sug_not_hurry);
                else if(iAge > 33)
                    strSug += getString(R.string.sug_get_married);
                else
                    strSug +=getString(R.string.sug_find_couple);
            else
                if(iAge < 25)
                    strSug += getString(R.string.sug_not_hurry);
                else if(iAge > 30)
                    strSug += getString(R.string.sug_get_married);
                else
                    strSug += getString(R.string.sug_find_couple);

            mTxtR.setText(strSug);
        }
    };




}
