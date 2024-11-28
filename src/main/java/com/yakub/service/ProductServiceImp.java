package com.yakub.service;

import com.yakub.model.Product;
import com.yakub.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepo prodRepo;

    @Override
    public Product saveProduct(Product prd) {

        double total=0.0,discount=0.0,gst=0.0,serCharges=0.0,invoice=0.0;
        total=prd.getPrice()*prd.getQty();
        if(total>50000)
        {
            discount=0.2*total;
            gst=0.17*total;
            serCharges=0.1*total;
            invoice=total-discount+gst+serCharges;
        }
        else
        {
            discount=0.15*total;
            gst=0.15*total;
            serCharges=0.1*total;
            invoice=total-discount+gst+serCharges;
        }
        prd.setTotal(total);
        prd.setDiscount(discount);
        prd.setGst(gst);
        prd.setServiceChgs(serCharges);
        prd.setInvoice(invoice);

        return prodRepo.save(prd);

    }

    @Override
    public void deleteProduct(Integer pId) {
        prodRepo.deleteById(pId);
    }

    @Override
    public Product getOneProduct(Integer pId) {
        return prodRepo.findById(pId).get();
    }

    @Override
    public List<Product> getAllProduct() {
        return prodRepo.findAll();
    }

    @Override
    public Product updateProduct(Product prd, Integer pId) {

        Product oldprd=prodRepo.findById(pId).get();

        oldprd.setName(prd.getName());
        oldprd.setPrice(prd.getPrice());
        oldprd.setQty(prd.getQty());

        return prodRepo.save(oldprd);
    }
}
