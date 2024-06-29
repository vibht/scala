package com.server.application.scala.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MSKModel {
    @Id
    private String mskId;
    private List<String> service;
    private String domainId;

    @OneToMany
    @JoinColumn(name = "msk_id") // Assuming 'msk_id' is the foreign key column
    private List<MTKModel> mtk;  // Changed to List<MTKModel>
}
