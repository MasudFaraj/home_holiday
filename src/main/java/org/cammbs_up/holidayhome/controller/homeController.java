package org.cammbs_up.holidayhome.controller;

import org.cammbs_up.holidayhome.modal.Home;
import org.cammbs_up.holidayhome.repository.HomeRepo;
import org.cammbs_up.holidayhome.repository.LessorRepo;
import org.cammbs_up.holidayhome.repository.PriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * homeController
 * Dokumentation
 * validation
 * input
 * logic
 * output
 * Verbesserung der Strukturierung
 * Entfernung von Redundanzen
 *
 * @author Masoud Faraj
 * @version 21.06.2024
 */
@Controller
public class homeController {

    @Autowired
    private HomeRepo homeRepo;
    @Autowired
    private LessorRepo lessorRepo;
    @Autowired
    private PriceRepo priceRepo;

    @GetMapping("/homepage")
    public String showHomeIndex(){
        return "index";
    }
    @GetMapping("/galerie")
    public String showGalerie(){
        return "galerie";
    }

    @GetMapping("/directions")
    public String showDirections(){
        return "anfahrt";
    }

    @GetMapping("/contact")
    public String showContact(){
        return "kontakt";
    }

    @GetMapping("/list")
    public String showlist(Model model){
        List<Home> homeList= homeRepo.findAll(Sort.by("accommodationName"));
        model.addAttribute("homeList", homeList);
        return "homelist";
    }

}
