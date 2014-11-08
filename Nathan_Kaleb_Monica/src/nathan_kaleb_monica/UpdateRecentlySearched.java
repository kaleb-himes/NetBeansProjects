/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nathan_kaleb_monica;

/**
 *
 * @author Kaleb
 */
public class UpdateRecentlySearched extends GUI {
    public static void update() {
        /* SQL Query to update a table of < # times searched > */
        
        //String JavaSearch = GUI.searchTextArea.getText();
        //SELECT < song name >
        //FROM < songs >
        //WHERE < song name > = JavaSearch;
        
        //if (query returns !NULL) {
            // UPDATE < songs >
            //SET <times searched> = < old value + 1 >
            //WHERE < song name > = JavaSearch;
        //}
        //else {
            //SELECT < artist name >
            //FROM < artists >
            //WHERE < artist name > = JavaSearch;
        
            //if (query returns !NULL) {
                // UPDATE < artist >
                //SET <times searched> = < old value + 1 >
                //WHERE < artist name > = JavaSearch;
            //}
        //}
        
        //Add in albums later.
        
        
        /* Update the text area*/
        GUI.recentTextArea.setText("Updating Recently Searched.\n");
    }
}
