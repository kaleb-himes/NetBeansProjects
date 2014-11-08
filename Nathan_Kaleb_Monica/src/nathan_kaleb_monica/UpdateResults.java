/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nathan_kaleb_monica;

import java.util.ArrayList;

/**
 *
 * @author Kaleb
 */
public class UpdateResults extends GUI {
    
    public static void update() {
        
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
