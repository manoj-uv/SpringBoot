package com.example.bootjpa.controller;

import com.example.bootjpa.AlienRepo;
import com.example.bootjpa.Service.AlienService;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController{
    @Autowired
    AlienRepo repo;
    @Autowired
    AlienService aService;


    @GetMapping("/aliens")
    public List<Alien> getAliens(){
        return aService.getAliens();
    }

@GetMapping("/alien/{aid}")
    public Alien getAlienById(@PathVariable int aid){
    return aService.getAlienById(aid);
}
@PostMapping("/alien/addAlien")
    public void addAlien(@RequestBody Alien a){
        aService.addAlien(a);
    System.out.println("Alien added ");
    }

    @PutMapping("/alien/update")
    public String updateAlien(@RequestBody Alien a){
        aService.updateAlien(a);
        return "Alien update successfully";
    }

    @DeleteMapping("/alien/delete/{aid}")
    public String deleteAlien(@PathVariable int aid){
        System.out.println("Request value = " + aid);
        Alien deleted = aService.deleteAlien(aid);
        return "Alien "+ deleted +" Deleted successfully";
    }
}
