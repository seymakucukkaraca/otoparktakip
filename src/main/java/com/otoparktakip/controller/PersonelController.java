package com.otoparktakip.controller;

import com.otoparktakip.model.Personel;
import com.otoparktakip.services.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value="/personel")
public class PersonelController {

    @Autowired
    PersonelService personelService;

    @RequestMapping(value="/personel", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("personel") Personel personel){
        ModelAndView model = new ModelAndView();
        List<Personel> personeller = personelService.getAllPersonel();
        for(Personel personel1 : personeller){
            if(personel1.getKullaniciadi().equals(personel.getKullaniciadi()) && personel1.getSifre().equals(personel.getSifre())) {
                model.addObject("personel", personel1);
                model.setViewName("personel_anasayfa");
                return model;
            }
        }
        model.setViewName("redirect:/personel/personel_login");
        return model;
    }

    @RequestMapping(value = "/personel_login", method = RequestMethod.GET)
    public ModelAndView loginPage(){
        ModelAndView model = new ModelAndView("personel_login");
        return model;
    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("personel_list");
        List<Personel> personelList = personelService.getAllPersonel();
        model.addObject("personelList", personelList);

        return model;
    }



    @RequestMapping(value="/addPersonel/", method=RequestMethod.GET)
    public ModelAndView addPersonel() {

        ModelAndView model = new ModelAndView();
        Personel personel = new Personel();
        model.addObject("personelForm", personel);
        model.setViewName("personel_form");

        return model;
    }



    @RequestMapping(value="/editPersonel/{id}", method=RequestMethod.GET)
    public ModelAndView editPersonel(@PathVariable Long id) {
        ModelAndView model = new ModelAndView();

        Personel personel = personelService.getPersonelById(id);
        model.addObject("personelForm", personel);
        model.setViewName("personel_form");

        return model;
    }


    @RequestMapping(value="/addPersonel", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("personelForm") Personel personel) {

        personelService.addPersonel(personel);
        return new ModelAndView("redirect:/personel/list");

    }

    @RequestMapping(value="/deletePersonel/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") long id) {

        personelService.deletePersonel(id);
        return new ModelAndView("redirect:/personel/list");

    }



}