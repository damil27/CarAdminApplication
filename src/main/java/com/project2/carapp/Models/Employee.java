package com.project2.carapp.Models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Employee extends Person {
    @ManyToOne
    @JoinColumn(name = "employeeTypeid", insertable = false, updatable = false)
    private EmployeeType employeeType;
    private Integer employeeTypeid;
    private String photo;
    private String username;
    @ManyToOne
    @JoinColumn(name = "jobtitleid", insertable = false, updatable = false)
    private JobTitle jobTitle;
    private Integer jobtitleid;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date hiredate;
}
