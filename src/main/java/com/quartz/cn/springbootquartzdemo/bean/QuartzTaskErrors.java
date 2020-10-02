package com.quartz.cn.springbootquartzdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuartzTaskErrors {
    private Long id;

    private String taskexecuterecordid;

    private String errorkey;

    private Long createtime;

    private Long lastmodifytime;

    private String errorvalue;
}
