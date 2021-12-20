package ict.kqz.kqzpartitetpolitike.repositories;

import ict.kqz.kqzpartitetpolitike.models.entities.PartiaPolitike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//CRUD operations me tabelen partia_politike
@Repository
public interface PartiaPolitikeRepository extends JpaRepository<PartiaPolitike, String> {

    @Query(value = "SELECT * FROM partia_politike WHERE emri = :emri", nativeQuery = true)
    List<PartiaPolitike> getPartiaPolitikeByEmri(@Param("emri") String emri);
}
