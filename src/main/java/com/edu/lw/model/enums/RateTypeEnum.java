package com.edu.lw.model.enums;

/**
 * @author wenLiu
 * @create 2023-12-31 13:53
 */
public enum RateTypeEnum {

    ADD(1,"增加"),

    PLUS(2,"减少"),

    ;

    Integer code;

    String desc;

    RateTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
