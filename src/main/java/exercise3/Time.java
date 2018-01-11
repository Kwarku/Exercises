package exercise3;

class Time {
    private int hour;
    private int minutes;

    Time(int minutes) {
        this(0, minutes);
    }

    Time(int hour, int minutes) {
        setHour(hour);
        setMinutes(minutes);
    }


    Time addition(Time time) {
        Time tempTime = new Time(time.getHour(), time.getMinutes());

        tempTime.setMinutes(tempTime.getMinutes() + getMinutes());
        tempTime.setHour(tempTime.getHour() + getHour());

        return tempTime;

    }

    Time subtraction(Time time) {
        Time tempTime = new Time(time.getHour(), time.getMinutes());

        tempTime.setHour(tempTime.getHour() - getHour());
        tempTime.setMinutes(tempTime.getMinutes() - getMinutes());

        return tempTime;
    }

    Time multiply(int multipler) {
        Time tempTime = new Time(getHour(), getMinutes());
        tempTime.setHour(tempTime.getHour() * multipler);
        tempTime.setMinutes(tempTime.getMinutes() * multipler);
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

        if (minutes >= 60) {
            while (minutes >= 60) {
                minutes -= 60;
                setHour(getHour() + 1);
            }
        } else if (minutes < 0) {
            minutes += 60;
            setHour(getHour() - 1);
        }

        this.minutes = minutes;
    }


}
