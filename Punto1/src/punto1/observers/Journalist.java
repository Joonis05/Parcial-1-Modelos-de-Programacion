/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1.observers;

import punto1.Observer;

/**
 *
 * @author estudiantes
 */
public class Journalist implements Observer{
    public void update(String message){
        System.out.println("Journalist notified: " + message);
    }
}
