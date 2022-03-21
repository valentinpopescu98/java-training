package behavioral.mediator.ex1;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    private Timer timer;

    public TimerExample() {
        timer = new Timer();
        timer.schedule(new FirstReminderTask(), 2000);
        timer.schedule(new SecondReminderTask(), 4000);
    }

    private static class FirstReminderTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time is almost up!");
        }
    }

    private static class SecondReminderTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time is up!");
        }
    }
}
