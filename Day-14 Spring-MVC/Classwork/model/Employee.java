package com.coforge.ems.model;

public class Employee {

    private int eid;
    private String ename;
    private double esalary;
    private String edepartment;
    private String eemail;
    private Address address;


    public Employee() {
    }

    public Employee(int eid, String ename, double esalary, String edepartment, String eemail) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
        this.edepartment = edepartment;
        this.eemail = eemail;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    public String getEdepartment() {
        return edepartment;
    }

    public void setEdepartment(String edepartment) {
        this.edepartment = edepartment;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee [eid=" + eid +
                ", ename=" + ename +
                ", esalary=" + esalary +
                ", edepartment=" + edepartment +
                ", eemail=" + eemail +
                ", address=" + address + "]";
    }
}