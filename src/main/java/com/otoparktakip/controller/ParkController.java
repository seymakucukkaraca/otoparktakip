package com.otoparktakip.controller;

import java.util.List;
import com.otoparktakip.model.Park;
import com.otoparktakip.services.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/park")
public class ParkController {

    @Autowired
    ParkService parkService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("park_list");
        List<Park> parkList = parkService.getAllPark();
        model.addObject("parkList", parkList);

        return model;
    }



    @RequestMapping(value="/addPark/", method=RequestMethod.GET)
    public ModelAndView addPark() {

        ModelAndView model = new ModelAndView();
        Park park = new Park();
        model.addObject("parkForm", park);
        model.setViewName("park_form");

        return model;
    }



    @RequestMapping(value="/editPark/{id}", method=RequestMethod.GET)
    public ModelAndView editPark(@PathVariable Long id) {
        ModelAndView model = new ModelAndView();

        Park park = parkService.getParkById(id);
        model.addObject("parkForm", park);
        model.setViewName("park_form");

        return model;
    }


    @RequestMapping(value="/addPark", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("parkForm") Park park) {

        parkService.addPark(park);
        return new ModelAndView("redirect:/park/list");

    }

    @RequestMapping(value="/deletePark/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {

        parkService.deletePark(id);
        return new ModelAndView("redirect:/park/list");

    }



}