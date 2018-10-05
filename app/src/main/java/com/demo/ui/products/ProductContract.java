package com.demo.ui.products;

import android.app.Activity;

import com.demo.adapter.ProductAdapter;

public class ProductContract {

    interface View {

    }
    interface Presenter {

        ProductAdapter getAdapter(Activity activity);
    }
}
