package com.realestate.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.realestate.Model.PropertyImagesModel;

public interface PropertyImagesRepository extends CrudRepository<PropertyImagesModel, Long>{

	
	

}
