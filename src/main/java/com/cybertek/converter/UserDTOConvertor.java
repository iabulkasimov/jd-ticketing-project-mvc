package com.cybertek.converter;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class UserDTOConvertor implements Converter<String, UserDTO> {

    @Autowired
    UserService userService;

    @Override
    public UserDTO convert(String source) {
        return userService.findByID(source);
    }
}
