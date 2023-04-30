package com.miPortfolio.esnelmassaro.service;

import com.miPortfolio.esnelmassaro.model.Persona;
import com.miPortfolio.esnelmassaro.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired IPersonaRepository persoRepo;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> per = persoRepo.findAll();
        return per;
    }

    @Override
    public void savePersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona per = persoRepo.findById(id).orElse(null);
        return per;
    }
    
}
