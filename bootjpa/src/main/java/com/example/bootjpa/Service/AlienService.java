package com.example.bootjpa.Service;

import com.example.bootjpa.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {

    @Autowired
    private AlienRepo repo;

    public Alien getAlienById(int aid){
        return repo.findById(aid).orElse(null);
//                a.stream()
//                .filter(alien -> alien.getAid() == aid)
//                .findFirst().orElse(new Alien(100,"flash","DC"));
    }

    public void addAlien(Alien alien){
        System.out.println("addAlien method in service");
        repo.save(alien);
    }
//
//
    public List<Alien> getAliens() {
        return repo.findAll();
    }


//
//    public void updateAlien(Alien a) {
//        int index =0;
//        for(int i=0;; i < aliens.size();i++)
//            if(aliens.get(i).getAid() == a.getAid())
//                index = i;
//        aliens.set(index, a);
//        System.out.println(a.getAid() + " updated successfully. Value = " + aliens );
//    }
//
//    public Alien deleteAlien(int aid) {
//        System.out.println("Inside alienService deleteAlien method");
//        int index = 0;
//        for(int i=0; i < aliens.size();i++)
//            if(aliens.get(i).getAid() == aid)
//                    index =i;
//
//        Alien deleted = aliens.remove(index);
//        System.out.println(aliens);
//        return deleted;
//    }
}
