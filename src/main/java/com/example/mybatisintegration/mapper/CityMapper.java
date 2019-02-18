package com.example.mybatisintegration.mapper;

import com.example.mybatisintegration.domain.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {
    City selectById(Long id);

    Integer insert(City entity);
}
