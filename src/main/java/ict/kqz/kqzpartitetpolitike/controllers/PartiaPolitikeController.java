package ict.kqz.kqzpartitetpolitike.controllers;

import ict.kqz.kqzpartitetpolitike.models.entities.PartiaPolitike;
import ict.kqz.kqzpartitetpolitike.services.CookieUtilityService;
import ict.kqz.kqzpartitetpolitike.services.PartiaPolitikeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/partiapolitike")
public class PartiaPolitikeController {
    private final PartiaPolitikeService service;
    private final CookieUtilityService utilityService;

    public PartiaPolitikeController(PartiaPolitikeService service, CookieUtilityService utilityService) {
        this.service = service;
        this.utilityService = utilityService;
    }


    @GetMapping(value = "")
    public String getPartitePolitikePage(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
        if(!utilityService.getLoggedIn(req.getCookies())) {
            res.sendRedirect("/auth/login");
            return null;
        }
        List<PartiaPolitike> partitePolitike = service.getAll();
        model.addAttribute("partite",partitePolitike);
        return "partiapolitike";
    }
}
