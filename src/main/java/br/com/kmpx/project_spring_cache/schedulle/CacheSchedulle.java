package br.com.kmpx.project_spring_cache.schedulle;

import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
@Log4j2
public class CacheSchedulle {

    @Scheduled(fixedDelay = 30, timeUnit = TimeUnit.SECONDS)
    @CacheEvict("empresa")
    public void cleanCacheEmpresa() {
        log.info("Executed: " + LocalDateTime.now());
    }
}
