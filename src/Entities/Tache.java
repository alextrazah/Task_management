/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Asus
 */
public class Tache {
private int id_Tache ;
private int id_user_story_bs ;
private int id_Sprint ;
private String date_debut_tache ;
private String date_fin_tache ;
private String nom_tache ;
private String type_tache ;
private String liste_Personnel ;
private String description_tache ;
private String liste_nbre_heure ;
private String moyenne_estimation ;

    public int getId_user_story_bs() {
        return id_user_story_bs;
    }

    public void setId_user_story_bs(int id_user_story_bs) {
        this.id_user_story_bs = id_user_story_bs;
    }

    public Tache(int id_Tache, int id_user_story_bs, int id_Sprint, String date_debut_tache, String date_fin_tache, String nom_tache, String type_tache, String liste_Personnel, String description_tache, String liste_nbre_heure, String moyenne_estimation) {
        this.id_Tache = id_Tache;
        this.id_user_story_bs = id_user_story_bs;
        this.id_Sprint = id_Sprint;
        this.date_debut_tache = date_debut_tache;
        this.date_fin_tache = date_fin_tache;
        this.nom_tache = nom_tache;
        this.type_tache = type_tache;
        this.liste_Personnel = liste_Personnel;
        this.description_tache = description_tache;
        this.liste_nbre_heure = liste_nbre_heure;
        this.moyenne_estimation = moyenne_estimation;
    }


   

    public int getId_Tache() {
        return id_Tache;
    }

    public void setId_Tache(int id_Tache) {
        this.id_Tache = id_Tache;
    }

    public int getId_Sprint() {
        return id_Sprint;
    }

    public void setId_Sprint(int id_Sprint) {
        this.id_Sprint = id_Sprint;
    }

    public String getDate_debut_tache() {
        return date_debut_tache;
    }

    public void setDate_debut_tache(String date_debut_tache) {
        this.date_debut_tache = date_debut_tache;
    }

    public String getDate_fin_tache() {
        return date_fin_tache;
    }

    public void setDate_fin_tache(String date_fin_tache) {
        this.date_fin_tache = date_fin_tache;
    }

    public String getNom_tache() {
        return nom_tache;
    }

    public void setNom_tache(String nom_tache) {
        this.nom_tache = nom_tache;
    }

    public String getType_tache() {
        return type_tache;
    }

    public void setType_tache(String type_tache) {
        this.type_tache = type_tache;
    }

    public String getListe_Personnel() {
        return liste_Personnel;
    }

    public void setListe_Personnel(String liste_Personnel) {
        this.liste_Personnel = liste_Personnel;
    }

    public String getDescription_tache() {
        return description_tache;
    }

    public void setDescription_tache(String description_tache) {
        this.description_tache = description_tache;
    }

    public String getListe_nbre_heure() {
        return liste_nbre_heure;
    }

    public void setListe_nbre_heure(String liste_nbre_heure) {
        this.liste_nbre_heure = liste_nbre_heure;
    }

    public String getMoyenne_estimation() {
        return moyenne_estimation;
    }

    public void setMoyenne_estimation(String moyenne_estimation) {
        this.moyenne_estimation = moyenne_estimation;
    }

    public Tache(int id_Tache, int id_Sprint, String date_debut_tache, String date_fin_tache, String nom_tache, String type_tache, String liste_Personnel, String description_tache, String liste_nbre_heure, String moyenne_estimation) {
        this.id_Tache = id_Tache;
        this.id_Sprint = id_Sprint;
        this.date_debut_tache = date_debut_tache;
        this.date_fin_tache = date_fin_tache;
        this.nom_tache = nom_tache;
        this.type_tache = type_tache;
        this.liste_Personnel = liste_Personnel;
        this.description_tache = description_tache;
        this.liste_nbre_heure = liste_nbre_heure;
        this.moyenne_estimation = moyenne_estimation;
    }
 @Override
    public String toString() {
        return "Tache{" + "id_Tache=" + id_Tache + ", id_Sprint=" + id_Sprint + ", date_debut_tache=" + date_debut_tache + ", date_fin_tache=" + date_fin_tache + ", nom_tache=" + nom_tache + ", type_tache=" + type_tache + ", liste_Personnel=" + liste_Personnel + ", description_tache=" + description_tache + ", liste_nbre_heure=" + liste_nbre_heure + ", moyenne_estimation=" + moyenne_estimation + '}';
    }
    
}
