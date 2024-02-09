package com.goals.backend.controllers;

import com.goals.backend.entities.Meta;
import com.goals.backend.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/meta")
public class MetaController {

    @Autowired
    private MetaService metaService;

    @GetMapping()
    public  List<Meta> all(){
        return metaService.findAll();
    }

    @PostMapping()
    public  Meta novaMeta(@RequestBody Meta meta){
        return metaService.save(meta);
    }

    @GetMapping("/{id}")
    public  Meta findById(@PathVariable Integer id){
        return metaService.findById(id).orElseThrow();
    }

    @DeleteMapping()
    public void deleteById(@PathVariable Integer id){
        metaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Meta replace(@RequestBody Meta meta, @PathVariable Integer id){
        return metaService.replaceMeta(meta, id);
    }
}
