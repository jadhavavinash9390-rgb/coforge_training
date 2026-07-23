package com.coforge.dms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="department")
public class Department {

    @Id
    @Column(name="dno")
    @Positive(message="Department Number must be greater than 0")
    private int dno;

    @Column(name="dname",length=30)
    @NotBlank(message="Department Name cannot be blank")
    private String dname;

    public Department() {
    }

    public Department(int dno,String dname) {
        this.dno=dno;
        this.dname=dname;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno=dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname=dname;
    }

    @Override
    public String toString() {
        return "Department [dno=" + dno + ", dname=" + dname + "]";
    }

}