package com.julienvey.trello.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card extends TrelloEntity {

    private String id;
    private String name;
    private String idList;
    private String desc;
    private String url;
    private Date due;
    private boolean dueComplete;
    private List<String> idMembers;
    private List<String> idLabels;
    private List<Label> labels;
    private Badges badges;
    private List<CardCheckItem> checkItemStates;
    private boolean closed;
    private Date dateLastActivity;
    private String idBoard;
    private List<String> idChecklists;
    private List<String> idMembersVoted;
    private String idShort;
    private String idAttachmentCover;
    private boolean manualCoverAttachment;
    private long pos;
    private String shortLink;
    private String shortUrl;
    private boolean subscribed;
    private boolean dueComplete;
    private List<CustomFieldsItem> customFieldItems;
    private Cover cover;
    private List<Attachment> attachments;

    /* API */
    public void addLabels(String... labels) {
        trelloService.addLabelsToCard(id, labels);
    }

    public void addComment(String comment) {
        trelloService.addCommentToCard(id, comment);
    }

    public List<Action> getActions(Argument... filters) {
        return trelloService.getCardActions(id, filters);
    }

    public List<Member> fetchMembers(Argument... args) {
        return trelloService.getCardMembers(id, args);
    }

    public List<CustomFieldsItem> fetchCustomFieldsItems(Argument... args) {
        return trelloService.getCardCustomFieldsItems(id, args);
    }

    public void updateCustomField(String idCustomFieldCustom, String type, String value) {
        CustomFieldsItem customFieldsItem = new CustomFieldsItem();
        if (value != null) {
            customFieldsItem.setValue(new CustomFieldsItem.CustomFieldItemValue());
            switch (type) {
                case "text":
                    customFieldsItem.getValue().setText(value);
                    break;
                case "number":
                    customFieldsItem.getValue().setNumber(value);
                    break;
                case "checkbox":
                    customFieldsItem.getValue().setChecked(value);
                    break;
                case "date":
                    customFieldsItem.getValue().setDate(value);
                    break;
            }
            trelloService.updateCustomField(id, idCustomFieldCustom, customFieldsItem);
        } else {
            trelloService.updateCustomField(id, idCustomFieldCustom, customFieldsItem, new Argument("value", null));
        }
    }

    public void deleteAttachment(String attachmentId) {
        trelloService.deleteAttachment(id, attachmentId);
    }

    public void delete() {
        getTrelloService().deleteCard(id);
    }

    /* Accessors */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public boolean isDueComplete() {
		return dueComplete;
	}

	public void setDueComplete(boolean dueComplete) {
		this.dueComplete = dueComplete;
	}

	public List<String> getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(List<String> idMembers) {
        this.idMembers = idMembers;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<CardCheckItem> getCheckItemStates() {
        return checkItemStates;
    }

    public void setCheckItemStates(List<CardCheckItem> checkItemStates) {
        this.checkItemStates = checkItemStates;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Date getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(Date dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public List<String> getIdChecklists() {
        return idChecklists;
    }

    public void setIdChecklists(List<String> idChecklists) {
        this.idChecklists = idChecklists;
    }

    public List<String> getIdMembersVoted() {
        return idMembersVoted;
    }

    public void setIdMembersVoted(List<String> idMembersVoted) {
        this.idMembersVoted = idMembersVoted;
    }

    public String getIdShort() {
        return idShort;
    }

    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    public String getIdAttachmentCover() {
        return idAttachmentCover;
    }

    public void setIdAttachmentCover(String idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    public boolean isManualCoverAttachment() {
        return manualCoverAttachment;
    }

    public void setManualCoverAttachment(boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    public List<String> getIdLabels() {
        return idLabels;
    }

    public void setIdLabels(List<String> idLabels) {
        this.idLabels = idLabels;
    }

    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public Badges getBadges() {
        return badges;
    }

    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Card update() {
        return trelloService.updateCard(this);
    }

    public List<CustomFieldsItem> getCustomFieldItems() {
        return customFieldItems;
    }

    public void setCustomFieldItems(List<CustomFieldsItem> customFieldItems) {
        this.customFieldItems = customFieldItems;
    }

    public boolean isDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CardCheckItem {

        private String idCheckItem;
        private String state;

        public String getIdCheckItem() {
            return idCheckItem;
        }

        public void setIdCheckItem(String idCheckItem) {
            this.idCheckItem = idCheckItem;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

    }
}
