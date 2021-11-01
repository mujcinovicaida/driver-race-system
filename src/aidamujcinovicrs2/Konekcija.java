/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aidamujcinovicrs2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Konekcija {
    private static final String korisnik ="root";
    private static final String sifra="aidamujcinovic";
    private static final  String con="jdbc:mysql://localhost:3306/utrka?serverTimezone=UTC";
    
    public Connection veza=null;
    public Konekcija() throws SQLException{
        try{
            veza=DriverManager.getConnection(con,korisnik,sifra);
            System.out.println("Konekcija uspjesna");

        }catch(SQLException e){
            System.err.println(e);
        } 
    }
    
   public void unesiVozilo(Vozilo v) throws SQLException{
       Statement queryBase=(Statement) veza.createStatement();
       
       String upit = "INSERT INTO  vozilo ( marka, tip, gorivo, broj)   VALUES('"+v.getMarka()+"','"+v.getTip()+"','"+v.getGorivo()+"',"+v.getBroj()+")";
       try{
           queryBase.executeUpdate(upit);
       }catch(SQLException e){
           System.out.println(e);
       }
     
   }
    
    public ResultSet  ispisiVozila() throws SQLException{
       Statement upitBaza=(Statement) veza.createStatement();
       String upit="SELECT * FROM vozilo";
       ResultSet rezultat=null;
       try {
            rezultat = upitBaza.executeQuery(upit);
            return rezultat;
           
       }catch(SQLException e){
          System.err.println(e);
          
       }
       return rezultat;
       
       
       
   }
    public ResultSet getRowCount(){
       ResultSet rowCount=null;
       try{
          Statement st=veza.createStatement();
          String query="select count(*) from vozilo";
          rowCount=st.executeQuery(query);
          return rowCount;
          
       }catch(SQLException e){
           System.err.println(e);
       }
       return rowCount;
       
   }
    
    public void unosVozaca(Vozac v) throws SQLException{
       Statement queryBase=(Statement)veza.createStatement();
       String upit="INSERT INTO vozac(ime,prezime, godiste, idVozilo)  VALUES('"+v.getIme()+"','"+v.getPrezime()+"',"+ v.getGodiste()+","+v.getIdVozilo()+")";
       try{
           queryBase.executeUpdate(upit);
       }catch(SQLException e){
           System.err.println(e);
       }
   }
    
    
    
    public ResultSet ispis() throws SQLException{
       Statement queryBase=(Statement) veza.createStatement();
       String upit="SELECT * FROM vozac v INNER JOIN vozilo l on l.id=v.idVozilo ORDER BY v.godiste ASC";
       ResultSet result=null;
       try{
           result=queryBase.executeQuery(upit);
       }catch(SQLException e){
           System.out.println(e);
       }
       return result;
       
       
       
   }
    
    public ResultSet pretragaVozaca(String vozac ){ 
       try {
           Konekcija kon=new Konekcija();
           Statement st= veza.createStatement();
           String query=String.format("SELECT * FROM vozac v INNER JOIN vozilo l on l.id=v.idVozilo where v.ime like  '"+vozac+"' or v.prezime like '"+vozac+"' or v.godiste like "+vozac );
           ResultSet pjesma=st.executeQuery(query);
           return pjesma;
           
       }catch(SQLException e){
           System.err.println(e);
           return null;
       }
       
   }
}
