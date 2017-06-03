package ar.com.buildingways.controlDeStock.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.buildingways.controlDeStock.service.UserService;
import ar.com.buildingways.controlDeStock.model.User;
import ar.com.buildingways.controlDeStock.model.UserProfile;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
	
	static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
    
    @Autowired
    private UserService userService;
     
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
        User user = userService.findBySSO(ssoId);
        logger.info("Usuario: {}", user);
        if(user==null){
            logger.info("No se encontró el usuario.");
            throw new UsernameNotFoundException("No se encontró el nombre de usuario.");
        }
        return new org.springframework.security.core.userdetails.User(user.getSsoId(), user.getPassword(), 
               true, true, true, true, getGrantedAuthorities(user));
    }
 
    private List<GrantedAuthority> getGrantedAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
         
        for(UserProfile userProfile : user.getUserProfiles()){
            logger.info("Perfil de usuario: {}", userProfile);
            authorities.add(new SimpleGrantedAuthority("ROLE_"+userProfile.getType()));
        }
        logger.info("autoridades: {}", authorities);
        return authorities;
    }
}
