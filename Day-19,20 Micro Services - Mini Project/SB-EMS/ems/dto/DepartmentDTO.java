package com.coforge.ems.dto;

import jakarta.persistence.Column;



public class DepartmentDTO {


    private int dno;

    private String dname;

    public DepartmentDTO() {
    }

    public DepartmentDTO(int dno,String dname) {
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