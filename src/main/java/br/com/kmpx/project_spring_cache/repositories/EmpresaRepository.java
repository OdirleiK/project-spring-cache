package br.com.kmpx.project_spring_cache.repositories;

import br.com.kmpx.project_spring_cache.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
