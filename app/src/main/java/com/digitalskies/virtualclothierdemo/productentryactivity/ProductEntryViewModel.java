package com.digitalskies.virtualclothierdemo.productentryactivity;

import android.app.Application;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.digitalskies.virtualclothierdemo.Repository;
import com.digitalskies.virtualclothierdemo.models.Product;

import java.util.List;

public class ProductEntryViewModel extends AndroidViewModel {
    private ProductEntryViewModel productEntryViewModel;
    private final Repository repository;

    public ProductEntryViewModel(@NonNull Application application) {
        super(application);
        repository = Repository.getRepository();
        }

        public void createProduct(String productName, String productCategory, int price, Uri imageUri){
        repository.createProduct(productName,productCategory,price,imageUri);

        }
        public LiveData<List<Product>> productListChanged(){
        return repository.productList();
        }
        public  LiveData<Integer> getUploadStatus(){
        return repository.getProductUploadStatus();
        }
    }



