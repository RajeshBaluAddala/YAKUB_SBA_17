package com.yakub.service;

import com.yakub.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product prd);
    public void deleteProduct(Integer pId);
    public Product getOneProduct(Integer pId);
    public List<Product> getAllProduct();
    public Product updateProduct(Product prd,Integer pId);
}
