 
package com.miPortfolio.esnelmassaro.repository;

import com.miPortfolio.esnelmassaro.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

  
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
