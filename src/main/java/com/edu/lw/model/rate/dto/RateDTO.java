package com.edu.lw.model.rate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author wenLiu
 * @create 2024-01-01 10:59
 */
@ApiModel(description = "信誉积分传输对象")
public class RateDTO {
    @ApiModelProperty("信誉积分ID")
    private String id;
    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("告警ID")
    private String warnId;
    @ApiModelProperty("信誉积分变化类型：1-增加，2-减少")
    private Integer type;
    @ApiModelProperty("信誉积分变化分数")
    private Integer score;
    @ApiModelProperty("信誉积分变动时间")
    private Date createTime;
    @ApiModelProperty("信誉积分变动描述")
    private String content;
    @ApiModelProperty("变动后的信誉积分")
    private Integer nowScore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWarnId() {
        return warnId;
    }

    public void setWarnId(String warnId) {
        this.warnId = warnId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNowScore() {
        return nowScore;
    }

    public void setNowScore(Integer nowScore) {
        this.nowScore = nowScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", warnId=").append(warnId);
        sb.append(", type=").append(type);
        sb.append(", score=").append(score);
        sb.append(", createTime=").append(createTime);
        sb.append(", content=").append(content);
        sb.append(", nowScore=").append(nowScore);
        sb.append("]");
        return sb.toString();
    }
}
