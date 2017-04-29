package by.katekurilo.sitepoems.controller;

import by.katekurilo.sitepoems.dao.UserDao;
import by.katekurilo.sitepoems.model.Poem;
import by.katekurilo.sitepoems.model.User;
import by.katekurilo.sitepoems.service.PoemService;
import by.katekurilo.sitepoems.service.SecurityService;
import by.katekurilo.sitepoems.service.UserService;
import by.katekurilo.sitepoems.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Controller for {@link by.katekurilo.sitepoems.model.User}'s pages.
 *
 * @author Kate Kurilo
 * @version 1.0
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private PoemService poemService;




                            /**
                             * Registration new user
                             */

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {

        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);


        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

                                /**
                                * Login
                                */

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("message", "Logged out successfully.");
        }

        return "login";
    }

                                        /**
                                         * Pages:
                                        */

                                        //  ***Main page***

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        List<Poem> poems = poemService.findAll();
        model.addAttribute("poems", poems);
        return "index";
    }

    public void setPoemService(PoemService poemService) {
        this.poemService = poemService;
    }

                                        // ***Welcome page***


    @RequestMapping(value = {"/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {

        return "welcome";
    }

                                        // ***Admin page***

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model) {
        return "admin";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String login(@ModelAttribute("poemForm")Poem poemForm, Model model) {

        poemService.save(poemForm);

        return "redirect:/admin";
    }

}
