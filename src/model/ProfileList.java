/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ZeyuLiao
 */
public class ProfileList {
    
    private ArrayList<Info> profile;
    
    public ProfileList(){
        this.profile = new ArrayList<Info>();                
    }

    public ArrayList<Info> getHistory() {
        return profile;
    }

    public void setHistory(ArrayList<Info> history) {
        this.profile = history;
    }
    
    
    public Info addNewProfile(){
    
        Info newProfile = new Info();
        profile.add(newProfile);   
        return newProfile;
    }
    
   
    
}
