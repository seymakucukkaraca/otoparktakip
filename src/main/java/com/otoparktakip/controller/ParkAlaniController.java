package com.otoparktakip.controller;

import java.util.List;
import com.otoparktakip.model.ParkAlani;
import com.otoparktakip.services.ParkAlaniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/parkAlani")
public class ParkAlaniController {

    @Autowired
    ParkAlaniService parkAlaniService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("parkAlani_list");
        List<ParkAlani> parkAlaniList = parkAlaniService.getAllParkAlani();
        model.addObject("parkAlaniList", parkAlaniList);

        return model;
    }
    @RequestMapping(value="/list2", method=RequestMethod.GET)
    public ModelAndView list2() {

        ModelAndView model = new ModelAndView("parkAlani_list2");
        List<ParkAlani> parkAlaniList = parkAlaniService.getAllParkAlani();
        model.addObject("parkAlaniList", parkAlaniList);

        return model;
    }




    @RequestMapping(value="/addParkAlani/", method=RequestMethod.GET)
    public ModelAndView addParkAlani() {

        ModelAndView model = new ModelAndView();
        ParkAlani parkAlani = new ParkAlani();
        model.addObject("parkAlaniForm", parkAlani);
        model.setViewName("parkAlani_form");

        return model;
    }



    @RequestMapping(value="/editParkAlani/{id}", method=RequestMethod.GET)
    public ModelAndView editParkAlani(@PathVariable Long id) {
        ModelAndView model = new ModelAndView();

        ParkAlani parkAlani = parkAlaniService.getParkAlaniById(id);
        model.addObject("parkAlaniForm", parkAlani);
        model.setViewName("parkAlani_form");

        return model;
    }


    @RequestMapping(value="/addParkAlani", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("parkAlaniForm") ParkAlani parkAlani) {

        parkAlaniService.addParkAlani(parkAlani);
        return new ModelAndView("redirect:/parkAlani/list");

    }

    @RequestMapping(value="/deleteParkAlani/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {

        parkAlaniService.deleteParkAlani(id);
        return new ModelAndView("redirect:/parkAlani/list");

    }



}