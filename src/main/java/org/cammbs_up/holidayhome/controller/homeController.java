package org.cammbs_up.holidayhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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



}
