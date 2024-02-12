package com.goals.backend.service;

import com.goals.backend.entities.Meta;
import com.goals.backend.entities.SubMeta;
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

    public void deleteById(Integer id){
        metaRepository.deleteById(id);
    }

    public List<SubMeta> addSubMeta(Integer id, SubMeta subMeta){
        Meta meta = metaRepository.findById(id).get();
        meta.getSubMeta().add(subMeta);
        metaRepository.saveAndFlush(meta);
        return meta.getSubMeta();
    }

    public Meta replaceMeta(Meta newMeta, Integer id) {
        return metaRepository.findById(id)
                .map(meta -> {
                    meta.setNome(newMeta.getNome());
                    meta.setObjetivo(newMeta.getObjetivo());
                    meta.setPrazo(newMeta.getPrazo());
                    meta.setRelevancia(newMeta.getRelevancia());
                    meta.setSubMeta(newMeta.getSubMeta());
                    return metaRepository.saveAndFlush(meta);
                })
                .orElseGet(() -> {
                    return metaRepository.saveAndFlush(newMeta);
                });
    }

}
