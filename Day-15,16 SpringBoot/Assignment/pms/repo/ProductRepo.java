package com.coforge.pms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.pms.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    // Derived Query Methods

    public List<Product> findByPname(String pname);

    public void deleteByPname(String pname);

    public List<Product> findByQuantity(int quantity);

    public int deleteByQuantity(int quantity);

    public List<Product> findByPrice(double price);

    @Query("select p from Product p where p.price between ?1 and ?2")
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice);

    // Custom Queries

    @Query("select pid from Product")
    public List<Integer> getPids();

    @Query("select count(*), sum(price), min(price), max(price) from Product")
    public String getInfo();

}