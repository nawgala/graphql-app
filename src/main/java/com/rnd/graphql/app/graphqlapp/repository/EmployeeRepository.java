package com.rnd.graphql.app.graphqlapp.repository;

import com.rnd.graphql.app.graphqlapp.domain.Link;
import com.rnd.graphql.app.graphqlapp.domain.emplyee.Employee;
import com.rnd.graphql.app.graphqlapp.domain.emplyee.Manager;
import com.rnd.graphql.app.graphqlapp.domain.emplyee.SE;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private final List<Employee> employeeList;

    public EmployeeRepository() {
        this.employeeList= new ArrayList<>();

        employeeList.add(new Manager(1001l));
        employeeList.add(new Manager(1002l));
        employeeList.add(new SE(1003l));

    }


    public List<Employee> getLinkList() {
        return employeeList;
    }

    public boolean saveManager(Manager emplyee) {
        return employeeList.add(emplyee);
    }
}
