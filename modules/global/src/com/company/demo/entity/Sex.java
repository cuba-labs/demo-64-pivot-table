package com.company.demo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Sex implements EnumClass<String> {

    MALE("Male"),
    FEMALE("Female");

    private String id;

    Sex(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Sex fromId(String id) {
        for (Sex at : Sex.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}