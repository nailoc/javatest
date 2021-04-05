package com.hk.app;

public class Exam53 {

    int seconds;
    int minutes;
    int hours;

    public Exam53(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {

      // create objects of Time class
    	Exam53 start = new Exam53(8, 12, 15);
    	Exam53 stop = new Exam53(12, 34, 55);
    	Exam53 diff;

        // call difference method
        diff = difference(start, stop);

        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static Exam53 difference(Exam53 start, Exam53 stop)
    {
    	Exam53 diff = new Exam53(0, 0, 0);

        // if start second is greater
        // convert minute of stop into seconds
        // and add seconds to stop second
        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;

        // if start minute is greater
        // convert stop hour into minutes
        // and add minutes to stop minutes
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;

        // return the difference time
        return(diff);
    }
}
