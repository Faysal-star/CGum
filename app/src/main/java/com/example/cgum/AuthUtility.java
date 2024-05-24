package com.example.cgum;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class AuthUtility {
    private FirebaseAuth auth;
    private static AuthUtility ins = null ;
    private AuthUtility() {}
    public static AuthUtility getInstance() {
        if(ins == null) {
            ins = new AuthUtility();
            ins.auth = FirebaseAuth.getInstance();
        }
        return ins;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }
}

