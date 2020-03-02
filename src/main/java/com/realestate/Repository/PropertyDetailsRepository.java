package com.realestate.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.realestate.Model.PropertyDetailsModel;

public interface PropertyDetailsRepository extends CrudRepository<PropertyDetailsModel, Long> {

	List<PropertyDetailsModel> findOneByPropertyCity(String propertyCity);

}
