
package esnelmassaro.verifyUser.service;

import esnelmassaro.verifyUser.model.User;


public interface IUserService {
    public void createUser  (User us);
    public void deleteUser (Long id);
    public User lookUser (Long id);
    
    
}
