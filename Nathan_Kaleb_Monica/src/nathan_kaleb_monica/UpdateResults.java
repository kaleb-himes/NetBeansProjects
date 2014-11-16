/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nathan_kaleb_monica;

import java.util.ArrayList;
import java.sql.*;
import simplemysql.*;

/**
 *
 * @author Kaleb
 */
public class UpdateResults extends GUI {
    
    public static void update() {
        
        try
    {
      // Step 1: Load the JDBC driver. 
      //csci440.cs.montana.edu ip: 153.90.127.188
      //MySQL port: 3306


//      String url = "www.csci440.cs.montana.edu/phpMyAdmin";
      SimpleMySQL mysql = new SimpleMySQL();
      mysql.connect("153.90.127.188:3306", "himes", "$HERdaBOMB!(&@11", "homework3");
      
            SimpleMySQLResult rs;
 
            rs = mysql.Query("SELECT animal, count(animal) as cnt \n FROM"
                                    + " `favorite_item` group by animal order "
                                    + "by cnt desc");
            while ( rs.next() ) {
                String a = rs.getString("animal");
                System.out.println(a);
            }
            rs.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! "); 
      System.err.println(e.getMessage()); 
    } 
        
        /* SQL Query to populate foundSongs */
        // int matches;
        // String JavaSearch = GUI.searchTextArea.getText();
        
        //SELECT < song name >, < artist name >, < album name >,
        //COUNT( < song name >) as songMatches, 
        //COUNT( < artist name> ) as artistMatches,
        //COUNT( < album name > ) as albumMatches
        //FROM < songs >, < artists > 
        //WHERE < song name > LIKE ("JavaSearch%") OR 
        //      < artist name > LIKE ("JavaSearch%") OR
        //      < album name > LIKE ("JavaSearch%");
        // matches = songMatches + artistMatches + albumMatches;
        
        //for (i = 0; i < matches; i++) {
            //query for songs
            //if (query !NULL) {
                //get results of queries for songs that match and update
                //the resultTextArea on each loop.
                //if (i = matches-1) {
                    //i = 0; //reset so now we can check for artist matches;
                //}
                //continue; //(loop here till done with songs)
            //}
            //query for artists
            //if (query !NULL) {
                //get results of queries for artists that match and update
                //the resultTextArea on each loop
                //if (i == matches - 1) {
                    //i = 0; reset to search for albums
                //}
                //continue; //(loop here till done with artists)
            //}
        //query for albums
            //if (query !NULL) {
                //get results of queries for albums that match and update
                //the resultTextArea on each loop
            //}
        //}
        
        /* Update the result text area */
        GUI.resultTextArea.setText("Updating results.\n");
    }
}
