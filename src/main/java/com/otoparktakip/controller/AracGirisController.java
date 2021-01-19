package com.otoparktakip.controller;

import java.util.List;
import com.otoparktakip.model.AracGiris;
import com.otoparktakip.services.AracGirisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/aracGiris")
public class AracGirisController {

    @Autowired
    AracGirisService aracGirisService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("aracGiris_list");
        List<AracGiris> aracGirisList = aracGirisService.getAllAracGiris();
        model.addObject("aracGirisList", aracGirisList);

        return model;
    }

    @RequestMapping(value="/list2", method=RequestMethod.GET)
    public ModelAndView list2() {

        ModelAndView model = new ModelAndView("aracGiris_list2");
        List<AracGiris> aracGirisList = aracGirisService.getAllAracGiris();
        model.addObject("aracGirisList", aracGirisList);

        return model;
    }





    @RequestMapping(value="/addAracGiris/", method=RequestMethod.GET)
    public ModelAndView addAracGiris() {

        ModelAndView model = new ModelAndView();
        AracGiris aracGiris = new AracGiris();
        model.addObject("aracGirisForm", aracGiris);
        model.setViewName("aracGiris_form");

        return model;
    }



    @RequestMapping(value="/editAracGiris/{id}", method=RequestMethod.GET)
    public ModelAndView editAracGiris(@PathVariable Long id) {
        ModelAndView model = new ModelAndView();

        AracGiris aracGiris = aracGirisService.getAracGirisById(id);
        model.addObject("aracGirisForm", aracGiris);
        model.setViewName("aracGiris_form");

        return model;
    }


    @RequestMapping(value="/addAracGiris", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("aracGirisForm") AracGiris aracGiris) {

        aracGirisService.addAracGiris(aracGiris);
        return new ModelAndView("redirect:/aracGiris/list");

    }

    @RequestMapping(value="/deleteAracGiris/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {

        aracGirisService.deleteAracGiris(id);
        return new ModelAndView("redirect:/aracGiris/list");

    }



}