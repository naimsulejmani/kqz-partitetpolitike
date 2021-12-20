package ict.kqz.kqzpartitetpolitike.services;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//CRUD
public abstract class AbstractService<T, Tid> {

    private final JpaRepository<T, Tid> repository;

    protected AbstractService(JpaRepository<T, Tid> repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        return  repository.findAll();
    }

    public T getById(Tid id) {
        return  repository.findById(id).orElse(null);
    }
    private boolean save(T entity) {
        T newEntity = repository.save(entity);
        return newEntity!=null;
    }

    public boolean add(T entity) {
      return save(entity);
    }

    public boolean modify(T entity) {
        return save(entity);
    }

    public boolean remove(Tid id) {
        repository.deleteById(id);
        return true;
    }




}
