package oop.vererbung;

public class Radio extends ElectronicDevice {
    private String station;
    private int volume = 0;

    public Radio(String station, int volume) {
        super("Radio");
        this.station = station;
        this.volume = volume;
    }

    public Radio(String station) {
        this(station, 0);
    }

    public int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    public void volumeUp() {
        this.setVolume(getVolume() + 1);
    }

    public void volumeDown() {
        this.setVolume(getVolume() - 1);
    }

    @Override
    public String toString() {
        if (this.isOn()) {
            return this.station + ": Vol " + this.volume;
        } else {
            return this.station + ": OFF";
        }
    }
}
