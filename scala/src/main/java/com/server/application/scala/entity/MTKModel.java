package com.server.application.scala.entity;

import java.io.Serializable;
import java.util.List;

import com.server.application.scala.helper.ObjectConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class MTKModel {
    @Id
    private String mtkId;
    private List<String> transportService;
    @Convert(converter = ObjectConverter.class)
    private Object valueOfService;
    private List<String> rtpSession;
    private List<String> fluteChannel;

}
