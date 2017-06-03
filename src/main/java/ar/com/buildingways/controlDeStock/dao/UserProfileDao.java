package ar.com.buildingways.controlDeStock.dao;

import java.util.List;

import ar.com.buildingways.controlDeStock.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();
    
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}
