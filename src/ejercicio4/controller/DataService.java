package ejercicio4.controller;

import ejercicio4.interfaces.DataStorage;

public class DataService {
    private DataStorage dataStorage;

    public void setDataStorage() {
        dataStorage.save();
    }
}
