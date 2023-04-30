package com.miPortfolio.esnelmassaro.service;

import com.miPortfolio.esnelmassaro.model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersona();
    public void savePersona(Persona per);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    
}
