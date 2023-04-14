package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    List<Matricula> findByAlunoBairro(String bairro);

    /*
    @Query("FROM Matriculas m WHERE m.aluno.bairro = :bairro")
    List<Matricula> findByAlunoMatriculadosBairro(String bairro);


    @Query(value = "SELECT * FROM tb_matriculas m " +
        "INNER JOIN tb_alunos a ON m.aluno_id = a. id " +
        "WHERE a.bairro = :bairro", nativeQuery = true)
     */
}
