package com.coforge.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.coforge.pms.exception.InvalidProductObjectException;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

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
    public ResponseEntity<String> saveProduct(@RequestBody Product product) {

        ResponseEntity<String> responseEntity = null;

        try {

            boolean status = service.saveProduct(product);

            if (status) {
                responseEntity = new ResponseEntity<>(
                        environment.getProperty("pms.save.success"),
                        HttpStatus.CREATED);
            }

        } catch (InvalidProductObjectException e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.save.fail"),
                    HttpStatus.BAD_REQUEST);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.save.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @PutMapping("/products/{pid}")
    public ResponseEntity<String> updateProduct(@PathVariable("pid") int pid,
                                                @RequestBody Product product) {

        ResponseEntity<String> responseEntity = null;

        try {

            boolean status = service.updateProduct(pid, product);

            if (status) {
                responseEntity = new ResponseEntity<>(
                        environment.getProperty("pms.update.success"),
                        HttpStatus.CREATED);
            }

        } catch (ProductNotFoundException e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.update.fail"),
                    HttpStatus.BAD_REQUEST);

        } catch (InvalidProductObjectException e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.update.fail"),
                    HttpStatus.BAD_REQUEST);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.update.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @DeleteMapping("/products/{pid}")
    public ResponseEntity<String> deleteByPid(@PathVariable("pid") int pid) {

        ResponseEntity<String> responseEntity = null;

        try {

            boolean status = service.deleteByPid(pid);

            if (status) {
                responseEntity = new ResponseEntity<>(
                        environment.getProperty("pms.delete.success"),
                        HttpStatus.OK);
            }

        } catch (InvalidProductObjectException e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.fail"),
                    HttpStatus.BAD_REQUEST);

        } catch (ProductNotFoundException e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.fail"),
                    HttpStatus.BAD_REQUEST);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @DeleteMapping("/products/pname/{pname}")
    public ResponseEntity<?> deleteByPname(@PathVariable("pname") String pname) {

        ResponseEntity<?> responseEntity = null;

        try {

            boolean status = service.deleteByPname(pname);

            if (status) {
                responseEntity = new ResponseEntity<>(
                        environment.getProperty("pms.delete.success"),
                        HttpStatus.OK);
            }

        } catch (InvalidProductObjectException e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.fail"),
                    HttpStatus.BAD_REQUEST);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products/{pid}")
    public ResponseEntity<?> getByPid(@PathVariable int pid) {

        ResponseEntity<?> responseEntity = null;

        try {

            Optional<Product> product = service.getByPid(pid);

            if (product.isPresent()) {
                responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
            }

        } catch (InvalidProductObjectException e) {

            responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

        } catch (ProductNotFoundException e) {

            responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products/pname/{pname}")
    public ResponseEntity<?> getByPname(@PathVariable("pname") String pname) {

        ResponseEntity<?> responseEntity = null;

        try {

            List<Product> products = service.findByPname(pname);

            responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        } catch (InvalidProductObjectException e) {

            responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.delete.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products")
    public ResponseEntity<?> findAll() {

        ResponseEntity<?> responseEntity = null;

        try {

            List<Product> products = service.findAll();

            responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.findall.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products/price/{price}")
    public ResponseEntity<?> findByPrice(@PathVariable double price) {

        ResponseEntity<?> responseEntity = null;

        try {

            List<Product> products = service.findByPrice(price);

            responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.db.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products/quantity/{quantity}")
    public ResponseEntity<?> findByQuantity(@PathVariable int quantity) {

        ResponseEntity<?> responseEntity = null;

        try {

            List<Product> products = service.findByQuantity(quantity);

            responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.db.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products/pricerange/{min}/{max}")
    public ResponseEntity<?> getProductsByPriceRange(@PathVariable double min,
                                                     @PathVariable double max) {

        ResponseEntity<?> responseEntity = null;

        try {

            List<Product> products = service.getProductsByPriceRange(min, max);

            responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.db.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products/pids")
    public ResponseEntity<?> getPidsList() {

        ResponseEntity<?> responseEntity = null;

        try {

            List<Integer> pids = service.getPidsList();

            responseEntity = new ResponseEntity<>(pids, HttpStatus.OK);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.db.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/products/info")
    public ResponseEntity<?> getInfo() {

        ResponseEntity<?> responseEntity = null;

        try {

            String info = service.getInfo();

            responseEntity = new ResponseEntity<>(info, HttpStatus.OK);

        } catch (Exception e) {

            responseEntity = new ResponseEntity<>(
                    environment.getProperty("pms.db.fail"),
                    HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }
}