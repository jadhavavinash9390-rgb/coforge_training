package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;

public interface ProductService {

    public boolean saveProduct(Product product) ;

    public boolean updateProduct(int pid, Product product) ;

    public boolean deleteByPid(int pid) ;

    public Optional<Product> getByPid(int pid);

    public List<Product> findAll();

    public List<Product> findByPname(String pname) ;

    public boolean deleteByPname(String pname) ;

    public List<Product> findByPrice(double price) ;

    public List<Product> findByQuantity(int quantity) ;

    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice);

    public List<Integer> getPidsList();

    public String getInfo();
}