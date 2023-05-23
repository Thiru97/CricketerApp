package com.simplilearn.cricket.services;

import com.simplilearn.cricket.entity.Cricketer;
import com.simplilearn.cricket.repository.CricketerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketerService {

    @Autowired
    CricketerRepository repository;

    //create
    public void addCricketer(Cricketer cricketer) {
        repository.save(cricketer);
    }

    //read
    public List<Cricketer> getAllCricketer() {
        return repository.findAll();
    }

    //update
    public void updateCricketer(int id, Cricketer cricketer) {
        if (repository.findById(id).isPresent()) {
            Cricketer tempCricketer = repository.findById(id).get();
            tempCricketer.setName(cricketer.getName());
            tempCricketer.setAge(cricketer.getAge());
            tempCricketer.setNationality(cricketer.getNationality());
            repository.save(tempCricketer);
        }
    }

    //delete
    public void deleteCricketer(int id) {
        repository.deleteById(id);
    }

    public Cricketer getCricketer(int id) {
        return repository.findById(id).get();
    }

    @Query("Select cricketer from Cricketer cricketer where cricketer.nationality=:nationality")
     public Cricketer findCricketerbyNationality(@Param("nationality") String nationality){
        return new Cricketer();
    }







}
