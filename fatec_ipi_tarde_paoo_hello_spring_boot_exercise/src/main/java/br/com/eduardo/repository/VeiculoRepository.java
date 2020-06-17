package br.com.eduardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}