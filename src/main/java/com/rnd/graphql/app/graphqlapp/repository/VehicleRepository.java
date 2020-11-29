package com.rnd.graphql.app.graphqlapp.repository;

import com.rnd.graphql.app.graphqlapp.domain.vehicle.BaseVehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {
    private List<BaseVehicle> baseVehicleList;


    public VehicleRepository() {
        this.baseVehicleList = new ArrayList<>();
    }

    public boolean saveVehicle(BaseVehicle vehicle) {
        return baseVehicleList.add(vehicle);
    }

    public List<? extends BaseVehicle> findAll() {
        return baseVehicleList;
    }

}
