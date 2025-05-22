package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 光子版本信息对象 pubgentity
 * 
 * @author jcl
 * @date 2025-05-22
 */
public class pubgManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 科技名 */
    @Excel(name = "科技名")
    private String name;

    /** 版本代码 */
    @Excel(name = "版本代码")
    private Long version;

    /** 更新内容 */
    @Excel(name = "更新内容")
    private String updateContent;

    /** 版本名 */
    @Excel(name = "版本名")
    private String versionName;

    /** 所有用户启动次数统计 */
    @Excel(name = "所有用户启动次数统计")
    private Long allStartCount;

    /** 是否开启TG验证 */
    @Excel(name = "是否开启TG验证")
    private Long isStartTG;

    /** TG验证的地址 */
    @Excel(name = "TG验证的地址")
    private String tgFilePath;

    /** 自瞄控件隐藏显示 0隐藏 1显示 */
    @Excel(name = "自瞄控件隐藏显示 0隐藏 1显示")
    private Long openAimAuto;

    /** 是否停用 0否 1是 */
    @Excel(name = "是否停用 0否 1是")
    private Long isDeactivated;

    /** 获取手机型号 0否 1是 */
    @Excel(name = "获取手机型号 0否 1是")
    private Long isUploading;

    /** 是否开启卡密验证 0否 1是 */
    @Excel(name = "是否开启卡密验证 0否 1是")
    private Long isStartVerify;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setVersion(Long version) 
    {
        this.version = version;
    }

    public Long getVersion() 
    {
        return version;
    }

    public void setUpdateContent(String updateContent) 
    {
        this.updateContent = updateContent;
    }

    public String getUpdateContent() 
    {
        return updateContent;
    }

    public void setVersionName(String versionName) 
    {
        this.versionName = versionName;
    }

    public String getVersionName() 
    {
        return versionName;
    }

    public void setAllStartCount(Long allStartCount) 
    {
        this.allStartCount = allStartCount;
    }

    public Long getAllStartCount() 
    {
        return allStartCount;
    }

    public void setIsStartTG(Long isStartTG) 
    {
        this.isStartTG = isStartTG;
    }

    public Long getIsStartTG() 
    {
        return isStartTG;
    }

    public void setTgFilePath(String tgFilePath) 
    {
        this.tgFilePath = tgFilePath;
    }

    public String getTgFilePath() 
    {
        return tgFilePath;
    }

    public void setOpenAimAuto(Long openAimAuto) 
    {
        this.openAimAuto = openAimAuto;
    }

    public Long getOpenAimAuto() 
    {
        return openAimAuto;
    }

    public void setIsDeactivated(Long isDeactivated) 
    {
        this.isDeactivated = isDeactivated;
    }

    public Long getIsDeactivated() 
    {
        return isDeactivated;
    }

    public void setIsUploading(Long isUploading) 
    {
        this.isUploading = isUploading;
    }

    public Long getIsUploading() 
    {
        return isUploading;
    }

    public void setIsStartVerify(Long isStartVerify) 
    {
        this.isStartVerify = isStartVerify;
    }

    public Long getIsStartVerify() 
    {
        return isStartVerify;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("version", getVersion())
            .append("updateContent", getUpdateContent())
            .append("versionName", getVersionName())
            .append("allStartCount", getAllStartCount())
            .append("isStartTG", getIsStartTG())
            .append("tgFilePath", getTgFilePath())
            .append("openAimAuto", getOpenAimAuto())
            .append("isDeactivated", getIsDeactivated())
            .append("isUploading", getIsUploading())
            .append("isStartVerify", getIsStartVerify())
            .toString();
    }
}
