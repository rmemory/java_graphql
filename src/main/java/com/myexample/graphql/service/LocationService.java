package com.myexample.graphql.service;

import java.util.List;

import com.myexample.graphql.entity.Location;

public interface LocationService {
    List<Location> retrieveLocations();
}
