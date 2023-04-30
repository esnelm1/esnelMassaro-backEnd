/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miPortfolio.esnelmassaro.repository;

import com.miPortfolio.esnelmassaro.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}

