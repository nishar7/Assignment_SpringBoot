package com.springrest.springrest.entity;
import com.springrest.springrest.services.LoadService;
import com.springrest.springrest.model.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    private LoadService loadService;

    @PostMapping
    public String addLoad(@RequestBody Load load) {
        loadService.saveLoad(load);
        return "loads details added successfully";
    }

    @GetMapping
    public List<Load> getLoadsByShipperId(@RequestParam String shipperId) {
        return loadService.getLoadsByShipperId(shipperId);
    }

    @GetMapping("/{loadId}")
    public Load getLoad(@PathVariable Long loadId) {
        return loadService.getLoadById(loadId);
    }

    @PutMapping("/{loadId}")
    public Load updateLoad(@PathVariable Long loadId, @RequestBody Load load) {
        return loadService.updateLoad(loadId, load);
    }

    @DeleteMapping("/{loadId}")
    public void deleteLoad(@PathVariable Long loadId) {
        loadService.deleteLoad(loadId);
    }
}

