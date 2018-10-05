package com.demo.ui.products;
 
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.demo.adapter.ProductAdapter;
import com.demo.R;
import com.demo.model.Product;

import java.util.ArrayList;
import java.util.List;
 
public class ProductActivity extends AppCompatActivity {
 
    //a list to store all the products
    List<Product> productList;
 
    //the recyclerview
    RecyclerView recyclerView;
    ProductContract.Presenter mpresenter;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
 
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
 
        //initializing the productlist
        productList = new ArrayList<>();
 
 
        //adding some items to our list
        productList.add(new Product(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.kkk));
 
        productList.add(
                new Product(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        60000,
                        R.drawable.kkk));
 
        productList.add(
                new Product(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.kkk));
 
        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);
 
        //setting adapter to recyclerview
        recyclerView.setAdapter(mpresenter.getAdapter(this));
    }
}