package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.GzUser;
import com.ruoyi.system.service.IGzUserService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 光子用户Controller
 * 
 * @author jcl
 * @date 2025-05-21
 */
@Controller
@RequestMapping("/system/gzuser")
public class GzUserController extends BaseController
{
    private String prefix = "system/gzuser";

    @Autowired
    private IGzUserService gzUserService;

    @RequiresPermissions("system:gzuser:view")
    @GetMapping()
    public String gzuser()
    {
        return prefix + "/gzuser";
    }

    /**
     * 查询光子用户列表
     */
    @RequiresPermissions("system:gzuser:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GzUser gzUser)
    {
        startPage();
        List<GzUser> list = gzUserService.selectGzUserList(gzUser);
        return getDataTable(list);
    }

    /**
     * 导出光子用户列表
     */
    @RequiresPermissions("system:gzuser:export")
    @Log(title = "光子用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GzUser gzUser)
    {
        List<GzUser> list = gzUserService.selectGzUserList(gzUser);
        ExcelUtil<GzUser> util = new ExcelUtil<GzUser>(GzUser.class);
        return util.exportExcel(list, "光子用户数据");
    }

    /**
     * 新增光子用户
     */
    @RequiresPermissions("system:gzuser:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存光子用户
     */
    @RequiresPermissions("system:gzuser:add")
    @Log(title = "光子用户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GzUser gzUser)
    {
        return toAjax(gzUserService.insertGzUser(gzUser));
    }

    /**
     * 修改光子用户
     */
    @RequiresPermissions("system:gzuser:edit")
    @GetMapping("/edit/{deviceCode}")
    public String edit(@PathVariable("deviceCode") String deviceCode, ModelMap mmap)
    {
        GzUser gzUser = gzUserService.selectGzUserByDeviceCode(deviceCode);
        mmap.put("gzUser", gzUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存光子用户
     */
    @RequiresPermissions("system:gzuser:edit")
    @Log(title = "光子用户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GzUser gzUser)
    {
        return toAjax(gzUserService.updateGzUser(gzUser));
    }

    /**
     * 删除光子用户
     */
    @RequiresPermissions("system:gzuser:remove")
    @Log(title = "光子用户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gzUserService.deleteGzUserByDeviceCodes(ids));
    }
}
