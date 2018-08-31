package com.example.josur.bluetoothtester;

public interface BeaconListener {
    void beaconRecieved(String uuid,int minor, int mayor);

    void scaning(Boolean scanning);
}
