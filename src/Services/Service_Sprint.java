/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Sprint;
import Entities.Tache;
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
public class Service_Sprint {
     Connection c=ConnexionBD.getinstance().getcnx();
    public void ajouterSprint(Sprint t)
    {
        try 
        {
      PreparedStatement pt= c.prepareStatement(" insert into Sprint (id_bs,date_debut_sprint,date_fin_sprint,liste_user_sroty_bs, description)"
        + " values (?, ?, ?, ?, ?)");
            //pt.setInt(1,t.getId_Tache());
            pt.setInt(1,t.getId_bs());
            pt.setInt(2,t.getId_Sprint());
            pt.setString(3,t.getDate_debut_sprint());
            pt.setString(4,t.getDate_fin_sprint());
            pt.setString(5,t.getDescription());
            
            pt.execute();

      
        } catch (SQLException ex)
        {
            Logger.getLogger(Service_Sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
     public void modifiersprint (int id_bs,int id_sprint,String date_debut_sprint,String date_fin_sprint,String liste_user_sroty_bs,String description)
    {
        try {
            PreparedStatement pt= c.prepareStatement("update Sprint set id_bs=? , date_debut_sprint= ? , date_fin_sprint= ?, liste_user_sroty_bs= ?, description= ?  where id_sprint=?");
            pt.setInt(1,id_bs);
            pt.setString(2,date_debut_sprint);
            pt.setString(3,date_fin_sprint);
            pt.setString(4,liste_user_sroty_bs);
            pt.setString(5,description);

            pt.setInt(6,id_sprint);
       
            
            
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_Sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
           public void supprimerSprint(int id_sprint)
    {
        try {
            PreparedStatement pt =c.prepareStatement("delete from sprint where id_sprint=?" );
            pt.setInt(1,id_sprint);
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_Sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            public void affichersprint()
    {
        try {
            PreparedStatement pt =c.prepareStatement("select * from sprint");
            ResultSet rs= pt.executeQuery();
            
            while(rs.next())
            {
                System.out.println("Sprint {id:"+rs.getInt(1)+" ,id_sprint:"+rs.getInt(2)+" ,nom_tache:"+rs.getString(5)+" ,date_debut:"+rs.getString(3)+" ,date_fin:"+rs.getString(4)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Service_Sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
