package com.example.parichay;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOPerson {
     private DatabaseReference databaseReference;
     public DAOPerson(){
       FirebaseDatabase db= FirebaseDatabase.getInstance();
       databaseReference= db.getReference(Person.class.getSimpleName());
     }
     public Task<Void> add(Person per){

            return  databaseReference.push().setValue(per);
     }


}
