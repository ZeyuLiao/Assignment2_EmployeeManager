/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ZeyuLiao
 */
public class Info {

    /**
     * @param args the command line arguments
     */

    private String name;
    private int id;
    private int age;
    private String gender;
    private String Start_date;
    private String Level;
    private String Team_info;
    private String Position_title;
    private String Contact;
    private Long tel;
    private String email ;
    private Icon Photo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
    public String getStart_date() {
        return Start_date;
    }

    public void setStart_date(String Start_date) {
        this.Start_date = Start_date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam_info() {
        return Team_info;
    }

    public void setTeam_info(String Team_info) {
        this.Team_info = Team_info;
    }

    public String getPosition_title() {
        return Position_title;
    }

    public void setPosition_title(String Position_title) {
        this.Position_title = Position_title;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Icon getPhoto() {
        return Photo;
    }

    public void setPhoto(Icon Photo) {
        this.Photo = Photo;
    }
    
    @Override
    public String toString(){
        return name;       
    }
    
    
}
