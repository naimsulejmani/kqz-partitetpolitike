package ict.kqz.kqzpartitetpolitike.repositories;

import ict.kqz.kqzpartitetpolitike.models.entities.PartiaPolitike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//CRUD operations me tabelen partia_politike
@Repository
public interface PartiaPolitikeRepository extends JpaRepository<PartiaPolitike,String> {
}
