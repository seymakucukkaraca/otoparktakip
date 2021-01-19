package com.otoparktakip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnasayfaController {

    @GetMapping({"/"})

    public String home() {

        return "personel_login";

    }

}
