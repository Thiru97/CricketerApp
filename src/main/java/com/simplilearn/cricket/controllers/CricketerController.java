package com.simplilearn.cricket.controllers;

import com.simplilearn.cricket.entity.Cricketer;
import com.simplilearn.cricket.services.CricketerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CricketerController {

    @Autowired
    CricketerService service;

    @RequestMapping("/allCricketer")
    public List<Cricketer> getAllCricketer(){
        return service.getAllCricketer();
    }

    @RequestMapping("/cricketer/{id}")
    public Cricketer getCricketer(@PathVariable int id){
        return service.getCricketer(id);
    }

    @RequestMapping(method= RequestMethod.POST ,value = "/cricketer")
        public void addCricketer(@RequestBody Cricketer cricketer){
            service.addCricketer(cricketer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/cricketer/{id}")
    public void updateCricketer(@PathVariable int id, @RequestBody Cricketer cricketer){
        service.updateCricketer(id, cricketer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cricketer/{id}")
    public void deleteCricketer(@PathVariable int id){
        service.deleteCricketer(id);
    }

    @RequestMapping(method = RequestMethod.GET,  value = "/cricketer/{nationality}")
    public void getCricketerByNationality(@PathVariable String nationality){
    service.findCricketerbyNationality(nationality);
    }
}
