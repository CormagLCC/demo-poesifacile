package com.poesifacile.demo.model;
import javax.persistence.*;
import javax.rmi.CORBA.Util;

@Entity
@Table(name = "Historique")

public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_sauvegarde;

    @Column (name = "salle")
    private Integer salle;

    @Column (name = "score")
    private Integer score;

    @ManyToOne //Fin de la relation entre plusieurs historiques et un utilisateur
    @JoinColumn( name = "id_joueur") //Déclaration de la colonne servant de clé étrangère
    private Utilisateur utilisateur; //Déclaration de la table de début de relation

    public Historique(){}

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Historique(Integer id_sauvegarde, Integer salle, Integer id_joueur, Integer score) {
        this.id_sauvegarde = id_sauvegarde;
        this.salle = salle;

        this.score = score;
    }

    public Integer getId_sauvegarde() {
        return id_sauvegarde;
    }

    public void setId_sauvegarde(Integer id_sauvegarde) {
        this.id_sauvegarde = id_sauvegarde;
    }

    public Integer getSalle() {
        return salle;
    }

    public void setSalle(Integer salle) {
        this.salle = salle;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
