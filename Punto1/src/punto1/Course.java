/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiantes
 */
public class Course implements Subject{
    private List<Observer> observers;
    private String informacionCurso;

    public Course() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(informacionCurso);
        }
    }

    public void setCourseInformation(String informacionCurso) {
        this.informacionCurso = informacionCurso;
        notifyObservers();
}
}
