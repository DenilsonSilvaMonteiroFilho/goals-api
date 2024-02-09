package com.goals.backend.service;

import com.goals.backend.entities.Meta;
import com.goals.backend.entities.SubMeta;
import com.goals.backend.repositories.SubMetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubMetaService {

    @Autowired
    private SubMetaRepository subMetaRepository;

    public SubMeta save(SubMeta subMeta){
        try {
            return subMetaRepository.saveAndFlush(subMeta);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<SubMeta> findAll(){
        return subMetaRepository.findAll();
    }

    public Optional<SubMeta> findById(Integer id){
        return subMetaRepository.findById(id);
    }

    public void deleteById(Integer id){
        subMetaRepository.deleteById(id);
    }
    public SubMeta replaceSubMeta(SubMeta newSubMeta, Integer id) {
        return subMetaRepository.findById(id)
                .map(subMeta -> {
                    subMeta.setNome(newSubMeta.getNome());
                    subMeta.setObjetivo(newSubMeta.getObjetivo());
                    subMeta.setPrazo(newSubMeta.getPrazo());
                    subMeta.setConcluido(newSubMeta.isConcluido());
                    return subMetaRepository.saveAndFlush(subMeta);
                })
                .orElseGet(() -> {
                    return subMetaRepository.saveAndFlush(newSubMeta);
                });
    }

}
