package com.rnd.graphql.app.graphqlapp.resolver;

import com.rnd.graphql.app.graphqlapp.domain.emplyee.Employee;
import com.rnd.graphql.app.graphqlapp.domain.emplyee.Manager;
import com.rnd.graphql.app.graphqlapp.domain.vehicle.BaseVehicle;
import com.rnd.graphql.app.graphqlapp.domain.vehicle.Car;
import com.rnd.graphql.app.graphqlapp.domain.vehicle.Van;
import com.rnd.graphql.app.graphqlapp.repository.EmployeeRepository;
import com.rnd.graphql.app.graphqlapp.repository.VehicleRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class EmployeeQueryResolver implements GraphQLQueryResolver {

    private final EmployeeRepository employeeRepository;

    public EmployeeQueryResolver(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<? extends Employee> findEmployeeList() {
        return employeeRepository.getLinkList();
    }
}


@Component
class EmployeeMutationResolver implements GraphQLMutationResolver {

    private final EmployeeRepository employeeRepository;

    public EmployeeMutationResolver(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Boolean saveManager(Long id) {
        return employeeRepository.saveManager(new Manager(id));
    }
}