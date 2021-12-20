package ict.kqz.kqzpartitetpolitike.repositories;

import ict.kqz.kqzpartitetpolitike.models.entities.Antari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntariRepository extends JpaRepository<Antari,Integer> {
}
