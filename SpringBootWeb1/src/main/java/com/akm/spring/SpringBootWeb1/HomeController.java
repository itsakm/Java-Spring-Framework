package com.akm.spring.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        System.out.println("Home Method Called");
        return "index";
    }

    /*@RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session)
    {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1+num2;

        session.setAttribute("result",result);
        return "result.jsp";
    }*/

    /*@RequestMapping("add")
    public String add(int num1,int num2, HttpSession session) //OR @RequestParam("num1) int num;
    {

        int result = num1+num2;

        session.setAttribute("result",result);
        return "result.jsp";
    }*/

    /*@RequestMapping("add")
    public String add(int num1,int num2, Model model) //OR @RequestParam("num1) int num;
    {

        int result = num1+num2;

        model.addAttribute("result",result);
        return "result";
    }*/

    /*@RequestMapping("add")
    public ModelAndView add(int num1,int num2, ModelAndView mv) //OR @RequestParam("num1) int num;
    {

        int result = num1+num2;

        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }*/

   /* @RequestMapping("addAlien")
    public ModelAndView addAlien(@RequestParam("id") int id,@RequestParam("name") String name, ModelAndView mv) //OR @RequestParam("num1) int num;
    {
        Alien alien = new Alien();

        alien.setId(id);
        alien.setName(name);

        mv.addObject("alien",alien);
        mv.setViewName("result");
        return mv;
    }*/

    /*@RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien) //OR @RequestParam("num1) int num;
    {
        return "result";
    }*/

    @RequestMapping("addAlien")
    public String addAlien(Alien alien) //OR @RequestParam("num1) int num;
    {
        return "result";
    }
}
