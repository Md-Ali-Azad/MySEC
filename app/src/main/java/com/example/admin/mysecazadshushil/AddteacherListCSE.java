package com.example.admin.mysecazadshushil;

public class AddteacherListCSE {
     String tech_name;
     String tech_positon;
     String tech_contact;
     String tech_img;
    public AddteacherListCSE()
    {

    }
    public AddteacherListCSE(String tech_name, String tech_positon, String tech_contact, String tech_img) {
        this.tech_name = tech_name;
        this.tech_positon = tech_positon;
        this.tech_contact = tech_contact;
        this.tech_img = tech_img;
    }
    public void setTech_name(String tech_name) {
        this.tech_name = tech_name;
    }

    public void setTech_position(String tech_positon) {
        this.tech_positon = tech_positon;
    }

    public void setTech_contact(String tech_contact) {
        this.tech_contact = tech_contact;
    }

    public void setTech_image(String tech_img) {
        this.tech_img = tech_img;
    }
    public String getTech_name() {
        return tech_name;
    }

    public String getTech_position() {
        return tech_positon;
    }

    public String getTech_contact() {
        return tech_contact;
    }

    public String getTech_image() {
        return tech_img;
    }

}
