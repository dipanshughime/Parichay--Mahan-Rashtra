package com.example.parichay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Registerpg extends AppCompatActivity {
    TextView alreadyHaveaccount;
    EditText inputemail, inputpassword, inputconformpassword;
    Button btnRegister;
    Button log;
    String emailPattern = "[a-zA-Z0-9 ._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;

    FirebaseAuth mAuth;
    FirebaseUser mUser;

    public Button resg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpg);


        resg = (Button) findViewById(R.id.yo);
        resg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registerpg.this, Main.class);
                startActivity(intent);
            }
        });
    }
}
// prev code

//package com.example.parichay;
//
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.ProgressDialog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//
//public class Registerpg extends AppCompatActivity {
//    EditText inputemail,inputpassword,inputconfirmpassword;
//    Button btnregister;
//    ProgressDialog progressDialog;
//    TextView inputlogintext;
//    FirebaseAuth mAuth;
//
//    FirebaseUser mUser;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        inputemail=(EditText)findViewById(R.id.editTextTextEmailAddress);
//        inputpassword=(EditText)findViewById(R.id.editTextTextPassword);
//        inputconfirmpassword=(EditText) findViewById(R.id.editTextTextPassword2);
//        btnregister=(Button)findViewById(R.id.yo);
//        inputlogintext=(TextView)findViewById(R.id.button8);
//        //progressDialog=new ProgressDialog(this);
//        mAuth=FirebaseAuth.getInstance();
//        mUser=mAuth.getCurrentUser();
//
//        btnregister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PerformAuth();
//            }
//        });
//
//        inputlogintext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Registerpg.this,loginpg.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    public void PerformAuth(){
//        String email=inputemail.getText().toString();
//        String password=inputpassword.getText().toString();
//        String confirmpassword=inputconfirmpassword.getText().toString();
//        if(email.equals("")||password.equals("")||confirmpassword.equals("")){
//            Toast.makeText(getApplicationContext(),"fill all the fields",Toast.LENGTH_LONG).show();
//        }
//        else if(!password.equals(confirmpassword)){
//            Toast.makeText(getApplicationContext(),"password  not matched",Toast.LENGTH_LONG).show();
//        }
//        else{
//            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if(task.isSuccessful()){
//                        Toast.makeText(getApplicationContext(),"Registration Successfull",Toast.LENGTH_LONG).show();
//                        Intent intent=new Intent(Registerpg.this,homepg.class);
//                        startActivity(intent);
//                    }
//                    else{
//
//                        Toast.makeText(getApplicationContext(),"Registration failed",Toast.LENGTH_LONG).show();
//
//                    }
//                }
//            });
//        }
//    }

        //alreadyHaveaccount = findViewById(R.id.textView3);
//        inputemail = findViewById(R.id.editTextTextEmailAddress);
//        inputpassword = findViewById(R.id.editTextTextPassword);
//        inputconformpassword = findViewById((R.id.editTextTextPassword2));
//        btnRegister = findViewById(R.id.button);
//        progressDialog = new ProgressDialog(this);
//        mAuth = FirebaseAuth.getInstance();
//        mUser = mAuth.getCurrentUser();
//
//        log = (Button) findViewById(R.id.button8);
//      log.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Intent intent = new Intent(Registerpg.this,loginpg.class);
//              startActivity(intent);
//          }
//      });
//
//
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PerForAuth();
//
//            }
//        });
//    }
//
//            private void PerForAuth() {
//                String email = inputemail.getText().toString();
//                String password = inputpassword.getText().toString();
//                String confrimpassword = inputconformpassword.getText().toString();
//
//
//                if (email.matches(emailPattern)){
//                    inputemail.setError("Enter Correct Email");
//
//                }else if (password.isEmpty() || password.length()>6)
//                {
//                    inputpassword.setError("Enter Proper Password");
//                }else if (!password.equals(confrimpassword)){
//                    inputpassword.setError("Password Not Match");
//
//                }else
//                {
//                    progressDialog.setMessage("Please Wait While Registration ...");
//                    progressDialog. setTitle("Registration");
//                    progressDialog.setCanceledOnTouchOutside(false);
//                    progressDialog.show();
//                    mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                progressDialog.dismiss();
//                                sendUserToNextActivity();
//                                Toast.makeText(Registerpg.this, "Registration Successful", Toast.LENGTH_SHORT).show();
//                            } else {
//                                progressDialog.dismiss();
//                                Toast.makeText(Registerpg.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
//
//                            }
//
//                        }
//
//                        private void sendUserToNextActivity() {
//                            Intent intent = new Intent(Registerpg.this,homepg.class);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
//
//                        startActivity(intent);
//                        }
//                    });
     //           }





