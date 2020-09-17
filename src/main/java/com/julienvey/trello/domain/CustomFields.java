package com.julienvey.trello.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFields extends TrelloEntity {

    private String id;
    private String idModel;
    private String modelType;
    private String fieldGroup;
    private String name;
    private String pos;
    private String type;


    /* API */
//    public void addLabels(String... labels) {
//        trelloService.addLabelsToCard(id, labels);
//    }
//
//    public void addComment(String comment) {
//        trelloService.addCommentToCard(id, comment);
//    }
//
//    public List<Action> getActions(Argument... filters) {
//        return trelloService.getCardActions(id, filters);
//    }
//
//    public List<Member> fetchMembers(Argument... args) {
//        return trelloService.getCardMembers(id, args);
//    }
//
//    public void deleteAttachment(String attachmentId) {
//        trelloService.deleteAttachment(id, attachmentId);
//    }
//
//    public void delete() {
//        getTrelloService().deleteCard(id);
//    }

    /* Accessors */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdModel() {
        return idModel;
    }

    public void setIdModel(String idModel) {
        this.idModel = idModel;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getFieldGroup() {
        return fieldGroup;
    }

    public void setFieldGroup(String fieldGroup) {
        this.fieldGroup = fieldGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
