package oop.vererbung;

public class ElectronicDevice {
    private String deviceName;
    private boolean isOn = false;

    public ElectronicDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void on() {
        this.isOn = true;
    }
    
    public void off() {
        this.isOn = false;
    }
    
    public boolean isOn() {
        return this.isOn;
    }

    public String toString() {
        if (isOn) {
            return this.deviceName + ": EIN";
        } else {
            return this.deviceName + ": AUS";
        }
    }
}
