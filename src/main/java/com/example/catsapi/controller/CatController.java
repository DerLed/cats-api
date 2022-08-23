package com.example.catsapi.controller;

import com.example.catsapi.controller.dto.CatDto;
import com.example.catsapi.controller.service.CatService;
import com.example.catsapi.entity.Cat;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDto cat){
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }
}
