package oop.vererbung;

public class Wecker extends ElectronicDevice{
    private int hour;
    private int minute;

    public Wecker(String name, int hour, int minute) {
        super(name);
        this.hour = hour;
        this.minute = minute;
    }

    public Wecker(String name) {
        this(name, 6, 30);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    private void setHour(int hour) {
        if (hour < 0) {
            this.hour = 6;
        } else if (hour > 24) {
            this.hour = 24;
        } else {
            this.hour = hour;
        }
    }

    private void setMinute(int minute) {
        if (minute < 0) {
            this.minute = 30;
        } else if (minute > 60) {
            this.minute = 60;
        } else {
            this.minute = minute;
        }
    }

    public void setAlarm(int hour, int minute) {
        this.setHour(hour);
        this.setMinute(minute);
    }
    
    @Override
    public String toString() {
        if (this.isOn()) {
            return this.getDeviceName() + " --> " + this.hour + ':' + this.minute;
        } else {
            return this.getDeviceName() + " --> deaktiviert";
        }
    }
}
