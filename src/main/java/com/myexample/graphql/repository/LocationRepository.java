package com.myexample.graphql.repository;

import com.myexample.graphql.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
