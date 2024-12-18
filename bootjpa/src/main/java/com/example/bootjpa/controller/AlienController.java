package com.example.bootjpa.controller;

import com.example.bootjpa.Exceptions.AlienNotFoundException;
import com.example.bootjpa.Service.AlienService;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AlienController{
    @Autowired
    AlienService aService;


    @GetMapping("/aliens")
    public ResponseEntity<List<Alien>> getAliens(){
       return new ResponseEntity<>(aService.getAliens(), HttpStatus.OK);
    }

    @PostMapping("/aliens/addAlien")
    public ResponseEntity<String> addAlien(@Validated @RequestBody Alien alien){
        aService.addAlien(alien);
        return new ResponseEntity<>("Alien Added",HttpStatus.CREATED);
    }

    @GetMapping("/aliens/{aid}")
    public ResponseEntity<Alien> getAlienById(@PathVariable int aid){
        Alien a = aService.getAlienById(aid);
        if(a == null)
            throw new AlienNotFoundException("id "+aid);

        return new ResponseEntity(a,HttpStatus.FOUND);
}
//@PostMapping("/alien/addAlien")
//    public void addAlien(@RequestBody Alien a){
//        aService.addAlien(a);
//    System.out.println("Alien added ");
//    }
//
//    @PutMapping("/alien/update")
//    public String updateAlien(@RequestBody Alien a){
//        aService.updateAlien(a);
//        return "Alien update successfully";
//    }
//
//    @DeleteMapping("/alien/delete/{aid}")
//    public String deleteAlien(@PathVariable int aid){
//        System.out.println("Request value = " + aid);
//        Alien deleted = aService.deleteAlien(aid);
//        return "Alien "+ deleted +" Deleted successfully";
//    }
}
