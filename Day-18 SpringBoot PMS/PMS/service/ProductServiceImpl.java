package com.coforge.pms.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo repo;

    @Autowired
    public ProductServiceImpl(ProductRepo repo) {
        this.repo = repo;
    }

    @Override
    public boolean saveProduct(Product product) {

       
            repo.save(product);
            return true;

    }

    @Override
    public boolean updateProduct(int pid, Product product) {
            

            repo.save(product);
            return true;
    }

    @Override
    public boolean deleteByPid(int pid) {

           

            repo.deleteById(pid);
            return true;

    }

    @Override
    @Transactional
    public boolean deleteByPname(String pname) {

       

            repo.deleteByPname(pname);
            return true;

    }

    @Override
    public Optional<Product> getByPid(int pid) {
       

            Optional<Product> product = repo.findById(pid);
            return product;

        
    }

    @Override
    public List<Product> findAll() {

        List<Product> list = (List<Product>) repo.findAll();
        return list;
    }

    @Override
    public List<Product> findByPname(String pname) {

            return repo.findByPname(pname);

       
    }

    @Override
    public List<Product> findByPrice(double price)  {

            return repo.findByPrice(price);

        
    }

    @Override
    public List<Product> findByQuantity(int quantity) {

            return repo.findByQuantity(quantity);

    }

    
    @Override
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice) {

        return repo.getProductsByPriceRange(minPrice, maxPrice);
    }

    @Override
    public List<Integer> getPidsList() {

        return repo.getPids();
    }

    @Override
    public String getInfo() {

        return repo.getInfo();
    }
}