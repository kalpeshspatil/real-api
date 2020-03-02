package com.realestate.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.realestate.Model.LoginModel;

public interface LoginRepository extends CrudRepository<LoginModel, Long>{

	Optional<LoginModel> findOneByUserEmailAndUserPsw(String email, String psw);

	

}
