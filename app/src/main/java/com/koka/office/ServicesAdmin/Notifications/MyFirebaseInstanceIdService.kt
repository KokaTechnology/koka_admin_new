package com.koka.office.ServicesAdmin.Notifications


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.iid.FirebaseInstanceId.getInstance
import com.google.firebase.messaging.FirebaseMessagingService

@Suppress("DEPRECATION")
class MyFirebaseInstanceIdService : FirebaseMessagingService() {

    override fun onNewToken(p0: String) {

        val firebaseUser= FirebaseAuth.getInstance().currentUser


        var refreshToken= getInstance().getToken()
        if(firebaseUser!=null){
            updateToken(refreshToken)
        }


    }

    private fun updateToken(refreshToken: String?) {
        val firebaseUser= FirebaseAuth.getInstance().currentUser
        val ref=FirebaseDatabase.getInstance().reference.child("Tokens")
        val token= Token(refreshToken!!)

        ref.child(firebaseUser!!.uid).setValue(token)

    }



}
