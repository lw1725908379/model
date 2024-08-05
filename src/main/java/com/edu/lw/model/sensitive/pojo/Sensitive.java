package com.edu.lw.model.sensitive.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sensitive")
public class Sensitive {

    private Long id;

    @TableField("sensitives")
    private String sensitives;

    @TableField("createdTime")
    private Date createdTime;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSensitives() {
        return sensitives;
    }

    public void setSensitives(String sensitives) {
        this.sensitives = sensitives;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    // toString method

    @Override
    public String toString() {
        return "Sensitive{" +
                "id=" + id +
                ", sensitives='" + sensitives + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}

