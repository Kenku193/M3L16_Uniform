package org.example.adapter;

import java.util.List;

public class DbAdapter implements Database {

    SpecificClass specificClass = new SpecificClass();

    @Override
    public void insert() {
        specificClass.save();
    }

    @Override
    public void update() {
        specificClass.renew();
    }

    @Override
    public void select() {
        specificClass.take();
    }

    @Override
    public void delete() {
        specificClass.remove();
    }

}
