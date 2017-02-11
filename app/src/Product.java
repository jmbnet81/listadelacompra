package com.example.jmbnet.listadelacompra;

public class Contact {
    //private variables
int _id;
        String _name;
        String _price;

// Empty constructor
public Contact(){

        }
// constructor
public Contact(int id, String name, String _price){
        this._id = id;
        this._name = name;
        this._price = _price;
        }

// constructor
public Contact(String name, String _price){
        this._name = name;
        this._price = _price;
        }
// getting ID
public int getID(){
        return this._id;
        }

// setting id
public void setID(int id){
        this._id = id;
        }

// getting name
public String getName(){
        return this._name;
        }

// setting name
public void setName(String name){
        this._name = name;
        }

// getting phone number
public String getPrice(){
        return this._price;
        }

// setting phone number
public void setPrice(String price){
        this._price = price;
        }
        }