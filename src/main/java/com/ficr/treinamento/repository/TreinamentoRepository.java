package com.ficr.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ficr.treinamento.model.Treinamento;

public interface TreinamentoRepository extends JpaRepository<Treinamento, Long>{

}
