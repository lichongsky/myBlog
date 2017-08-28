package com.lichong.to;

import java.io.Serializable;

public class BaseTO implements Serializable {
    private static final long serialVersionUID = -1954718636395562838L;

    /**
     * 状态，默认1 1：有效 0：无效
     */
    private Integer status;

    /**
     * 优先级 0-255
     */
    private Integer priority = 0;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
