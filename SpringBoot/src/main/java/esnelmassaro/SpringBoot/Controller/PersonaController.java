
package esnelmassaro.SpringBoot.Controller;

import esnelmassaro.SpringBoot.model.Persona;
import esnelmassaro.SpringBoot.service.IPersonaService;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
// List<Persona> listaPersonas = new ArrayList();    
//    @GetMapping  ("/hello/{name}/{surname}") // cuando alguien entre en localhost:8080/hello se va a ejecutar el comando.
//                                           // por defecto todos los navegadores usan el metodo get
//                                           // para hacer un post si o si necestia una solicitud
//    public String sayHello(@PathVariable String name, 
//                                       @PathVariable String surname){
//        return "Hello World!" + name + surname ;
//    }   
//   @GetMapping ("/bye") 
//   public String sayBye(@RequestParam String name, // esto es mucho mejorrrr!!!
//                                    @RequestParam String surname){
//        return "Bye world!" + name + surname;
//   }
   
    @Autowired
    
    private IPersonaService persoServ;
    
   @PostMapping ("/new/persona")
   public void agregarPersona (@RequestBody Persona pers) { //Request para pedirle al servidorle, Response es la respuesta
       persoServ.crearPersona(pers);

//       listaPersonas.add(pers);
   }
   
   @GetMapping("/view/personas")
   @ResponseBody
   public List<Persona> verPersonas (){
       return persoServ.verPersonas();
       
//       return listaPersonas;
   }
   
   @DeleteMapping("/delete/personas/{id}")
   public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
   }
   
       @PutMapping("edit/personas/{id}")
    public Persona editPersona(@PathVariable Long id,
                                                @RequestParam("nombre") String nuevoNombre,
                                                @RequestParam("apellido") String nuevoApellido,
                                                @RequestParam("img") String nuevoImg,
                                                @RequestParam("aboutMe") String nuevoAboutMe
    ){
        Persona per =  persoServ.buscarPersona(id);
        
        per.setNombre(nuevoNombre);
        per.setApellido(nuevoApellido);
        per.setImg(nuevoImg);
        per.setAboutMe(nuevoAboutMe);
        
        persoServ.guardarPersona(per);
        return per;
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
    return persoServ.buscarPersona((long)1);
    }
   
   
   
   // Esto se puede hacer tambien con @PutMapping para moficaciones y @DeleteMapping para borrar el registro.
   // Hay que hacer la modificiacion!!!
}
