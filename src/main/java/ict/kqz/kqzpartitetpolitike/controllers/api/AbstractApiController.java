package ict.kqz.kqzpartitetpolitike.controllers.api;

import ict.kqz.kqzpartitetpolitike.services.AbstractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractApiController<T,Tid> {
    protected final AbstractService<T,Tid> service;

    public AbstractApiController(AbstractService<T, Tid> service) {
        this.service = service;
    }

    //CRUD

    @GetMapping(value = "")
    public List<T> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "/{id}")
    public T getById(@PathVariable Tid id) {
        return service.getById(id);
    }


    @DeleteMapping(value = "/{id}")
    public boolean deleteById(@PathVariable Tid id) {
        service.remove(id);
        return true;
    }

    @PostMapping(value = "")
    public boolean post(@RequestBody T item) {
        return service.add(item);
    }

    @PutMapping(value = "/{id}")
    public boolean put(@PathVariable Tid id,@RequestBody T item) {
        return service.modify(item);
    }

}
