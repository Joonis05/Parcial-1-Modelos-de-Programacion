/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto1;

import punto1.observers.CommunityManager;
import punto1.observers.Journalist;
import punto1.observers.WebMaster;

/**
 *
 * @author estudiantes
 */
public class Punto1 {
    public static void main(String[] args) {
        Course course = new Course();

        Observer webmaster = new WebMaster();
        Observer journalist = new Journalist();
        Observer communityManager = new CommunityManager();

        course.registerObserver(webmaster);
        course.registerObserver(journalist);
        course.registerObserver(communityManager);

        course.setCourseInformation("New course on Artificial Intelligence applied to education.");
        course.setCourseInformation("New course on decolonial pedagogy.");
        
        course.removeObserver(journalist);
        
        course.setCourseInformation("New course on smart cities.");
    }   
}
