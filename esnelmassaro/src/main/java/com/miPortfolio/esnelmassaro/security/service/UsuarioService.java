
package com.miPortfolio.esnelmassaro.security.service;

import com.miPortfolio.esnelmassaro.security.model.Usuario;
import com.miPortfolio.esnelmassaro.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository usuarioRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existeByNombreUsuario(String nombreUsuario){
        return usuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existeByEmail(String email) {
        return usuarioRepo.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        usuarioRepo.save(usuario);    
    }
}
