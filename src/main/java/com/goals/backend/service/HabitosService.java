package com.goals.backend.service;

import com.goals.backend.entities.Habito;
import com.goals.backend.repositories.HabitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitosService {

    @Autowired
    private HabitoRepository habitoRepository;

    public Habito save(Habito habito){
        try {
            return habitoRepository.saveAndFlush(habito);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Habito> findAll(){
        return habitoRepository.findAll();
    }

    public Optional<Habito> findById(Integer id){
        return habitoRepository.findById(id);
    }

    public void deleteById(Integer id){
        habitoRepository.deleteById(id);
    }

    /*
     * Impelementar o UPDATE
     * */
}
