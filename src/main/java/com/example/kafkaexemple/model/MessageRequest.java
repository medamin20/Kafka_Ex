package com.example.kafkaexemple.model;

public class MessageRequest {


    private long id ;
    private String recipient ;
    private String description ;
    private String metadata ;
    private String custom_id ;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getCustom_id() {
        return custom_id;
    }

    public void setCustom_id(String custom_id) {
        this.custom_id = custom_id;
    }


    public MessageRequest() {
    }
    public MessageRequest(long id, String recipient, String description, String metadata, String custom_id) {
        this.id = id;
        this.recipient = recipient;
        this.description = description;
        this.metadata = metadata;
        this.custom_id = custom_id;
    }

    @Override
    public String toString() {
        return "MessageRequest{" +
                "id=" + id +
                ", recipient='" + recipient + '\'' +
                ", description='" + description + '\'' +
                ", metadata='" + metadata + '\'' +
                ", custom_id='" + custom_id + '\'' +
                '}';
    }
}
