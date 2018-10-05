package com.demo.ui.products;

import android.app.Activity;

import com.demo.adapter.ProductAdapter;

public class ProductPresenter implements ProductContract.Presenter {

    private ProductAdapter productAdapter;

    @Override
    public ProductAdapter getAdapter(Activity activity) {
        if (productAdapter == null)
        productAdapter = new ProductAdapter(activity, null);
        return productAdapter;
    }
}
