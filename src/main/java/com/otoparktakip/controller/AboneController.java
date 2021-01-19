package com.otoparktakip.controller;

import java.util.List;
import com.otoparktakip.model.Abone;
import com.otoparktakip.services.AboneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/abone")
public class AboneController {

    @Autowired
    AboneService aboneService;

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("abone_list");
        List<Abone> aboneList = aboneService.getAllAbones();
        model.addObject("aboneList", aboneList);

        return model;
    }

    @RequestMapping(value="/list2", method=RequestMethod.GET)
    public ModelAndView list2() {

        ModelAndView model = new ModelAndView("abone_list2");
        List<Abone> aboneList = aboneService.getAllAbones();
        model.addObject("aboneList", aboneList);

        return model;
    }

    @RequestMapping(value="/addAbone/", method=RequestMethod.GET)
    public ModelAndView addAbone() {

        ModelAndView model = new ModelAndView();
        Abone abone = new Abone();
        model.addObject("aboneForm", abone);
        model.setViewName("abone_form");

        return model;
    }



    @RequestMapping(value="/editAbone/{id}", method=RequestMethod.GET)
    public ModelAndView editAbone(@PathVariable Long id) {
        ModelAndView model = new ModelAndView();

        Abone abone = aboneService.getAboneById(id);
        model.addObject("aboneForm", abone);
        model.setViewName("abone_form");

        return model;
    }


    @RequestMapping(value="/addAbone", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("aboneForm") Abone abone) {

        aboneService.addAbone(abone);
        return new ModelAndView("redirect:/abone/list");

    }

    @RequestMapping(value="/deleteAbone/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {

        aboneService.deleteAbone(id);
        return new ModelAndView("redirect:/abone/list");

    }



}