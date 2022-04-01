package com.example.ass5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddProduct extends AppCompatActivity {

    public EditText number,title,stock,desp;
    public Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);


               save=findViewById(R.id.btnSave);
                number=findViewById(R.id.edtNumber);
                title=findViewById(R.id.edtTitle);
                stock=findViewById(R.id.edtStock);
                desp=findViewById(R.id.edtDes);

                save.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        String n=number.getText().toString();
                        String t=title.getText().toString();

                        Intent intent=new Intent(AddProduct.this,MainActivity.class);
                        intent.putExtra("pnumber",n);
                        intent.putExtra("ptitle",t);

                                startActivity(intent);

                    }


                });
    }
}