package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.exception.InvalidProductObjectException;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;

public interface ProductService {

    public boolean saveProduct(Product product)
            throws InvalidProductObjectException;

    public boolean updateProduct(int pid, Product product)
            throws InvalidProductObjectException, ProductNotFoundException;

    public boolean deleteByPid(int pid)
            throws InvalidProductObjectException, ProductNotFoundException;

    public Optional<Product> getByPid(int pid)
            throws InvalidProductObjectException, ProductNotFoundException;

    public List<Product> findAll();

    public List<Product> findByPname(String pname)
            throws InvalidProductObjectException;

    public boolean deleteByPname(String pname)
            throws InvalidProductObjectException;

    public List<Product> findByPrice(double price)
            throws InvalidProductObjectException;

    public List<Product> findByQuantity(int quantity)
            throws InvalidProductObjectException;

    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice);

    public List<Integer> getPidsList();

    public String getInfo();
}