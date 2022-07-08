package br.com.cursojava.cursojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursojava.cursojava.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
