package com.cybertek.implementation;

import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractMapServices<UserDTO,String> implements UserService {
    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(),object);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(String id) {
    super.deleteByID(id);
    }

    @Override
    public void update(UserDTO object) {
        super.update(object.getUserName(),object);
    }

    @Override
    public void delete(UserDTO object) {
    super.delete(object);
    }

    @Override
    public UserDTO findByID(String id) {
        return super.findByID(id);
    }
}
