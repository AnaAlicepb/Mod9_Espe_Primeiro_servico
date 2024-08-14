package br.com.AdoteBichinho.animal_service.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.AdoteBichinho.animal_service.dto.ResgatadorDTO;
import br.com.AdoteBichinho.animal_service.entidades.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findyNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findyAdopted();


    @Query("SELECT NEW br.com.AdoteBichinho.animal_service.dto.ResgatadorDTO(R.nome, COUNT(A.id)) " +
            "FROM Resgatador R " +
            "JOIN R.animais A " +
            "WHERE A.dataEntrada BETWEEN current_date() - 365 DAY AND current_date() " +
            "GROUP BY R.nome")
    List<ResgatadorDTO> obterResgatadorQuantidadeAnimais();

//    @Query("SELECT NEW br.com.AdoteBichinho.animal_service.dto.ResgatadorDTO(R.nome, COUNT(A.id)) " +
//            "FROM Resgatador R " +
//            "JOIN R.animais A " +
//            "WHERE A.dataEntrada BETWEEN current_date() - 365 DAY AND current_date() " +
//            "GROUP BY R.nome")


}


