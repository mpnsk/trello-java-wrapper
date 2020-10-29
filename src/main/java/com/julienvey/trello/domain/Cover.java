package com.julienvey.trello.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cover {

    public String idAttachment;
    public Object color;
    public Object idUploadedBackground;
    public String size;
    public String brightness;
    public List<Scaled> scaled;
    public String edgeColor;

}