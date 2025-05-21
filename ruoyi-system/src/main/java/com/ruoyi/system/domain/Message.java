package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 光子版本信息对象 message
 * 
 * @author jcl
 * @date 2025-05-21
 */
public class Message extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 是否显示公告 0否 1是 */
    @Excel(name = "是否显示公告 0否 1是")
    private Integer isShow;

    /** 公告内容 */
    @Excel(name = "公告内容")
    private String Info;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setIsShow(Integer isShow) 
    {
        this.isShow = isShow;
    }

    public Integer getIsShow() 
    {
        return isShow;
    }

    public void setInfo(String Info) 
    {
        this.Info = Info;
    }

    public String getInfo() 
    {
        return Info;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("isShow", getIsShow())
            .append("Info", getInfo())
            .toString();
    }
}
