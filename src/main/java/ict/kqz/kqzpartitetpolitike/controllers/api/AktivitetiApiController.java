package ict.kqz.kqzpartitetpolitike.controllers.api;

import ict.kqz.kqzpartitetpolitike.models.entities.Aktiviteti;
import ict.kqz.kqzpartitetpolitike.services.AbstractService;
import ict.kqz.kqzpartitetpolitike.services.AktivitiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/aktivitetet")
public class AktivitetiApiController extends AbstractApiController<Aktiviteti,Integer> {
    public AktivitetiApiController(AktivitiService service) {
        super(service);
    }
}
