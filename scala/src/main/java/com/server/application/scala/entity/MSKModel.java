package com.server.application.scala.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MSKModel {
    private String mskId;
    private List<String> service;
    private String domainId;
    private MTKModel mtk;


    
}
