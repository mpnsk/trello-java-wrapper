package com.julienvey.trello.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFieldsItem extends TrelloEntity {

    private String id;
    private String idCustomField;
    private String idModel;
    private String modelType;

    private CustomFieldItemValue value;

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

    public String getIdCustomField() {
        return idCustomField;
    }

    public void setIdCustomField(String idCustomField) {
        this.idCustomField = idCustomField;
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

    public CustomFieldItemValue getValue() {
        return value;
    }

    public void setValue(CustomFieldItemValue value) {
        this.value = value;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CustomFieldItemValue {
        private String text;
        private String number;
        private String date;
        private String checked;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getChecked() {
            return checked;
        }

        public void setChecked(String checked) {
            this.checked = checked;
        }
    }
}
