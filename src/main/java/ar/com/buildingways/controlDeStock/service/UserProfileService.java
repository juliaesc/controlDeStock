package ar.com.buildingways.controlDeStock.service;

import java.util.List;

import ar.com.buildingways.controlDeStock.model.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);
	 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
}
