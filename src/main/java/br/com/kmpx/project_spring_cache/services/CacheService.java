package br.com.kmpx.project_spring_cache.services;

import br.com.kmpx.project_spring_cache.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CacheService {

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private EmpresaService empresaService;

    public  void evictAllCacheValue(String cacheName) {
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
    }

    @CachePut("empresa")
    public List<Empresa> updateCacheEmpresa() {
        return empresaService.findAll();
    }
}
