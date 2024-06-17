package br.com.kmpx.project_spring_cache.controller;

import br.com.kmpx.project_spring_cache.services.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @PostMapping
    public void clear(@RequestParam("cacheName") String cacheName) {
        cacheService.evictAllCacheValue(cacheName);
    }

    @PutMapping
    public void update() {
        cacheService.updateCacheEmpresa();
    }
}
