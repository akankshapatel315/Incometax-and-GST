package com.example.incomeandtax;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gst extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst);
        EditText txt1 = (EditText) findViewById(R.id.txt1);
        EditText txt2 = (EditText) findViewById(R.id.txt2);
        TextView lbl1 =(TextView) findViewById(R.id.lbl6);
        TextView lbl2 =(TextView) findViewById(R.id.lbl2);
        TextView lbl3 =(TextView) findViewById(R.id.lbl3);
        TextView lbl4 =(TextView) findViewById(R.id.lbl4);
        TextView lbl5 =(TextView) findViewById(R.id.lbl5);
//        Button btn =(Button) findViewById(R.id.btn);

        txt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    double Amount = Double.parseDouble(txt1.getText().toString());
                    double Rate = Double.parseDouble(txt2.getText().toString());
                    double tax = Rate*Amount/100;
                    double totalamount=Amount+tax;
                    double cgst=tax/2;
                    double sgst=tax/2;
                    double igst=0.0;
                    lbl1.setText("I.G.S.T:"+"   "+ igst);
                    lbl2.setText("C.G.S.T:"+"   "+cgst);
                    lbl3.setText("S.G.S.T:"+"   "+sgst);
                    lbl4.setText("Total G.S.T:"+"   "+tax);
                    lbl5.setText("Total Amount:"+"   "+totalamount);


                }
                catch(Exception e)
                {
                    Log.v("State", e.getMessage());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(txt1.getText().toString().matches("") || txt2.getText().toString().matches(""))
                {
                    lbl1.setText("I.G.S.T:"+"   "+ 0.0);
                    lbl2.setText("C.G.S.T:"+"   "+0.0);
                    lbl3.setText("S.G.S.T:"+"   "+0.0);
                    lbl4.setText("Total G.S.T:"+"   "+0.0);
                    lbl5.setText("Total Amount:"+"   "+0.0);
                }

            }
        });

        txt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

                try
                {
                    double Amount = Double.parseDouble(txt1.getText().toString());
                    double Rate = Double.parseDouble(txt2.getText().toString());
                    double tax = Rate*Amount/100;
                    double totalamount=Amount+tax;
                    double cgst=tax/2;
                    double sgst=tax/2;
                    double igst=0.0;
                    lbl1.setText("I.G.S.T:"+"   "+ igst);
                    lbl2.setText("C.G.S.T:"+"   "+cgst);
                    lbl3.setText("S.G.S.T:"+"   "+sgst);
                    lbl4.setText("Total G.S.T:"+"   "+tax);
                    lbl5.setText("Total Amount:"+"   "+totalamount);

                    if(txt1.getText().toString()=="" || txt2.getText().toString()=="")
                    {
                        lbl1.setText("I.G.S.T:"+"   "+ 0.0);
                        lbl2.setText("C.G.S.T:"+"   "+0.0);
                        lbl3.setText("S.G.S.T:"+"   "+0.0);
                        lbl4.setText("Total G.S.T:"+"   "+0.0);
                        lbl5.setText("Total Amount:"+"   "+totalamount);
                    }
                }
                catch(Exception e)
                {
                    Log.v("State", e.getMessage());
                }


            }

            @Override
            public void afterTextChanged(Editable s)
            {



                if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty())
                {
                    lbl1.setText("I.G.S.T:"+"   "+ 0.0);
                    lbl2.setText("C.G.S.T:"+"   "+0.0);
                    lbl3.setText("S.G.S.T:"+"   "+0.0);
                    lbl4.setText("Total G.S.T:"+"   "+0.0);
                    lbl5.setText("Total Amount:"+"   "+0.0);
                }



            }


        });

     /*   btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (TextUtils.isEmpty(txt1.getText().toString() )|| TextUtils.isEmpty(txt2.getText().toString()))
                {
                    System.exit(0);

                }*/










/*

    }
});

*/


    }
}