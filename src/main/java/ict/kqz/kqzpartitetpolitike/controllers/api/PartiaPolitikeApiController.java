package ict.kqz.kqzpartitetpolitike.controllers.api;


import ict.kqz.kqzpartitetpolitike.models.entities.PartiaPolitike;
import ict.kqz.kqzpartitetpolitike.services.PartiaPolitikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//   http://localhost:9090/api/partitepolitike
@RequestMapping(value = "api/partitepolitike")
public class PartiaPolitikeApiController extends AbstractApiController<PartiaPolitike, String> {

    // private final PartiaPolitikeService service;

    public PartiaPolitikeApiController(PartiaPolitikeService service) {
        //this.service = service;
        super(service);
    }

    @GetMapping("/search")
    public List<PartiaPolitike> getPartiaPolitikeByEmri(@RequestParam String emri) {
        return ((PartiaPolitikeService)service).getPartiaPolitikeByEmri(emri);
    }

//    //GET   http://localhost:9090/api/partitepolitike
//    @GetMapping(value = "")
//    public List<PartiaPolitike> getAll() {
//        return service.getAll();
//    }
//
//
//    //GET   http://localhost:9090/api/partitepolitike/pnk
//    @GetMapping(value = "/{id}")
//    public PartiaPolitike getById(@PathVariable String id) {
//        return service.getById(id);
//    }
//
//    // POST  http://localhost:9090/api/partitepolitike
//    @PostMapping(value = "")
//    public boolean post(@RequestBody PartiaPolitike partiaPolitike) {
//        return service.add(partiaPolitike);
//    }
//
//    //PUT   http://localhost:9090/api/partitepolitike/pnk
//    @PutMapping(value = "/{id}")
//    public boolean put(@PathVariable String id, @RequestBody PartiaPolitike partiaPolitike) {
//        if (!id.equals(partiaPolitike.getId())) return false;
//        return service.modify(partiaPolitike);
//    }
//
//    //DELETE   http://localhost:9090/api/partitepolitike/pnk
//    @DeleteMapping(value = "/{id}")
//    public boolean delete(@PathVariable String id) {
//        return service.remove(id);
//    }


}
