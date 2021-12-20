package ict.kqz.kqzpartitetpolitike.repositories;

import ict.kqz.kqzpartitetpolitike.models.entities.Aktiviteti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AktivitetiRepository extends JpaRepository<Aktiviteti,Integer> {
}
