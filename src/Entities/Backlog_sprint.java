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
public class Backlog_sprint {
private int id_bs ;
private int id_equipe ;
private int id_sm ;
private int id_projet ;
private String 	liste_sprint ;

    @Override
    public String toString() {
        return "Backlog_sprint{" + "id_bs=" + id_bs + ", id_equipe=" + id_equipe + ", id_sm=" + id_sm + ", id_projet=" + id_projet + ", liste_sprint=" + liste_sprint + '}';
    }

    public int getId_bs() {
        return id_bs;
    }

    public void setId_bs(int id_bs) {
        this.id_bs = id_bs;
    }

    public int getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(int id_equipe) {
        this.id_equipe = id_equipe;
    }

    public int getId_sm() {
        return id_sm;
    }

    public void setId_sm(int id_sm) {
        this.id_sm = id_sm;
    }

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }

    public String getListe_sprint() {
        return liste_sprint;
    }

    public void setListe_sprint(String liste_sprint) {
        this.liste_sprint = liste_sprint;
    }

    public Backlog_sprint(int id_equipe, int id_sm, int id_projet, String liste_sprint) {
       
        this.id_equipe = id_equipe;
        this.id_sm = id_sm;
        this.id_projet = id_projet;
        this.liste_sprint = liste_sprint;
    }
}
