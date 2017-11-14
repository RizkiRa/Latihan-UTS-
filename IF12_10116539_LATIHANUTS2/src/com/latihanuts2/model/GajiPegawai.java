/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihanuts2.model;

/**
 *
 * @author Amerigantini
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTrans;
    private int uangTun;
    private int gajiPok;
    private int totalG;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTrans() {
        return uangTrans;
    }

    public void setUangTrans(int uangTrans) {
        this.uangTrans = uangTrans;
    }

    public int getUangTun() {
        return uangTun;
    }

    public void setUangTun(int uangTun) {
        this.uangTun = uangTun;
    }

    public int getGajiPok() {
        return gajiPok;
    }

    public void setGajiPok(int gajiPok) {
        this.gajiPok = gajiPok;
    }

    public int totalG(int uangTun, int uangTrans, int gajiPok){ 
        return totalG = uangTun + uangTrans + gajiPok;
    }

    
    
}
    
    
    

