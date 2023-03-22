package com.portfolio.manoelmoreira.Service;

import com.portfolio.manoelmoreira.Entity.HyS;
import com.portfolio.manoelmoreira.Repository.RHys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SHys {
    @Autowired
    RHys rHys;

    public List<HyS> list() {
        return rHys.findAll();
    }

    public Optional<HyS> getOne(int id) {
        return rHys.findById(id);
    }

    public Optional<HyS> getByNombre(String nombre) {
        return rHys.findByNombre(nombre);
    }

    public void save(HyS skill) {
        rHys.save(skill);
    }

    public void delete(int id) {
        rHys.deleteById(id);
    }

    public boolean existsById(Integer id) {
        return rHys.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rHys.existsByNombre(nombre);
    }

}
