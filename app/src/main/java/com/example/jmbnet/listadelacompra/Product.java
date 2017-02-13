package com.example.jmbnet.listadelacompra;

public class Product {
    //private variables
    int _id;
    String _name;
    double _price;

    // Empty constructor
    public Product() {

    }

    // constructor
    public Product(int id, String name, double _price) {
        this._id = id;
        this._name = name;
        this._price = _price;
    }

    // constructor
    public Product(String name, double _price) {
        this._name = name;
        this._price = _price;
    }

    // getting ID
    public int getID() {
        return this._id;
    }

    // setting id
    public void setID(int id) {
        this._id = id;
    }

    // getting name
    public String getName() {
        return this._name;
    }

    // setting name
    public void setName(String name) {
        this._name = name;
    }

    // getting phone number
    public double getPrice() {
        return this._price;
    }

    // setting phone number
    public void setPrice(double price) {
        this._price = price;
    }
}