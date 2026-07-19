package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.pms.exception.InvalidProductObjectException;
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
    public boolean saveProduct(Product product)
            throws InvalidProductObjectException {

        if (product != null &&
                product.getPid() > 0 &&
                product.getPname() != null &&
                product.getPrice() > 0 &&
                product.getQuantity() > 0) {

            repo.save(product);
            return true;

        } else {
            throw new InvalidProductObjectException();
        }
    }

    @Override
    public boolean updateProduct(int pid, Product product)
            throws InvalidProductObjectException, ProductNotFoundException {

        if (pid > 0 &&
                product != null &&
                product.getPid() > 0 &&
                product.getPname() != null &&
                product.getPrice() > 0 &&
                product.getQuantity() > 0) {

            if (!repo.existsById(pid)) {
                throw new ProductNotFoundException();
            }

            repo.save(product);
            return true;

        } else {
            throw new InvalidProductObjectException();
        }
    }

    @Override
    public boolean deleteByPid(int pid)
            throws InvalidProductObjectException,
                   EmptyResultDataAccessException,
                   ProductNotFoundException {

        if (pid > 0) {

            if (!repo.existsById(pid)) {
                throw new ProductNotFoundException();
            }

            repo.deleteById(pid);
            return true;

        } else {
            throw new InvalidProductObjectException();
        }
    }

    @Override
    @Transactional
    public boolean deleteByPname(String pname)
            throws InvalidProductObjectException {

        if (pname != null) {

            repo.deleteByPname(pname);
            return true;

        } else {
            throw new InvalidProductObjectException();
        }
    }

    @Override
    public Optional<Product> getByPid(int pid)
            throws InvalidProductObjectException,
                   ProductNotFoundException {

        if (pid > 0) {

            if (!repo.existsById(pid)) {
                throw new ProductNotFoundException();
            }

            Optional<Product> product = repo.findById(pid);
            return product;

        } else {
            throw new InvalidProductObjectException();
        }
    }

    @Override
    public List<Product> findAll() {

        List<Product> list = (List<Product>) repo.findAll();
        return list;
    }

    @Override
    public List<Product> findByPname(String pname)
            throws InvalidProductObjectException {

        if (pname != null) {

            return repo.findByPname(pname);

        } else {
            throw new InvalidProductObjectException();
        }
    }

    @Override
    public List<Product> findByPrice(double price)
            throws InvalidProductObjectException {

        if (price > 0) {

            return repo.findByPrice(price);

        } else {
            throw new InvalidProductObjectException();
        }
    }

    @Override
    public List<Product> findByQuantity(int quantity)
            throws InvalidProductObjectException {

        if (quantity > 0) {

            return repo.findByQuantity(quantity);

        } else {
            throw new InvalidProductObjectException();
        }
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