package com.otoparktakip.controller;

import java.util.List;
import com.otoparktakip.model.AracCikis;
import com.otoparktakip.services.AracCikisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/aracCikis")
public class AracCikisController {

    @Autowired
    AracCikisService aracCikisService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("aracCikis_list");
        List<AracCikis> aracCikisList = aracCikisService.getAllAracCikis();
        model.addObject("aracCikisList", aracCikisList);

        return model;
    }
    @RequestMapping(value="/list2", method=RequestMethod.GET)
    public ModelAndView list2() {

        ModelAndView model = new ModelAndView("aracCikis_list2");
        List<AracCikis> aracCikisList = aracCikisService.getAllAracCikis();
        model.addObject("aracCikisList", aracCikisList);

        return model;
    }





    @RequestMapping(value="/addAracCikis/", method=RequestMethod.GET)
    public ModelAndView addAracCikis() {

        ModelAndView model = new ModelAndView();
        AracCikis aracCikis = new AracCikis();
        model.addObject("aracCikisForm", aracCikis);
        model.setViewName("aracCikis_form");

        return model;
    }



    @RequestMapping(value="/editAracCikis/{id}", method=RequestMethod.GET)
    public ModelAndView editAracCikis(@PathVariable Long id) {
        ModelAndView model = new ModelAndView();

        AracCikis aracCikis = aracCikisService.getAracCikisById(id);
        model.addObject("aracCikisForm", aracCikis);
        model.setViewName("aracCikis_form");

        return model;
    }


    @RequestMapping(value="/addAracCikis", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("aracCikisForm") AracCikis aracCikis) {

        aracCikisService.addAracCikis(aracCikis);
        return new ModelAndView("redirect:/aracCikis/list");

    }

    @RequestMapping(value="/deleteAracCikis/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {

        aracCikisService.deleteAracCikis(id);
        return new ModelAndView("redirect:/aracCikis/list");

    }



}