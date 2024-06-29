package com.server.application.scala.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.application.scala.entity.MSKModel;
import com.server.application.scala.entity.UserserviceModel;
import com.server.application.scala.repository.UserserviceRepository;

@Service
public class Userservice {

    @Autowired
    private UserserviceRepository userserviceRepository;

    public UserserviceModel saveUserService(UserserviceModel model) {
        UserserviceModel values = null;
        try {
            String realServiceName = model.getServiceName();
            if (!realServiceName.isEmpty() && realServiceName != null) {
                values.setLstOfId(model.getLstOfId());
                values.setUserServiceId(model.getUserServiceId());
                values.setServiceName(model.getServiceName());
                values.setMsk(model.getMsk());

                return userserviceRepository.save(values);

            }
            return values;

        } catch (Exception e) {
            e.printStackTrace();
            throw new UnsupportedOperationException("Unimplemented method 'saveUserService'");
        }

    }

    public UserserviceModel getSpecificService(String id) {
        UserserviceModel userService = null;
    try {
        Optional<UserserviceModel> uu = userserviceRepository.findById(id);
        if(uu.isPresent()){
            userService.setUserServiceId(uu.get().getUserServiceId());
            userService.setServiceName(uu.get().getServiceName());
            userService.setMsk(uu.get().getMsk());
            userService.setLstOfId(uu.get().getLstOfId());

            return userService; 
            
        }
        return userService;
    } catch (Exception e) {
        throw new UnsupportedOperationException("Unimplemented method 'getSpecificService'");
    }
       
    }

}
