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
public class Sprint {
private int id_Sprint ;
private int id_bs ;
private String date_debut_sprint ;
private String date_fin_sprint ;
private String 	liste_user_sroty_bs ;
private String 	description ;

    @Override
    public String toString() {
        return "Sprint{" + "id_Sprint=" + id_Sprint + ", id_user_story_bs=" + id_bs + ", date_debut_sprint=" + date_debut_sprint + ", date_fin_sprint=" + date_fin_sprint + ", liste_user_sroty_bs=" + liste_user_sroty_bs + ", description=" + description + '}';
    }

    public int getId_Sprint() {
        return id_Sprint;
    }

    public void setId_Sprint(int id_Sprint) {
        this.id_Sprint = id_Sprint;
    }

    public int getId_bs() {
        return id_bs;
    }

    public void setId_bs(int id_user_story_bs) {
        this.id_bs = id_user_story_bs;
    }

    public String getDate_debut_sprint() {
        return date_debut_sprint;
    }

    public void setDate_debut_sprint(String date_debut_sprint) {
        this.date_debut_sprint = date_debut_sprint;
    }

    public String getDate_fin_sprint() {
        return date_fin_sprint;
    }

    public void setDate_fin_sprint(String date_fin_sprint) {
        this.date_fin_sprint = date_fin_sprint;
    }

    public String getListe_user_sroty_bs() {
        return liste_user_sroty_bs;
    }

    public void setListe_user_sroty_bs(String liste_user_sroty_bs) {
        this.liste_user_sroty_bs = liste_user_sroty_bs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sprint( int id_bs, String date_debut_sprint, String date_fin_sprint, String liste_user_sroty_bs, String description) {
      
        this.id_bs = id_bs;
        this.date_debut_sprint = date_debut_sprint;
        this.date_fin_sprint = date_fin_sprint;
        this.liste_user_sroty_bs = liste_user_sroty_bs;
        this.description = description;
    }

}
