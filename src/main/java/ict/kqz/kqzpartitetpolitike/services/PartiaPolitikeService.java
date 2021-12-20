package ict.kqz.kqzpartitetpolitike.services;

import ict.kqz.kqzpartitetpolitike.models.entities.PartiaPolitike;
import ict.kqz.kqzpartitetpolitike.repositories.PartiaPolitikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartiaPolitikeService extends AbstractService<PartiaPolitike, String> {
    // private final PartiaPolitikeRepository repository;


    public PartiaPolitikeService(PartiaPolitikeRepository repository) {
        super(repository);
        //this.repository = repository;
    }

    public List<PartiaPolitike> getPartiaPolitikeByEmri(String emri) {
        return  ((PartiaPolitikeRepository)repository).getPartiaPolitikeByEmri(emri);
    }


    //CRUD -> CREATE, READ, UPDATE dhe DELETE

//    public List<PartiaPolitike> getAll() {
//        return repository.findAll();
//    }
//
//    public PartiaPolitike getById(String id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    public boolean add(PartiaPolitike entity) {
//        PartiaPolitike newPartia = repository.save(entity);
//        return newPartia != null;
//    }
//
//    public boolean update(PartiaPolitike entity) {
//        PartiaPolitike updatedPartia = repository.save(entity);
//        return updatedPartia != null;
//    }
//
//    public boolean deleteById(String id) {
//        repository.deleteById(id);;
//        return true;
//    }

}
