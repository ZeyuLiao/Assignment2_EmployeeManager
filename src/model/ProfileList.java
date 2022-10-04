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
    
    private ArrayList<Info> pList;
    
    public ProfileList(){
        this.pList = new ArrayList<Info>();                
    }

    public ArrayList<Info> getHistory() {
        return pList;
    }

    public void setHistory(ArrayList<Info> history) {
        this.pList = history;
    }
    
    
    public Info addNewProfile(){
    
        Info newProfile = new Info();
        pList.add(newProfile);   
        return newProfile;
    }
    
    public void deleteProfiles(Info info){
        pList.remove(info);
        
    }
   
    
}
