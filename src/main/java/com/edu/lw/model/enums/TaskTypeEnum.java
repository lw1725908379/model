package com.edu.lw.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 17259
 * @create 2024-07-19 19:30
 */
@Getter
@AllArgsConstructor
public enum TaskTypeEnum {
    //任务类型
    APPOINT_TASK(1001, 1,"预约充电"),
    REMOTEERROR(1002, 2,"第三方接口调用失败，重试");

    private final int taskType; //对应具体业务
    private final int priority; //业务不同级别
    private final String desc; //描述信息
}
