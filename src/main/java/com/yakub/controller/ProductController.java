package com.yakub.controller;

import com.yakub.model.Product;
import com.yakub.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService prodService;

    @PostMapping("/save")
    public String saveProd(@RequestBody Product product){
        Product p1=prodService.saveProduct(product);
        String message;
        if(p1!=null){
            message="Product data inserted successfully...";
        }
        else
        {
            message="Product data Not inserted successfully...";
        }
        return message;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProd(@PathVariable Integer id)
    {
        prodService.deleteProduct(id);
    }

    @GetMapping("/get/{id}")
    public Product getOneProduct(@PathVariable Integer id)
    {
        return prodService.getOneProduct(id);
    }

    @GetMapping("/getAll")
    public List<Product> getAll()
    {
        return prodService.getAllProduct();
    }

    @PutMapping("/update/{id}")
    public Product update(@RequestBody Product prd,@PathVariable Integer id)
    {
        return prodService.updateProduct(prd, id);
    }



}
