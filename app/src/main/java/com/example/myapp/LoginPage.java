package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText txtID, txtPW;
    Button btkDangNhap, btkDangKy;

    private void anh_xa_a2()
    {

        txtID = (EditText) findViewById(R.id.editTextID);
        txtPW = (EditText) findViewById(R.id.editTextPW);

        btkDangKy   = (Button) findViewById(R.id.buttonDangKy);
        btkDangNhap = (Button) findViewById(R.id.buttonDangNhap);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        anh_xa_a2();

        btkDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(txtID.getText().toString().equals("123")&&txtPW.getText().toString().equals("123"))
                {
                    Toast.makeText(LoginPage.this,"Đăng Nhập Thành Công",Toast.LENGTH_SHORT).show();
                    Intent intent_home = new Intent();
                    intent_home.setClass(LoginPage.this,HomePage.class);
                    startActivity(intent_home);
                }
            }
        });
        btkDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_dangky = new Intent();
                intent_dangky.setClass(LoginPage.this,SignUpPage.class);
                startActivity(intent_dangky);
            }
        });


    }
}