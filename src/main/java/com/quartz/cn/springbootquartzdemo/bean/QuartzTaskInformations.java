package com.quartz.cn.springbootquartzdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuartzTaskInformations {
    private Long id;

    private Integer version;

    private String taskno;

    private String taskname;

    private String schedulerrule;

    private String frozenstatus;

    private String executorno;

    private Long frozentime;

    private Long unfrozentime;

    private Long createtime;

    private Long lastmodifytime;

    private String sendtype;

    private String url;

    private String executeparamter;

    private String timekey;

}
