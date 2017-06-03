package ar.com.buildingways.controlDeStock.service;

import java.util.List;

import ar.com.buildingways.controlDeStock.model.User;

public interface UserService {

	User findById(int id);
    
    User findBySSO(String sso);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserBySSO(String sso);
 
    List<User> findAllUsers(); 
     
    boolean isUserSSOUnique(Integer id, String sso);
}
