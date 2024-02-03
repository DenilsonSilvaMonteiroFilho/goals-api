package com.goals.backend.service;

import com.goals.backend.entities.Meta;
import com.goals.backend.repositories.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetaService {

    @Autowired
    private MetaRepository metaRepository;

    public Meta save(Meta meta){
        try {
            return metaRepository.saveAndFlush(meta);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Meta> findAll(){
        return metaRepository.findAll();
    }

    public Optional<Meta> findById(Integer id){
        return metaRepository.findById(id);
    }

    /*
    * Impelementar o UPDATE
    * */
}
