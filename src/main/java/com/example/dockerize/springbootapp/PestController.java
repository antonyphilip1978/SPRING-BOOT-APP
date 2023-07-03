package com.example.dockerize.springbootapp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pestapi")
public class PestController {
       
    @GetMapping("/pestinfo")
	public List<Pestisides> getPestinfo(){

        System.out.println(PestUtil.loadData());
		return PestUtil.loadData();
	}

}
