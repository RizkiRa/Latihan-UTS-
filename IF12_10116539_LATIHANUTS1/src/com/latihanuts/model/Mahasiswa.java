/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihanuts.model;

/**
 *
 * @author Amerigantini
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    public Mahasiswa(String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    
    

}    

