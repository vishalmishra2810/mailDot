package com.example.maildot;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class emailSection extends AppCompatActivity {

    private void sendMessage() {
        final ProgressDialog dialog = new ProgressDialog (emailSection.this);
        dialog.setTitle ("Sending Email");
        dialog.setMessage ("Please wait");
        dialog.show ();
        Thread sender = new Thread (new Runnable () {
            @Override
            public void run() {
                try {
                    GMailSender sender = new GMailSender ("youremail", "yourpassword");
                    sender.sendMail ("EmailSender App",
                            "This is the message body",
                            "youremail",
                            "your recipient's email");
                    dialog.dismiss ();
                } catch (Exception e) {
                    Log.e ("mylog", "Error: " + e.getMessage ());
                }
            }
        });
        sender.start ();
    }
}
