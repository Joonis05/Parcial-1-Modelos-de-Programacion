/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto2;

import punto2.notificationType.AppNotification;
import punto2.notificationType.EmailNotification;
import punto2.notificationType.SmsNotification;

/**
 *
 * @author estudiantes
 */
public class Punto2 {
    public static void main(String[] args) {

        UserPreferences user1 = new UserPreferences(new SmsNotification());
        user1.sendNotification("Successful transaction for $50");


        user1.setNotificationStrategy(new EmailNotification());
        user1.sendNotification("New balance available: $1200");

        user1.setNotificationStrategy(new AppNotification());
        user1.sendNotification("You have new promotions in your app");
    }
    }
    

