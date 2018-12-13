package com.poesifacile.demo;

import com.poesifacile.demo.model.Utilisateur;
import com.poesifacile.demo.repository.UtilisateurRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //chargement du contexte Spring
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UtilisateurRepository utilisateurRepository; //On relie le repository correspondant au test

	@Test //déclaration des méthodes de test
	public void testConnexionBdd() {
		//Given : situation de départ

		//When : action
		long nbUtilisateur = utilisateurRepository.count(); //on initialise une variable qui sera le résultat de la requête suivante
		//Then : résultat
		Assert.assertTrue(nbUtilisateur > 0); //On déclare que l'assertion doit être vraie, en fonction de la condition qui vient ensuite
	}

	@Test //déclaration des méthodes de test
	public void testTrouverUtilisateur() {

		Utilisateur u = utilisateurRepository.findOne(4); //On demande d'abord de récupérer un utilisateur entier dans le repository sur la base de son id, avec le nom spécifié dans le @autowired

		String pseudo = u.getPseudo(); //A partir de l'utilisateur récupéré, on extrait son pseudo avec le getter de base dans la classe Utilisateur

		Assert.assertTrue(pseudo.equals("aaa")); //On définit que l'assertion est vraie si le pseudo est le même que celui de l'utilisateur dans la base


	}

}

