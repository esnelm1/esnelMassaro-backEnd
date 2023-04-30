
package esnelmassaro.SpringBoot.service;

import esnelmassaro.SpringBoot.model.Persona;
import esnelmassaro.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired // inyectar dependencia con interfaz
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null); //devuelve la persona, si no encuentra, devuelve null
    }

    @Override
    public void guardarPersona(Persona per) {
        persoRepo.save(per);
    }
    
}
