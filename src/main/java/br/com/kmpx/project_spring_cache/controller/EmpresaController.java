package br.com.kmpx.project_spring_cache.controller;

import br.com.kmpx.project_spring_cache.entities.Empresa;
import br.com.kmpx.project_spring_cache.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService service;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return  ResponseEntity.ok(service.findAllComCache());
    }
}
