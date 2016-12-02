package pe.edu.utp.opusmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Users extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        findViewById(R.id.detail_view_user).setOnClickListener(new View.OnClickListener(){

                                                           @Override
                                                           public void onClick(View v){
                                                               Users.this.startActivity(new Intent(Users.this,UserDetail.class));
                                                           }
                                                       }

        );

    }

}
