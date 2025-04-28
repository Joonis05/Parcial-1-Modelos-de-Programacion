/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.notificationType;

import punto2.NotificationStrategy;

/**
 *
 * @author estudiantes
 */
public class AppNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String message){
        System.out.println("Sending app notification: " + message);
    }
}
