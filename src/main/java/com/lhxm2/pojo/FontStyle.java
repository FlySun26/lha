package com.lhxm2.pojo;

import java.io.Serializable;

public class FontStyle implements Serializable {
    private Integer fsId;

    private String fsName;

    private static final long serialVersionUID = 1L;

    public Integer getFsId() {
        return fsId;
    }

    public void setFsId(Integer fsId) {
        this.fsId = fsId;
    }

    public String getFsName() {
        return fsName;
    }

    public void setFsName(String fsName) {
        this.fsName = fsName;
    }
}