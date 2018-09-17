package com.example.helloworld.model;

import com.example.helloworld.contract.HelloContract;

/**
 * Parse your data here, interact with Database other logic
 */
public class HelloModel implements HelloContract.Model {
    @Override
    public String getData() {
        return "Hello World";
    }
}
