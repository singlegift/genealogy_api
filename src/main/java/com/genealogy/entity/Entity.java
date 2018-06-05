package com.genealogy.entity;

import java.io.Serializable;
import java.util.Date;

public class Entity implements Serializable {
    private Integer id;
    private Date cTime;
    private Date mTime;
    private String cName;
    private String mName;

    public Integer getId() {
        return id;
    }

    public Date getcTime() {
        return cTime;
    }

    public Date getmTime() {
        return mTime;
    }

    public String getcName() {
        return cName;
    }

    public String getmName() {
        return mName;
    }
}
