package com.example.helloworld.contract;

import android.view.View;

/**
 * This class provides rules for all the other classes - Model/View/Presenter
 */
public interface HelloContract {

    /**
     * Rule for View
     */
    interface View {
        void initView();

        void setViewData(String text);
    }

    /**
     * Rule for Models
     */
    interface Model {
        String getData();
    }

    /**
     * Rule for Default View
     */
    interface Presenter {
        void onClick(android.view.View view);
    }
}
