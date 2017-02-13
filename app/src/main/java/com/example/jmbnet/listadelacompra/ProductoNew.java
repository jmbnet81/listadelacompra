package com.example.jmbnet.listadelacompra;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class ProductoNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_new);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        EditText t = (EditText) findViewById(R.id.Nombre);
        t.setText(getIntent().getExtras().getString("Mensaje"));
    }

    public void AddPrice(View view) {
        DatabaseHandler db = new DatabaseHandler(this.getParent());
        EditText nombre = (EditText) findViewById(R.id.Nombre);
        EditText precio = (EditText) findViewById(R.id.Precio);

        db.addProduct(new Product(nombre.getText().toString(), Double.parseDouble(precio.getText().toString())));
        List<Product> products = db.getAllProducts();

        for (Product pr : products) {
            String log = "Id: " + pr.getID() + " ,Name: " + pr.getName() + " ,Precio: " + pr.getPrice();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}
