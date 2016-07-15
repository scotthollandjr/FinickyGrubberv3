package com.example.guest.grubbery.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guest.grubbery.Constants;
import com.example.guest.grubbery.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CatActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.searchButton) Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        ButterKnife.bind(this);

        mSearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mSearchButton) {
            Intent intent = new Intent(CatActivity.this, FoodListActivity.class);
            intent.putExtra("type", Constants.FIREBASE_CHILD_CAT_FOODS);
            startActivity(intent);
        }
    }
}
