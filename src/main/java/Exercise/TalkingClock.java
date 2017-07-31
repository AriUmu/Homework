package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by arina on 27.07.17.
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener listener = new TimePrinter();
        javax.swing.Timer timer = new javax.swing.Timer(interval, listener);
        timer.start();
    }

    class TimePrinter implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            System.out.println("Now is " + date);
            if(beep) Toolkit.getDefaultToolkit().beep();

            //TalkingClock.this.beep = beep
        }
    }

}


class UserClock {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Exit?");
        System.exit(0);
    }
}





