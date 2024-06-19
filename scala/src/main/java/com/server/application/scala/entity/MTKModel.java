package com.server.application.scala.entity;

import java.util.List;

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
public class MTKModel {
    private String mtkId;
    private List<String> transportService;
    private Object data;
    private List<String> rtpSession;
    private List<String> fluteChannel;

}
