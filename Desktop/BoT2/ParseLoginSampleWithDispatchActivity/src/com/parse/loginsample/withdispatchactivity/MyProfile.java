package com.parse.loginsample.withdispatchactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyProfile extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        findViewById(R.id.IFriends).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfile.this, InviteFriends.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.banksCards).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfile.this,BanksCards.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.tHistory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfile.this,TransactionHistory.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.pendingT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfile.this,PendingTransactions.class);
                startActivity(intent);
            }
        });

    }


}
