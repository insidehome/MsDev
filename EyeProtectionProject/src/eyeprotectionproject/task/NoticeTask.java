/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeprotectionproject.task;

import java.util.TimerTask;
import eyeprotectionproject.gui.EyesProtectionAlert;
import eyeprotectionproject.gui.EyesProtectionAlert;
/**
 *
 * @author msDev
 */
public class NoticeTask extends TimerTask{
    public void run()
    {
        System.out.println("NoticeTask start ....");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EyesProtectionAlert().setVisible(true);
            }
        });        
    }
}
