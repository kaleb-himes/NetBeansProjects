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
public class UpdatePopular extends GUI {
    public static void update() {
        /* Need an SQL query to execute here that gets 
         * # of times played or searched 
         */
        
        //SELECT <song name >
        //FROM < song table >
        //GROUP BY < artist > 
        //ORDER BY < times played > DESC 
        //LIMIT 20
        
        /* update the text area*/
        GUI.popularTextArea.setText("Updating popular.\n");
    }
}
