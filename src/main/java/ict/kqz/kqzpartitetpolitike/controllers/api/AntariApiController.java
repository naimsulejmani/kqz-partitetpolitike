package ict.kqz.kqzpartitetpolitike.controllers.api;

import ict.kqz.kqzpartitetpolitike.models.entities.Antari;
import ict.kqz.kqzpartitetpolitike.services.AbstractService;
import ict.kqz.kqzpartitetpolitike.services.AntariService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/antaret")
public class AntariApiController extends AbstractApiController<Antari, Integer> {
    public AntariApiController(AntariService service) {
        super(service);
    }
}
