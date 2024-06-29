package com.server.application.scala.controller;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.application.scala.entity.UserserviceModel;
import com.server.application.scala.service.Userservice;

@RestController
public class userServiceBMSCController {
    @Autowired
    private Userservice userService;

    private static final Logger logger = LogManager.getLogger(userServiceBMSCController.class);

    @PostMapping("/userService")
    public ResponseEntity<UserserviceModel> saveUserService(@RequestBody UserserviceModel model) {
        try {
            UserserviceModel lstValue = userService.saveUserService(model);
            logger.info("The real Value is"+lstValue);
            return ResponseEntity.of(Optional.of(lstValue));

        } catch (Exception e) {

            e.printStackTrace();
            logger.info("Error are occurs" + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @PostMapping("/getUserService")
    public ResponseEntity<UserserviceModel> getSpecificService(@PathVariable("id") String Id){
        try {
            UserserviceModel values =userService.getSpecificService(Id);
            return ResponseEntity.of(Optional.of(values));
        } catch (Exception e) {
            logger.info("These Specific Service is not found In this Id:"+Id);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

}
