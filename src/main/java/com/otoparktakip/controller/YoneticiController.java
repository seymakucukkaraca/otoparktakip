package com.otoparktakip.controller;

import java.util.List;
import com.otoparktakip.model.Yonetici;
import com.otoparktakip.services.YoneticiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/yonetici")
public class YoneticiController {

    @Autowired
    YoneticiService yoneticiService;


    @RequestMapping(value="/yonetici", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("yonetici") Yonetici yonetici){
        ModelAndView model = new ModelAndView();
        List<Yonetici> yoneticiler = yoneticiService.getAllYonetici();
        for(Yonetici yonetici1 : yoneticiler){
            if(yonetici1.getKullaniciadi().equals(yonetici.getKullaniciadi()) && yonetici1.getSifre().equals(yonetici.getSifre())) {
                model.addObject("yonetici", yonetici1);
                model.setViewName("yonetici_anasayfa");
                return model;
            }
        }
        model.setViewName("redirect:/yonetici/yonetici_login");
        return model;
    }

    @RequestMapping(value = "/yonetici_login", method = RequestMethod.GET)
    public ModelAndView loginPage(){
        ModelAndView model = new ModelAndView("yonetici_login");
        return model;
    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("yonetici_list");
        List<Yonetici> yoneticiList = yoneticiService.getAllYonetici();
        model.addObject("yoneticiList", yoneticiList);

        return model;
    }



    @RequestMapping(value="/addYonetici/", method=RequestMethod.GET)
    public ModelAndView addyonetici() {

        ModelAndView model = new ModelAndView();
        Yonetici yonetici = new Yonetici();
        model.addObject("yoneticiForm", yonetici);
        model.setViewName("yonetici_form");

        return model;
    }



    @RequestMapping(value="/editYonetici/{id}", method=RequestMethod.GET)
    public ModelAndView editYonetici(@PathVariable Long id) {
        ModelAndView model = new ModelAndView();

        Yonetici yonetici = yoneticiService.getYoneticiById(id);
        model.addObject("yoneticiForm", yonetici);
        model.setViewName("yonetici_form");

        return model;
    }


    @RequestMapping(value="/addYonetici", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("yoneticiForm") Yonetici yonetici) {

        yoneticiService.addYonetici(yonetici);
        return new ModelAndView("redirect:/yonetici/list");

    }

    @RequestMapping(value="/deleteYonetici/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {

        yoneticiService.deleteYonetici(id);
        return new ModelAndView("redirect:/yonetici/list");

    }



}