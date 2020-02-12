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
public class User_story_bs {
private int id_user_story_bs ;
private int id_sprint ;
private String description_user_story_bs ;

    @Override
    public String toString() {
        return "id_user_story_bs{" + "id_user_story_bs=" + id_user_story_bs + ", id_sprint=" + id_sprint + ", description_user_story_bs=" + description_user_story_bs + '}';
    }

    public int getId_user_story_bs() {
        return id_user_story_bs;
    }

    public void setId_user_story_bs(int id_user_story_bs) {
        this.id_user_story_bs = id_user_story_bs;
    }

    public int getId_sprint() {
        return id_sprint;
    }

    public void setId_sprint(int id_sprint) {
        this.id_sprint = id_sprint;
    }

    public String getDescription_user_story_bs() {
        return description_user_story_bs;
    }

    public void setDescription_user_story_bs(String description_user_story_bs) {
        this.description_user_story_bs = description_user_story_bs;
    }

    public User_story_bs(int id_sprint, String description_user_story_bs) {
        this.id_sprint = id_sprint;
        this.description_user_story_bs = description_user_story_bs;
    }

}
