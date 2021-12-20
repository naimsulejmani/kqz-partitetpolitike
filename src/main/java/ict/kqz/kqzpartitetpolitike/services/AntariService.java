package ict.kqz.kqzpartitetpolitike.services;

import ict.kqz.kqzpartitetpolitike.models.entities.Antari;
import ict.kqz.kqzpartitetpolitike.repositories.AntariRepository;
import ict.kqz.kqzpartitetpolitike.services.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AntariService extends AbstractService<Antari,Integer> {

    protected AntariService(AntariRepository repository) {
        super(repository);
    }
}
