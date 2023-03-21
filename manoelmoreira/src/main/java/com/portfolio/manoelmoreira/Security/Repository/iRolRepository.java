
package com.portfolio.manoelmoreira.Security.Repository;

import com.portfolio.manoelmoreira.Security.Entity.Rol;
import com.portfolio.manoelmoreira.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
