
package com.miPortfolio.esnelmassaro.controller;

import com.miPortfolio.esnelmassaro.model.Persona;
import com.miPortfolio.esnelmassaro.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService persoService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return persoService.getPersona();
    }
    
    @PostMapping("personas/crear")
    public String createPersona (@RequestBody Persona per){
        persoService.savePersona(per);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoService.deletePersona(id);
        return "La persona fue eliminada correctamente.";
    }
    
    @PutMapping("personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                                @RequestParam("nombre") String nuevoNombre,
                                                @RequestParam("apellido") String nuevoApellido,
                                                @RequestParam("img") String nuevoImg,
                                                @RequestParam("aboutMe") String nuevoAboutMe
    ){
        Persona per = persoService.findPersona(id);
        
        per.setNombre(nuevoNombre);
        per.setApellido(nuevoApellido);
        per.setImg(nuevoImg);
        per.setAboutMe(nuevoAboutMe);
        
        persoService.savePersona(per);
        return per;
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
    return persoService.findPersona((long)1);
    }
}

                                                

