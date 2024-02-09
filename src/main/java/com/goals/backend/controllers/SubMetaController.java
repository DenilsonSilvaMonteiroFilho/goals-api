package com.goals.backend.controllers;

import com.goals.backend.entities.Habito;
import com.goals.backend.entities.Meta;
import com.goals.backend.entities.SubMeta;
import com.goals.backend.service.HabitosService;
import com.goals.backend.service.SubMetaService;
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
@RequestMapping(value = "api/subMeta")
public class SubMetaController {
    @Autowired
    private SubMetaService subMetaService;

    @GetMapping()
    public List<SubMeta> all(){
        return subMetaService.findAll();
    }

    @PostMapping()
    public SubMeta novaMeta(@RequestBody SubMeta subMeta){
        return subMetaService.save(subMeta);
    }

    @GetMapping("/{id}")
    public SubMeta findById(@PathVariable Integer id){
        return subMetaService.findById(id).orElseThrow();
    }

    @DeleteMapping()
    public void deleteById(@PathVariable Integer id){
        subMetaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public SubMeta replace(@RequestBody SubMeta subMeta, @PathVariable Integer id){
        return subMetaService.replaceSubMeta(subMeta, id);
    }
}
