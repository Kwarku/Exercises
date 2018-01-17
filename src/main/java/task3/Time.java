package task3;

class Time {
    public static final int MINUTES_ON_HOUR = 60;
    private int hour;
    private int minutes;

    Time(int minutes) {
        this(0, minutes);
    }

    Time(int hour, int minutes) {
        setHour(hour);
        setMinutes(minutes);
    }

    public static Time addingUp(Time[] array, int n) {
        Time tempTime = new Time(0);

        for (int i = 0; i < array.length; i++) {
            if (i < n) {
                tempTime.setHour(tempTime.getHour() + array[i].getHour());
                tempTime.setMinutes(tempTime.getMinutes() + array[i].getMinutes());
            } else return tempTime;

        }
        return tempTime;
    }

    public Time addition(Time time) {
        Time tempTime = new Time(time.getHour(), time.getMinutes());

        tempTime.setMinutes(tempTime.getMinutes() + getMinutes());
        tempTime.setHour(tempTime.getHour() + getHour());

        return tempTime;

    }

    public Time subtraction(Time time) {
        Time tempTime = new Time(time.getHour(), time.getMinutes());

        tempTime.setHour(tempTime.getHour() - getHour());
        tempTime.setMinutes(tempTime.getMinutes() - getMinutes());

        return tempTime;
    }

    public Time multiply(int multiplier) {
        Time tempTime = new Time(getHour(), getMinutes());
        tempTime.setHour(tempTime.getHour() * multiplier);
        tempTime.setMinutes(tempTime.getMinutes() * multiplier);
        return tempTime;
    }

    @Override
    public String toString() {
        return getHour() + " h  " + getMinutes() + " min";
    }

    int getHour() {
        return hour;
    }

    void setHour(int hour) {
        this.hour = hour;
    }

    int getMinutes() {
        return minutes;
    }

    void setMinutes(int minutes) {

        if (minutes >= MINUTES_ON_HOUR) {
            while (minutes >= Time.MINUTES_ON_HOUR) {
                minutes -= Time.MINUTES_ON_HOUR;
                setHour(getHour() + 1);
            }
        } else if (minutes < 0) {
            minutes += Time.MINUTES_ON_HOUR;
            setHour(getHour() - 1);
        }

        this.minutes = minutes;
    }


}
