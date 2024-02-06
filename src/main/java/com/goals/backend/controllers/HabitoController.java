package com.goals.backend.controllers;

import com.goals.backend.entities.Habito;
import com.goals.backend.service.HabitosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/Habito")
public class HabitoController {
    @Autowired
    private HabitosService habitosService;

    @GetMapping()
    List<Habito> all(){
        return habitosService.findAll();
    }

    @PostMapping()
    Habito novaMeta(@RequestBody Habito habito){
        return habitosService.save(habito);
    }

    @GetMapping("/{id}")
    Habito findById(@PathVariable Integer id){
        return habitosService.findById(id).orElseThrow();
    }

    @DeleteMapping()
    public void deleteById(@PathVariable Integer id){
        habitosService.deleteById(id);
    }
}
