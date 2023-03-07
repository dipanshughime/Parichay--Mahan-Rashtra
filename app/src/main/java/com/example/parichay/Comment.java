package com.example.parichay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.atomic.DoubleAccumulator;

public class Comment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        final EditText name =findViewById(R.id.nameid);
        final EditText review=findViewById(R.id.reviewid);
        Button add=findViewById(R.id.addbtn);
        DAOPerson doa=new DAOPerson();

        add.setOnClickListener(v ->
        {
            Person per=new Person(name.getText().toString(),review.getText().toString());
            doa.add(per).addOnSuccessListener(suc->{
                Toast.makeText(this, "Review added", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->{
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });

        });

    }

}