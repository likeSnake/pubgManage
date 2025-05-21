package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 光子用户对象 gzuser
 * 
 * @author jcl
 * @date 2025-05-21
 */
public class GzUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    private String deviceCode;

    /** 版本名 */
    @Excel(name = "版本名")
    private String versionName;

    /** 选择的UI 0-旧UI 1-新UI */
    @Excel(name = "选择的UI 0-旧UI 1-新UI")
    private String chooseUI;

    /** 手机型号 */
    @Excel(name = "手机型号")
    private String deviceModel;

    /** 启动次数 */
    @Excel(name = "启动次数")
    private Long startTemp;

    /** 首次启动时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "首次启动时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstTime;

    /** 最后一次打开时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "最后一次打开时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastTime;

    /** 杂项信息 */
    @Excel(name = "杂项信息")
    private String pubgInfoContent;

    public void setDeviceCode(String deviceCode) 
    {
        this.deviceCode = deviceCode;
    }

    public String getDeviceCode() 
    {
        return deviceCode;
    }

    public void setVersionName(String versionName) 
    {
        this.versionName = versionName;
    }

    public String getVersionName() 
    {
        return versionName;
    }

    public void setChooseUI(String chooseUI) 
    {
        this.chooseUI = chooseUI;
    }

    public String getChooseUI() 
    {
        return chooseUI;
    }

    public void setDeviceModel(String deviceModel) 
    {
        this.deviceModel = deviceModel;
    }

    public String getDeviceModel() 
    {
        return deviceModel;
    }

    public void setStartTemp(Long startTemp) 
    {
        this.startTemp = startTemp;
    }

    public Long getStartTemp() 
    {
        return startTemp;
    }

    public void setFirstTime(Date firstTime) 
    {
        this.firstTime = firstTime;
    }

    public Date getFirstTime() 
    {
        return firstTime;
    }

    public void setLastTime(Date lastTime) 
    {
        this.lastTime = lastTime;
    }

    public Date getLastTime() 
    {
        return lastTime;
    }

    public void setPubgInfoContent(String pubgInfoContent) 
    {
        this.pubgInfoContent = pubgInfoContent;
    }

    public String getPubgInfoContent() 
    {
        return pubgInfoContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deviceCode", getDeviceCode())
            .append("versionName", getVersionName())
            .append("chooseUI", getChooseUI())
            .append("deviceModel", getDeviceModel())
            .append("startTemp", getStartTemp())
            .append("firstTime", getFirstTime())
            .append("lastTime", getLastTime())
            .append("pubgInfoContent", getPubgInfoContent())
            .toString();
    }
}
