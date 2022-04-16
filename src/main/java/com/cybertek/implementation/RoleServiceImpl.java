package com.cybertek.implementation;

import com.cybertek.dto.RoleDTO;
import com.cybertek.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractMapServices<RoleDTO,Long> implements RoleService {
    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(), object);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(RoleDTO object) {
        super.delete(object);
    }

    @Override
    public RoleDTO findByID(Long id) {
        return super.findByID(id);
    }
}
