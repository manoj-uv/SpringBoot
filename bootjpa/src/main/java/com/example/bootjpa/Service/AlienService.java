package com.example.bootjpa.Service;

import com.example.bootjpa.model.Alien;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AlienService {
    List<Alien> aliens = new ArrayList<>(Arrays.asList(new Alien(101,"spiderman","MCU"),
            new Alien(102,"ironman","MCU"),
            new Alien(103,"batman","DC")));

    public Alien getAlienById(int aid){
        Alien a = aliens.stream()
                .filter(alien -> alien.getAid() == aid)
                .findFirst().orElse(new Alien(100,"flash","DC"));
        return a;
    }

    public void addAlien(Alien alien){
        System.out.println("addAlien method in service");
        aliens.add(alien);
    }


    public List<Alien> getAliens() {
        return aliens;
    }

    public void updateAlien(Alien a) {
        int index =0;
        for(int i=0; i < aliens.size();i++)
            if(aliens.get(i).getAid() == a.getAid())
                index = i;
        aliens.set(index, a);
        System.out.println(a.getAid() + " updated successfully. Value = " + aliens );
    }

    public Alien deleteAlien(int aid) {
        System.out.println("Inside alienService deleteAlien method");
        int index = 0;
        for(int i=0; i < aliens.size();i++)
            if(aliens.get(i).getAid() == aid)
                    index =i;

        Alien deleted = aliens.remove(index);
        System.out.println(aliens);
        return deleted;
    }
}
