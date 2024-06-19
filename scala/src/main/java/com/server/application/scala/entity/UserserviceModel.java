package com.server.application.scala.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserserviceModel {
    private String userServiceId;
    private String serviceName;
    private List<String> lstOfId;
    private MSKModel msk;
    
}
