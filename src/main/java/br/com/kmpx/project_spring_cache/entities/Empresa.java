package br.com.kmpx.project_spring_cache.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Empresa {

    @Id
    private Long id;

    private String nome;
}
