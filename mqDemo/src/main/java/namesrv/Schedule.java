package namesrv;

import common.ThreadFactoryImpl;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {

    private final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryImpl(
            "NSScheduledThread"));

    public static void main(String[] args) {

        Schedule schedule = new Schedule();
        schedule.scheduleTest();
    }

    public void scheduleTest(){
        this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                System.out.println("hello rocketmq"+System.currentTimeMillis());
            }
        }, 0, 3, TimeUnit.SECONDS);
    }
}
