package com.server.application.scala.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserserviceModel {
    @Id
    private String userServiceId;
    private String serviceName;
    private List<String> lstOfId;

    @ManyToOne
    private MSKModel msk; // Changed to @ManyToOne

    @PrePersist
    public void setServiceName() {
        if (serviceName == null) {
            serviceName = "All Service Is Provided";
        }
    }
}
