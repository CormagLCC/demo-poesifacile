package com.poesifacile.demo.Service;

import com.poesifacile.demo.model.Utilisateur;
import com.poesifacile.demo.repository.HistoriqueRepository;
import com.poesifacile.demo.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UtilisateurRepository utilisateurRepository; //Demande à Spring de fournir le Repository (à faire à chaque fois)
    @Autowired
    private HistoriqueRepository historiqueRepository;

    public Utilisateur recupereutilisateur(Integer id ) throws Exception{
        if (utilisateurRepository.exists(id)){
            return utilisateurRepository.findOne(id);
        }else{
            throw new Exception("l'id n'existe pas!");
        }
    }
}
