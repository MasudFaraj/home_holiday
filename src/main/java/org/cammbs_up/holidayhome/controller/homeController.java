package org.cammbs_up.holidayhome.controller;

import org.cammbs_up.holidayhome.modal.Home;
import org.cammbs_up.holidayhome.modal.Price;
import org.cammbs_up.holidayhome.repository.HomeRepo;
import org.cammbs_up.holidayhome.repository.LessorRepo;
import org.cammbs_up.holidayhome.repository.PriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String showlist(@RequestParam(defaultValue = " ") String sort, @RequestParam(defaultValue = "asc",required = false) String order, Model model){
        List<Home> homeList;
        Sort.Direction direction= (order.equals("desc") ?  Sort.Direction.DESC : Sort.Direction.ASC);
        if ( sort.equals("area")){
            homeList = homeRepo.findAll(Sort.by(direction, "area"));
        } else if (sort.equals("numberOfBeds")) {
            homeList = homeRepo.findAll(Sort.by(direction, "numberOfBeds"));
        } else {
            homeList= homeRepo.findAll(Sort.by("city").ascending().
                    and(Sort.by("accommodationName").ascending()));
            model.addAttribute("order", order.equals(" "));
        }
        /* System.err.println(homeList.get(0).getCity());
        System.err.println(homeList.get(0).getImage()); */
//        System.err.println(homeList.get(0).getLessor().getFirstname());
//        System.err.println(homeList.get(0).getPrice().getSeasonA());
        model.addAttribute("sort",  sort);
        model.addAttribute("order", order.equals("asc") ? "desc" : "asc");
        model.addAttribute("homeList", homeList);
        return "homelist";
    }

    @GetMapping("/search")
    public String searchHomeList(@RequestParam String searchText, Model model){
        List<Home> homeList;
        if(searchText.trim().isEmpty()){
            homeList= homeRepo.findAll(Sort.by("city").ascending().
                    and(Sort.by("accommodationName").ascending()));
        } else {
            homeList= homeRepo.findByAccommodationNameContaining(searchText);
        }

//        model.addAttribute("title", "Liste");
        model.addAttribute("homeListe",homeList);
        model.addAttribute("searchText", searchText);
        return "homelist";
    }
    @GetMapping("/details")
    public String showHomeDetails(@RequestParam int id, Model model){
        Home home = homeRepo.findByIdAccommodation(id);
        model.addAttribute(home);
        return "homedetails";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int id){
        homeRepo.deleteById(id);
        return "redirect:/";
    }
    /*
    * @GetMapping("/add")
    public String showAddWineForm(Model model){
        Wine wine= new Wine();
        model.addAttribute("wine", wine);
        List<Country> countries= countryRepo.findAll();
        model.addAttribute("countryList", countries);
        return "wine_form";
    }
    * @PostMapping("/save")
    public String saveWine(@ModelAttribute Wine wine, @RequestParam(value = "action") String action){
       if(action.equals("save")) {
           wineRepo.save(wine);
       }
        return "redirect:/";    // "/" startsite
        // "?" save navigation operator
    } */
    @GetMapping("/edit")
    public String showEditHome(Model model, @RequestParam int id){

        Home home = homeRepo.findByIdAccommodation(id);
        model.addAttribute(home);
//        List<Price> countries= countryRepo.findAll();
//        model.addAttribute("countryList", countries);
        return "home_form";
    }


}
