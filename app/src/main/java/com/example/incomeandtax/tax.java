package com.example.incomeandtax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);

        EditText text1 = (EditText) findViewById(R.id.text1);
        EditText text2 = (EditText) findViewById(R.id.text2);
        EditText text3 = (EditText) findViewById(R.id.text3);
        EditText text4 = (EditText) findViewById(R.id.text4);
        EditText text5 = (EditText) findViewById(R.id.text5);
        EditText text6 = (EditText) findViewById(R.id.text6);
        EditText text7 = (EditText) findViewById(R.id.text7);

        EditText text8 = (EditText) findViewById(R.id.text8);


        TextView textView3 = (TextView) findViewById(R.id.textview3);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Double gs = Double.parseDouble(text1.getText().toString());
                Double hra = Double.parseDouble(text2.getText().toString());
                Double sd = Double.parseDouble(text3.getText().toString());
                if (sd > 50000) {
                    sd = sd - 50000;
                }
                Double bd = Double.parseDouble(text4.getText().toString());
                Double ti = gs - hra - sd + bd;
                Double epf = Double.parseDouble(text5.getText().toString());
                Double mi = Double.parseDouble(text6.getText().toString());
                Double ei = Double.parseDouble(text7.getText().toString());
                Double nps = Double.parseDouble(text8.getText().toString());
                if (nps > 50000) {
                    nps = nps - 50000;
                }
                Double netta = (ti - epf - mi - ei - nps);

                Double tax = null;
                if (netta <= 250000) {
                    tax = 0.0;
                    textView3.setText("Income tax amount is " + tax);
                } else if (netta <= 500000) {
                    //  Double  tax = (netta - 250000) * 0.05;

                    textView3.setText("Income tax amount is " + 0);
                } else if (netta < 1000000) {
                    tax = (netta - 500000) * 0.2 + 12500;

                    textView3.setText("Income tax amount is " + tax);
                } else {
                    tax = (netta - 1000000) * 0.3 + 12500 + 100000;
                    textView3.setText("Income tax amount is " + tax);
                }



         /*     final AlertDialog.Builder alert = new AlertDialog.Builder(tax.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog, null);
               alert.setView(mView);
                final AlertDialog alertDialog = alert.create();
               alertDialog.setCanceledOnTouchOutside(false);
                Button btn_cancel = (Button)mView.findViewById(R.id.btn_cancel);
                btn_cancel.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

               alertDialog.show();

*/
            }
        });
    /*    button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double gs =Double.parseDouble(text1.getText().toString());
                Double hra=Double.parseDouble(text2.getText().toString());
                Double sd =Double.parseDouble(text3.getText().toString());
                Double bd =Double.parseDouble(text4.getText().toString());
                Double ti=gs-hra-sd+bd;
                Double epf=Double.parseDouble(text5.getText().toString());
                Double mi=Double.parseDouble(text6.getText().toString());
                Double netta=ti-epf-mi;

                textView2.setText("Net Taxable Amount:"+" "+netta);



            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double gs =Double.parseDouble(text1.getText().toString());
                Double hra=Double.parseDouble(text2.getText().toString());
                Double sd =Double.parseDouble(text3.getText().toString());
                Double bd =Double.parseDouble(text4.getText().toString());
                Double ti=gs-hra-sd+bd;
                textView1.setText("Gross Taxable income:"+"   "+ti);

            }
        });

*/
    }
}