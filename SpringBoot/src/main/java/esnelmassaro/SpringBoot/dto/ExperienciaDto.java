/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esnelmassaro.SpringBoot.dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Esnel
 */
public class ExperienciaDto {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String img;
    
    //Constructores

    public ExperienciaDto() {
    }

    public ExperienciaDto(String nombreE, String descripcionE, String img) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.img = img;
    }
    //Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
}
