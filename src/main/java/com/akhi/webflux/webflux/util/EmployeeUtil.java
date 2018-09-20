package com.akhi.webflux.webflux.util;

import java.util.ArrayList;
import java.util.List;

public  class EmployeeUtil {


    public static List<Employee> getEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("akhilesh",1L));
        employeeList.add(new Employee("tejas",2L));
        employeeList.add(new Employee("murthy",3L));
        employeeList.add(new Employee("nandu",4L));
        return employeeList;

    }
}
