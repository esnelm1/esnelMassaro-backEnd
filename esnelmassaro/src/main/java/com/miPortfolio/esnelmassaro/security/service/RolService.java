
package com.miPortfolio.esnelmassaro.security.service;

import com.miPortfolio.esnelmassaro.security.enums.RolNombre;
import com.miPortfolio.esnelmassaro.security.model.Rol;
import com.miPortfolio.esnelmassaro.security.repository.IRolRepository;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired 
    IRolRepository rolRepo;
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepo.save(rol);
    }
}
