package ict.kqz.kqzpartitetpolitike.services;

import ict.kqz.kqzpartitetpolitike.models.entities.Aktiviteti;
import ict.kqz.kqzpartitetpolitike.repositories.AktivitetiRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AktivitiService extends AbstractService<Aktiviteti,Integer> {
    protected AktivitiService(AktivitetiRepository repository) {
        super(repository);
    }
}
