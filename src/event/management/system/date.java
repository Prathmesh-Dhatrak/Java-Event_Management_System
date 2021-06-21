/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.management.system;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author prath
 */
public class date {

    public static boolean isDateAfter(String d1, String d2) {
        SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd");
        boolean b = false;
        try {
            if (dfDate.parse(d1).before(dfDate.parse(d2))) {
                b = true;//If start date is before end date
            } else if (dfDate.parse(d1).equals(dfDate.parse(d2))) {
                b = true;//If two dates are equal
            } else {
                b = false; //If start date is after the end date
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Date is in invalid it should be in yyyy-MM-dd format");
            //e.printStackTrace();
        }
        return b;
    }

}
