
import Entities.Backlog_sprint;
import Entities.Sprint;
import Entities.Tache;
import Entities.User_story_bs;
import Services.Service_Backlog_sprint;
import Services.Service_Sprint;
import Services.Service_Tache;
import Services.Service_user_story_bs;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Programme3a9 {
    
    
    public static void main (String[]args)
    {
        Tache t1=new Tache(42,19,19,"","","yassmine","","","","","");
        Tache t2=new Tache(5,3,3,"","","","","","","","");
        User_story_bs u1= new User_story_bs(3,"le");
        Sprint s1=new Sprint(3, "date_debut_sprint", "date_fin_sprint", "liste_user_sroty_bs", "description");
        Backlog_sprint bs1= new Backlog_sprint(1, 34, 1, "zzzz");
        
       Service_Tache srv =new Service_Tache();
       Service_user_story_bs srvU = new Service_user_story_bs();
       Service_Sprint srvS = new Service_Sprint ();
       Service_Backlog_sprint srvBs = new Service_Backlog_sprint();
       
       String liste="";
       
       
       //srvBs.ajouterBS(bs1);
       //srv.ajoutertache(t1);
        //srv.ajoutertache(t2);
        //srv.modifiertache("yassmine", 10000, "lolololo","looooool","ok???");
        //srv.supprimertache("yassmine");
        //System.out.println("affichaaaaaaaaaaaaaage");
        //srv.affichertache();
        //srvU.ajouterUser_story_bs(u1);
        //srvU.modifierUser_story_bs(1,"deddsc");
        //srvU.supprimerUser_story_bs(4);
        //srvU.afficherUser_story_bs();
        //srvS.ajouterSprint(s1);
        //srvS.modifiersprint(1, 3, "22", "22", "66", "888");
        //srvS.supprimerSprint(4);
       // srvS.affichersprint();
       srvBs.modifierbs(2,"baaa");
       //srvBs.supprimerbs(2);
       srvBs.afficherbs();
       //srv.liste();
       //srv.modifiertache_liste(6, "liste");
       //srv.liste(100);
       //srv.modifiertache_liste(100, "1,3");
       
       //srv.afficher_liste_perso(100);
   
    }
    
}
