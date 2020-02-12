/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Backlog_sprint;
import Entities.Sprint;
import Utils.ConnexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Service_Backlog_sprint {
    Connection c=ConnexionBD.getinstance().getcnx();
    public void ajouterBS(Backlog_sprint t)
    {
        try 
        {
      PreparedStatement pt= c.prepareStatement(" insert into backlog_sprint (id_equipe,id_sm,id_projet,liste_sprint) values (?, ?, ?, ?)");
            //pt.setInt(1,t.getId_Tache());
            pt.setInt(1,t.getId_equipe());
            pt.setInt(2,t.getId_sm());
            pt.setInt(3,t.getId_projet());
            pt.setString(4,t.getListe_sprint());
            
            pt.execute();

      
        } catch (SQLException ex)
        {
            Logger.getLogger(Service_Backlog_sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    public void modifierbs (int id_bs,String liste_sprint)
    {
        try {
            PreparedStatement pt= c.prepareStatement("update backlog_sprint set liste_sprint= ? where id_bs=?");
            pt.setString(1,liste_sprint);
            pt.setInt(2,id_bs);
            
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_Backlog_sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
             public void supprimerbs(int id_bs)
    {
        try {
            PreparedStatement pt =c.prepareStatement("delete from backlog_sprint where id_bs=?" );
            pt.setInt(1,id_bs);
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_Sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
              public void afficherbs()
    {
        try {
            PreparedStatement pt =c.prepareStatement("SELECT user_story_backlog_sprint.id_user_story_bs,user_story_backlog_sprint.id_sprint,user_story_backlog_sprint.description_user_story_bs, sprint.id_sprint,sprint.description,sprint.date_debut_sprint,sprint.date_fin_sprint,backlog_sprint.id_bs FROM user_story_backlog_sprint INNER JOIN sprint ON user_story_backlog_sprint.id_sprint=sprint.id_sprint INNER JOIN backlog_sprint on backlog_sprint.id_bs=sprint.id_bs"
                    );
            ResultSet rs= pt.executeQuery();
            
            while(rs.next())
            {
                System.out.println("Backlog sprint {id_BS:"+rs.getInt(1)+" ,id_sprint:"+rs.getInt(2)+" ,nom_tache:"+rs.getString(3)+" ,date_debut:"+rs.getString(4)+" ,date_fin:"+rs.getString(5)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Service_Sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
