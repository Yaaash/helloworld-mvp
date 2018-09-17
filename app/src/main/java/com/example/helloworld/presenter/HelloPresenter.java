package com.example.helloworld.presenter;

import android.view.View;

import com.example.helloworld.contract.HelloContract;
import com.example.helloworld.model.HelloModel;

/**
 * This class holds all the logic in it and provide interaction with or acts as a
 * mediator between View and Model
 */
public class HelloPresenter implements HelloContract.Presenter {

    private HelloContract.View view;
    private HelloContract.Model model;

    public HelloPresenter(HelloContract.View view) {
        this.view = view;
        init();
    }

    /**
     * Set your presenter here
     */
    private void init() {
        // create new Model
        model = new HelloModel();
        // initialise the view
        view.initView();
    }

    @Override
    public void onClick(View view) {
        String text = model.getData();
        this.view.setViewData(text);
    }
}
