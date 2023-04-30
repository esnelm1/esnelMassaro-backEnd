
package com.miPortfolio.esnelmassaro.security.repository;

import com.miPortfolio.esnelmassaro.security.enums.RolNombre;
import com.miPortfolio.esnelmassaro.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
