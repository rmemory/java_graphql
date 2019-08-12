package com.myexample.graphql.resolver;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.myexample.graphql.entity.Location;
import com.myexample.graphql.exception.LocationNotFoundException;
import com.myexample.graphql.repository.LocationRepository;

@Component
public class Query implements GraphQLQueryResolver {
    private LocationRepository locationRepository;

    public Query(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Iterable<Location> findLocation(Long id, String name) {
    	if (id == null && name == null)
    		return locationRepository.findAll();
    	else {
    		Optional<Location> optionalLocation = locationRepository.findById(id);
    		if (optionalLocation.isPresent()) {
    			return Arrays.asList(optionalLocation.get());
    		} else {
    			throw new LocationNotFoundException("Location Not Found", id);
    		}
    	}
    }
}
