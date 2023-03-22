
package com.portfolio.manoelmoreira.Repository;

import com.portfolio.manoelmoreira.Entity.HyS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RHys extends JpaRepository<HyS, Integer>{
Optional<HyS> findByNombre(String nombre);
public boolean existsByNombre(String nombre);
}
    

