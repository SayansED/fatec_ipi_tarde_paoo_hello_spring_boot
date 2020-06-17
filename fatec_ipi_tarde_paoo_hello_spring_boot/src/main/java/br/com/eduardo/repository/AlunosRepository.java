package br.com.eduardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eduardo.model.Aluno;

@Repository
public interface AlunosRepository extends JpaRepository<Aluno, Long>{
	
	
}
