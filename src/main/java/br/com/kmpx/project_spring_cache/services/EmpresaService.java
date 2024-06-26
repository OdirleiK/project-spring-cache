package br.com.kmpx.project_spring_cache.services;

import br.com.kmpx.project_spring_cache.entities.Empresa;
import br.com.kmpx.project_spring_cache.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    @Cacheable("empresa")
    public List<Empresa> findAllComCache(){
        return empresaRepository.findAll();
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }
}
