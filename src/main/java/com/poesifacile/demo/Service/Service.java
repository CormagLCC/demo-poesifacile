package com.poesifacile.demo.Service;

import com.poesifacile.demo.model.Utilisateur;
import com.poesifacile.demo.repository.HistoriqueRepository;
import com.poesifacile.demo.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service

public class Service {

@Autowired
    private UtilisateurRepository utilisateurRepository;
    private HistoriqueRepository historiqueRepository;

    public String recupereutilisateur(Integer id ) throws Exception{
        if (utilisateurRepository.exists(id)){
            return utilisateurRepository.findById(id);
        }else{
            throw new Exception("l'id n'existe pas!");
        }
    }
}
