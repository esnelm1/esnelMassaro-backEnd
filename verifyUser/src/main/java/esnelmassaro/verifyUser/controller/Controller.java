
package esnelmassaro.verifyUser.controller;

import esnelmassaro.verifyUser.model.User;
import esnelmassaro.verifyUser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private IUserService userServ;
    //Aca es donde le paso el control al usuario para que cree el token
    //Y deberia hacer la capa de authorization pero me parece que esta la realiza el front end
    //el video. Porque lo que hace es verificar contra el token de la base de datos.
    
   @PostMapping ("/user")
   public void addUser (@RequestBody User us) { //Request para pedirle al servidorle, Response es la respuesta
       userServ.createUser(us);	
	}
}
