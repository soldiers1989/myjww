package com.jww.ump.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.jww.common.core.base.BaseModel;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * <p>
 * 定时任务
 * </p>
 *
 * @author kevinWang
 * @since 2018-09-18
 */
@Data
@TableName("sys_schedule_job")
public class SysScheduleJobModel extends BaseModel {

    private static final long serialVersionUID = 1L;

    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";

    @NotBlank(message = "任务名称不能为空")
    @TableField("task_name")
    private String taskName;
    /**
     * spring bean名称
     */
    @NotBlank(message = "bean名称不能为空")
    @TableField("bean_name")
    private String beanName;
    /**
     * 方法名
     */
    @TableField("method_name")
    private String methodName;
    /**
     * 参数
     */
    private String params;
    /**
     * cron表达式
     */
    @TableField("cron_expression")
    private String cronExpression;
    /**
     * 任务状态  0：正常  1：暂停
     */
    private Integer status;


    @Override
    public String toString() {
        return "SysScheduleJob{" +
                ",taskName=" + taskName +
                ", beanName=" + beanName +
                ", methodName=" + methodName +
                ", params=" + params +
                ", cronExpression=" + cronExpression +
                ", status=" + status +
                "}";
    }
}