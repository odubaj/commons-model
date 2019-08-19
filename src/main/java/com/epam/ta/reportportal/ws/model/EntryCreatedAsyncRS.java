package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * @author Konstantin Antipin
 */
public class EntryCreatedAsyncRS extends EntryCreatedRS {

    @JsonProperty("uuid")
    private String uuid;

    public EntryCreatedAsyncRS() {

    }

    public EntryCreatedAsyncRS(Long id) {
        super.setId(id);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}