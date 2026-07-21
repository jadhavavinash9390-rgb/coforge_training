package com.coforge.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/pms")
public class ProductController {

    private ProductService service;

    private Environment environment;

    @Autowired
    public ProductController(ProductService service, Environment environment) {
        super();
        this.service = service;
        this.environment = environment;
    }

    @PostMapping("/products")
    public ResponseEntity<String> saveProduct(@Valid @RequestBody Product product) {

        boolean status = service.saveProduct(product);

        if (status) {
            return new ResponseEntity<>(
                    environment.getProperty("pms.save.success"),
                    HttpStatus.CREATED);
        }

        return null;
    }

    @PutMapping("/products/{pid}")
    public ResponseEntity<String> updateProduct(@PathVariable int pid,
                                                @Valid @RequestBody Product product) {

        boolean status = service.updateProduct(pid, product);

        if (status) {
            return new ResponseEntity<>(
                    environment.getProperty("pms.update.success"),
                    HttpStatus.CREATED);
        }

        return null;
    }

    @DeleteMapping("/products/{pid}")
    public ResponseEntity<String> deleteByPid(@PathVariable int pid) {

        ResponseEntity<String> responseEntity = null;

        boolean status = service.deleteByPid(pid);

        if (status) {
            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.success"),
                    HttpStatus.OK);
        }

        return responseEntity;
    }

    @DeleteMapping("/products/pname/{pname}")
    public ResponseEntity<?> deleteByPname(@PathVariable String pname) {

        ResponseEntity<?> responseEntity = null;

        boolean status = service.deleteByPname(pname);

        if (status) {
            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.success"),
                    HttpStatus.OK);
        }

        return responseEntity;
    }

    @GetMapping("/products/{pid}")
    public ResponseEntity<?> getByPid(@PathVariable int pid) {

        ResponseEntity<?> responseEntity = null;

        Optional<Product> product = service.getByPid(pid);

        if (product.isPresent()) {
            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
        }

        return responseEntity;
    }

    @GetMapping("/products/pname/{pname}")
    public ResponseEntity<?> getByPname(@PathVariable String pname) {

        ResponseEntity<?> responseEntity = null;

        List<Product> products = service.findByPname(pname);

        responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping("/products")
    public ResponseEntity<?> findAll() {

        ResponseEntity<?> responseEntity = null;

        List<Product> products = service.findAll();

        responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping("/products/price/{price}")
    public ResponseEntity<?> findByPrice(@PathVariable double price) {

        ResponseEntity<?> responseEntity = null;

        List<Product> products = service.findByPrice(price);

        responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping("/products/quantity/{quantity}")
    public ResponseEntity<?> findByQuantity(@PathVariable int quantity) {

        ResponseEntity<?> responseEntity = null;

        List<Product> products = service.findByQuantity(quantity);

        responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping("/products/pricerange/{min}/{max}")
    public ResponseEntity<?> getProductsByPriceRange(@PathVariable double min,
                                                     @PathVariable double max) {

        ResponseEntity<?> responseEntity = null;

        List<Product> products = service.getProductsByPriceRange(min, max);

        responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping("/products/pids")
    public ResponseEntity<?> getPidsList() {

        ResponseEntity<?> responseEntity = null;

        List<Integer> pids = service.getPidsList();

        responseEntity = new ResponseEntity<>(pids, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping("/products/info")
    public ResponseEntity<?> getInfo() {

        ResponseEntity<?> responseEntity = null;

        String info = service.getInfo();

        responseEntity = new ResponseEntity<>(info, HttpStatus.OK);

        return responseEntity;
    }
}