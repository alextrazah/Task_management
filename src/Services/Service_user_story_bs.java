/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Tache;
import Entities.User_story_bs;
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
public class Service_user_story_bs {
    Connection c=ConnexionBD.getinstance().getcnx();
    public void ajouterUser_story_bs(User_story_bs t)
    {
        try 
        {
      PreparedStatement pt= c.prepareStatement(" insert into user_story_backlog_sprint ( id_Sprint, description_user_story_bs) values (?, ?)");
            //pt.setInt(1,t.getId_Tache());
            pt.setInt(1,t.getId_sprint());
            pt.setString(2,t.getDescription_user_story_bs());
           
            
            pt.execute();

      // execute the preparedstatement
      
        } catch (SQLException ex)
        {
            Logger.getLogger(Service_user_story_bs.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
      public void modifierUser_story_bs (int id_user_story_bs,String desc)
    {
        try {
            PreparedStatement pt= c.prepareStatement("update user_story_backlog_sprint set description_user_story_bs=? where id_user_story_bs=?");
            pt.setString(1,desc);
            /*t.setInt(2,id_sprint);
            pt.setString(3,Date_debut_tache);
            pt.setString(4,Date_fin_tache);
            pt.setString(5,Liste_Personnel);
            pt.setString(6,Liste_nbre_heure);
            pt.setString(7,Moyenne_estimation);
*/
            pt.setInt(2,id_user_story_bs);
          
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_user_story_bs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public void supprimerUser_story_bs(int id)
    {
        try {
            PreparedStatement pt =c.prepareStatement("delete from user_story_backlog_sprint where id_user_story_bs=?" );
            pt.setInt(1,id);
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_user_story_bs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void afficherUser_story_bs()
    {
        try {
            PreparedStatement pt =c.prepareStatement("select * from user_story_backlog_sprint");
            ResultSet rs= pt.executeQuery();
            
            while(rs.next())
            {
                System.out.println("Back_log_story {id:"+rs.getInt(1)+" ,id_sprint:"+rs.getInt(2)+" ,description:"+rs.getString(3)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Service_user_story_bs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
