package com.example.mybatisintegration.web;

import com.example.mybatisintegration.domain.City;
import com.example.mybatisintegration.mapper.CityMapper;
import com.zaxxer.hikari.pool.HikariPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    private CityMapper personMapper;

    @Autowired
    public MyController(CityMapper personMapper) {
        this.personMapper = personMapper;
    }

    @GetMapping("/city/{id}")
    City findById(@PathVariable Long id){
       return personMapper.selectById(id);
    }

    @PostMapping("/city")
    String insert(@RequestBody City city){
        Integer result = personMapper.insert(city);
        return result + "";
    }

}
