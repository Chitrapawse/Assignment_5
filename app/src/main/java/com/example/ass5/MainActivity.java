package com.example.ass5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addBtn;
    TextView numberText, titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





                numberText = findViewById(R.id.edtNumber);
                titleText = findViewById(R.id.edtTitle);

                String pno = getIntent().getStringExtra("pnumber");
                String pt = getIntent().getStringExtra("ptitle");

                numberText.setText(pno);
                titleText.setText(pt);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddProduct.class));
            }
        });

    }
}

