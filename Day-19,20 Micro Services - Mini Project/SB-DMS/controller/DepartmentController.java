package com.coforge.dms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coforge.dms.model.Department;
import com.coforge.dms.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/dms")
@Validated
public class DepartmentController {

    private DepartmentService service;
    private Environment environment;

    @Autowired
    public DepartmentController(DepartmentService service, Environment environment) {
        this.service = service;
        this.environment = environment;
    }

  //  @PostMapping("/departments")
   // public ResponseEntity<String> saveDepartment(@Valid @RequestBody Department department) {

     //   boolean status = service.saveDepartment(department);

       // if (status) {
        //    return new ResponseEntity<>(
          //          environment.getProperty("dms.save.success"),
         //           HttpStatus.CREATED);
        //}

       // return null;
   // }

   // @PutMapping("/departments/{dno}")
 //   public ResponseEntity<String> updateDepartment(@PathVariable int dno,
//                                                   @Valid @RequestBody Department department) {
//
//        boolean status = service.updateDepartment(dno, department);
//
//        if (status) {
//            return new ResponseEntity<>(
//                    environment.getProperty("dms.update.success"),
//                    HttpStatus.OK);
//        }
//
//        return null;
//    }

   // @DeleteMapping("/departments/{dno}")
   // public ResponseEntity<String> deleteByDno(@PathVariable int dno) {

      //  boolean status = service.deleteByDno(dno);

      //  if (status) {
           // return new ResponseEntity<>(
         //           environment.getProperty("dms.delete.success"),
       //             HttpStatus.OK);
     //   }

   //     return null;
   // }

  //  @DeleteMapping("/departments/dname/{dname}")
  //  public ResponseEntity<String> deleteByDname(@PathVariable String dname) {

       // boolean status = service.deleteByDname(dname);

        // if (status) {
      //      return new ResponseEntity<>(
    //                environment.getProperty("dms.delete.success"),
  //                  HttpStatus.OK);
//        }

    //    return null;
  //  }

    @GetMapping("/departments/{dno}")
    public ResponseEntity<?> getByDno(@PathVariable int dno) {

        Optional<Department> department = service.getByDno(dno);

        if (department.isPresent()) {
            return new ResponseEntity<>(department, HttpStatus.OK);
        }

        return null;
    }

//    @GetMapping("/departments/dname/{dname}")
//    public ResponseEntity<?> getByDname(@PathVariable String dname) {
//
//        List<Department> departments = service.findByDname(dname);
//
//        return new ResponseEntity<>(departments, HttpStatus.OK);
//    }

    @GetMapping("/departments")
    public ResponseEntity<?> findAll() {

        List<Department> departments = service.findAll();

        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
//
//    @GetMapping("/departments/dnos")
//    public ResponseEntity<?> getDnosList() {
//
//        List<Integer> dnos = service.getDnosList();
//
//        return new ResponseEntity<>(dnos, HttpStatus.OK);
//    }
//
//    @GetMapping("/departments/info")
//    public ResponseEntity<?> getInfo() {
//
//        String info = service.getInfo();
//
//        return new ResponseEntity<>(info, HttpStatus.OK);
//    }
}