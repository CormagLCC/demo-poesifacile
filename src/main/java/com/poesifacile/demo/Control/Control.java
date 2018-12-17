package com.poesifacile.demo.Control;

import com.poesifacile.demo.Service.UserService;
import com.poesifacile.demo.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Control {
    @Autowired
    UserService userService; //Demande à Spring de fournir la classe du Service

    @RequestMapping("/gethistoriqueUtilisateur") // renvoi un utilisateur avec tout son historique
    public Utilisateur u(@RequestParam(value="id") Integer id) throws Exception {
        return userService.recupereutilisateur(id);
    }

    //Utilisateur u = userService.equals(Utilisateur u);
}
