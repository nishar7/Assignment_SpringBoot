package com.springrest.springrest.entity;
package com.springrest.springrest.services;

import com.springrest.springrest.model.Load;
import com.springrest.springrest.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoadService {

    @Autowired
    private LoadRepository loadRepository;

    public Load saveLoad(Load load) {
        return loadRepository.save(load);
    }

    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    public Load getLoadById(Long id) {
        return loadRepository.findById(id).orElse(null);
    }

    public Load updateLoad(Long id, Load load) {
        if(loadRepository.existsById(id)) {
            load.setId(id);
            return loadRepository.save(load);
        }
        return null;
    }

    public void deleteLoad(Long id) {
        loadRepository.deleteById(id);
    }
}

