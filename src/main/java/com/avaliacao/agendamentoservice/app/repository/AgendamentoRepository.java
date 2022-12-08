package com.avaliacao.agendamentoservice.app.repository;


import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, String> {
}
