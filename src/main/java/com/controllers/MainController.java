package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/mine", method = RequestMethod.GET)
    public ModelAndView myTest(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();


        if (request.getParameter("month") != null
                && request.getParameter("month").equals("inallmonth")
                && request.getParameter("closeeyes") != null
                && request.getParameter("closeeyes").equals("dreams")
                && request.getParameter("water") != null
                && request.getParameter("water").equals("ice")
                && request.getParameter("greenman") != null
                && request.getParameter("greenman").equals("gothrowroad")
                && request.getParameter("dayofweek") != null
                && request.getParameter("dayofweek").equals("yeaterday")
                && request.getParameter("utensils") != null
                && request.getParameter("utensils").equals("empty")
                && request.getParameter("no") != null
                && request.getParameter("no").equals("alive")
                && request.getParameter("howmuch") != null
                && request.getParameter("howmuch").equals("six")) {
            modelAndView.setViewName("result");
        }else {
            modelAndView.setViewName("resbad");
        }

        return modelAndView;
    }
}


