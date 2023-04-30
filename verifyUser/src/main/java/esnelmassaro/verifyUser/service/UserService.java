
package esnelmassaro.verifyUser.service;

import esnelmassaro.verifyUser.model.User;
import esnelmassaro.verifyUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class UserService implements IUserService {
    @Autowired
    public UserRepository userRepo;

    @Override
    public void createUser(User us) {
        userRepo.save(us);
        
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User lookUser(Long id) {
        return userRepo.findById(id).orElse(null);
                
    }

    
}
