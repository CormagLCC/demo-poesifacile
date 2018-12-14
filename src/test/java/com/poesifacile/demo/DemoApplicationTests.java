package com.poesifacile.demo;

import com.poesifacile.demo.model.Historique;
import com.poesifacile.demo.model.Utilisateur;
import com.poesifacile.demo.repository.HistoriqueRepository;
import com.poesifacile.demo.repository.UtilisateurRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

		Utilisateur u = utilisateurRepository.findOne(6); //On demande d'abord de récupérer un utilisateur entier dans le repository sur la base de son id, avec le nom spécifié dans le @autowired

		String pseudo = u.getPseudo(); //A partir de l'utilisateur récupéré, on extrait son pseudo avec le getter de base dans la classe Utilisateur

		Assert.assertTrue(pseudo.equals("bbbb")); //On définit que l'assertion est vraie si le pseudo est le même que celui de l'utilisateur dans la base


	}

    /* @Test
    public void testCréerUtilisateur() {
        Utilisateur u2 = new Utilisateur("bbbb", "cccc");
        u2 = utilisateurRepository.save(u2);} */


    @Test
    public void testGetHistorique() {
    Utilisateur u = utilisateurRepository.findOne(1); //récupérer utilisateur
    List <Historique> historiques = u.getHistoriques(); //donner historique de l'utilisateur
    for (Historique h : historiques) { //pour chaque historique de l'utilisateur
        Integer score = h.getScore(); //chercher les scores de l'historique
        System.out.println(score); //afficher les scores dans la console
    }


    }
}

