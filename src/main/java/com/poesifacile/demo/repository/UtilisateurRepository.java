package com.poesifacile.demo.repository;

import com.poesifacile.demo.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface UtilisateurRepository extends CrudRepository <Utilisateur, Integer>{
    String findById(int i);
}
