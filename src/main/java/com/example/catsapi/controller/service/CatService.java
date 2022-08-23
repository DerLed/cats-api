package com.example.catsapi.controller.service;

import com.example.catsapi.controller.dto.CatDto;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatDto catDto){
        return catRepository.save(Cat.builder()
                .id(UUID.randomUUID().toString())
                .birthDay(catDto.getBirthDay())
                .createdAt(LocalDateTime.now())
                .name(catDto.getName())
                .build());
    }

    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }
}
