package ar.com.buildingways.controlDeStock.dao;

import java.util.List;

import ar.com.buildingways.controlDeStock.model.User;

public interface UserDao {

	User findById(int id);
    
    User findBySSO(String sso);
     
    void save(User user);
     
    void deleteBySSO(String sso);
     
    List<User> findAllUsers();
}
