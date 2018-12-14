package com.poesifacile.demo.model;
import javax.persistence.*;
import java.util.List;

@Entity //Déclaration de l'entité qui sera entrée dans la table
@Table (name="utilisateur") //Déclaration de la table

public class Utilisateur {
    @Id //Déclaration de l'ID unique de la table
    @GeneratedValue(strategy = GenerationType.AUTO) //On déclare que la colonne ID s'auto-incrémente, comme spécifié dans la base
    private Integer id;

    @Column(name = "pseudo") //Déclaration de colonne
    private String pseudo;

    @Column(name = "password")
    private String password;

    @OneToMany (mappedBy = "utilisateur", fetch = FetchType.EAGER) //Declaration de relation entre un utilisateur et plusieurs historiques
    private List <Historique> historiques; //déclaration de la liste d'historiques liés à l'utilisateur

    public List<Historique> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<Historique> historiques) {
        this.historiques = historiques;
    }

    public Utilisateur(){}; //constructeur par défaut

    public Utilisateur(String pseudo, String password) { //constructeur des variables
        this.pseudo = pseudo;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}