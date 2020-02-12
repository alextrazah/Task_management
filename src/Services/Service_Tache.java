/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


import Entities.Tache;
import Utils.ConnexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Service_Tache {
       Connection c=ConnexionBD.getinstance().getcnx();
    public void ajoutertache(Tache t)
    {
        try 
        {
      PreparedStatement pt= c.prepareStatement(" insert into Tache (ide_user_story_bs, id_Sprint, date_debut_tache, date_fin_tache, nom_tache, type_tache, liste_Personnel, description_tache, liste_nbre_heure, moyenne_estimation)"
        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            //pt.setInt(1,t.getId_Tache());
            pt.setInt(1,t.getId_user_story_bs());
            pt.setInt(2,t.getId_Sprint());
            pt.setString(3,t.getDate_debut_tache());
            pt.setString(4,t.getDate_fin_tache());
            pt.setString(5,t.getNom_tache());
            pt.setString(6,t.getType_tache());
            pt.setString(7,t.getListe_Personnel());
            pt.setString(8,t.getDescription_tache());
            pt.setString(9,t.getListe_nbre_heure());
            pt.setString(10,t.getMoyenne_estimation());
            
            pt.execute();

      // execute the preparedstatement
      
        } catch (SQLException ex)
        {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
      public void modifiertache (String nom,int id_sprint,String date_debut,String date_fin,String liste_perso)
    {
        try {
            PreparedStatement pt= c.prepareStatement("update Tache set id_sprint=? , date_debut_tache= ? , date_fin_tache= ? , liste_Personnel= ?  where nom_tache=?");
            pt.setInt(1,id_sprint);
            pt.setString(2,date_debut);
            pt.setString(3,date_fin);
            pt.setString(4,liste_perso);
            pt.setString(5,nom);
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public void modifiertache_liste (int id_tache,String liste_Personnel)
    {
        try {
            PreparedStatement pt= c.prepareStatement("update Tache set liste_Personnel=? where id_Tache=?");
            pt.setString(1,liste_Personnel);
            pt.setInt(2,id_tache);
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public void supprimertache(String nom)
    {
        try {
            PreparedStatement pt =c.prepareStatement("delete from tache where nom_tache=?" );
            pt.setString(1,nom);
            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void affichertache()
    {
        try {
            PreparedStatement pt =c.prepareStatement("select * from tache");
            ResultSet rs= pt.executeQuery();
            
            while(rs.next())
            {
                System.out.println("Tache {id:"+rs.getInt(1)+" ,id_sprint:"+rs.getString(2)+" ,nom_tache:"+rs.getString(5)+" ,date_debut:"+rs.getString(5)+" ,date_fin:"+rs.getString(6)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void liste(int id_tache)
       {
           String liste="";
     
             int var=0;
        try {
            PreparedStatement pt =c.prepareStatement("select * from personnel");
            ResultSet rs= pt.executeQuery();
            PreparedStatement pt1 =c.prepareStatement("select count(*) from personnel");
            ResultSet rs1= pt1.executeQuery();
            while(rs1.next()){
            var=rs1.getInt(1);
            }
           
            for (int i=0;i<var;i++)
            {
                while(rs.next())
            {
                if (liste.equals(""))
                liste=liste+rs.getInt(1);
                else {
                    liste=liste+","+rs.getInt(1);
                }
            }
            }
            }
            
         catch (SQLException ex) {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
           modifiertache_liste(id_tache, liste);
           //System.out.println(liste);
    } 
       
       
       public void afficher_perso_par_id(int id_perso)
       {
               try {
            PreparedStatement pt =c.prepareStatement("select * from personnel where id_personnel=?");
            pt.setInt(1,id_perso);
            ResultSet rs= pt.executeQuery();
            
            while(rs.next())
            {
                System.out.println("Tache {id:"+rs.getInt(1)+" ,id_sprint:"+rs.getString(2)+" ,nom_tache:"+rs.getString(3)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
       
       public void afficher_liste_perso(int id_tache)
   {
       String liste = null; 
        try {
            PreparedStatement pt =c.prepareStatement("select liste_personnel from tache where id_tache=?");
             pt.setInt(1,id_tache);
            ResultSet rs= pt.executeQuery();
              while(rs.next())
            {
                liste=rs.getString(1);
                System.out.println("la liste {"+rs.getString(1)+"");
            }
            
            }
            
         catch (SQLException ex) {
            Logger.getLogger(Service_Tache.class.getName()).log(Level.SEVERE, null, ex);
        }
     liste=liste.replaceAll(",", "");
     String [] liste1=liste.split("");
       
       
       
       for (int i=0;i<liste.length();i++)
       {
           //System.out.println(liste[]);
          // Character.getNumericValue(liste.charAt(i))
           afficher_perso_par_id(Character.getNumericValue(liste.charAt(i)));
           
           
                   
       }

       }
       
       
   
       
       
       
       

   }
       



