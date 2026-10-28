package com.example.quickstart;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class LoginActivity extends Activity {
 EditText email,password;
 @Override protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_login);email=findViewById(R.id.emailInput);password=findViewById(R.id.passwordInput);
 findViewById(R.id.loginButton).setOnClickListener(v->login());
 findViewById(R.id.forgotLink).setOnClickListener(v->startActivity(new Intent(this,ForgotPasswordActivity.class)));
 findViewById(R.id.registerLink).setOnClickListener(v->startActivity(new Intent(this,RegisterActivity.class))); }
 void login(){String em=email.getText().toString().trim(),pw=password.getText().toString(); if(em.isEmpty()||pw.isEmpty()){Ui.toast(this,"Please enter email and password");return;} android.content.SharedPreferences p=getSharedPreferences("account",MODE_PRIVATE); if(em.equals(p.getString("email","demo@quickstart.com"))&&pw.equals(p.getString("password","123456"))){startActivity(new Intent(this,HomeActivity.class));finish();}else Ui.toast(this,"Incorrect details. Register first or use demo@quickstart.com / 123456");}
}
