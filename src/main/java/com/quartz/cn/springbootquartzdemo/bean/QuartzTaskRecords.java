package com.quartz.cn.springbootquartzdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuartzTaskRecords {
    private Long id;

    private String taskno;

    private String timekeyvalue;

    private Long executetime;

    private String taskstatus;

    private Integer failcount;

    private String failreason;

    private Long createtime;

    private Long lastmodifytime;
}
