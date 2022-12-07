package com.avaliacao.agendamentoservice.app.repository;


import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, String> {
}
