package org.example.snapsevise.controller;

import org.example.snapsevise.model.Snapsevise;
import org.example.snapsevise.service.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    private final Service service;
    private final Random random = new Random();


    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String snapseViseIndex (Model model) {
        List<Snapsevise> snapseviseList = service.findAlleSnapseviser();
        int index = random.nextInt(snapseviseList.size());
        Snapsevise snapsevise = snapseviseList.get(index);

        model.addAttribute("snapsevise", snapsevise);
        return "index";
    }

}
