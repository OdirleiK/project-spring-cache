package br.com.kmpx.project_spring_cache.services;

import br.com.kmpx.project_spring_cache.cloud.Ibge;
import br.com.kmpx.project_spring_cache.cloud.IbgeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public class IbgeService {

    @Autowired
    private Ibge ibge;


    @Cacheable(value = "estados", condition = "#estado.equalsIgnoreCase('MG')")
    public List<IbgeResponse> findAllCidades(String estado) {
        return ibge.findAllCidades(estado);
    }
}
