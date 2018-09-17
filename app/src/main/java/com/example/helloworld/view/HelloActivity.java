package com.example.helloworld.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.R;
import com.example.helloworld.contract.HelloContract;
import com.example.helloworld.presenter.HelloPresenter;

public class HelloActivity extends AppCompatActivity implements HelloContract.View {

    HelloPresenter helloPresenter;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        helloPresenter = new HelloPresenter(this);
    }

    @Override
    public void initView() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloPresenter.onClick(v);
            }
        });
    }

    @Override
    public void setViewData(String text) {
        textView.setText(text);
    }
}
