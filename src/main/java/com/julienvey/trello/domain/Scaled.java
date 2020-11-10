package com.julienvey.trello.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Scaled {

    public String id;
    public Boolean scaled;
    public String url;
    public Integer bytes;
    public Integer height;
    public Integer width;

}