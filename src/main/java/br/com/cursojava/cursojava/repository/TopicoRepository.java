package br.com.cursojava.cursojava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursojava.cursojava.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);

}
