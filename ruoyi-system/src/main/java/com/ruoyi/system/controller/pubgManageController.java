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
import com.ruoyi.system.domain.pubgManage;
import com.ruoyi.system.service.IpubgManageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 光子版本信息Controller
 * 
 * @author jcl
 * @date 2025-05-22
 */
@Controller
@RequestMapping("/system/pubgManage")
public class pubgManageController extends BaseController
{
    private String prefix = "system/pubgManage";

    @Autowired
    private IpubgManageService pubgManageService;

    @RequiresPermissions("system:pubgManage:view")
    @GetMapping()
    public String pubgManage()
    {
        return prefix + "/pubgManage";
    }

    /**
     * 查询光子版本信息列表
     */
    @RequiresPermissions("system:pubgManage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(pubgManage pubgManage)
    {
        startPage();
        List<pubgManage> list = pubgManageService.selectpubgManageList(pubgManage);
        return getDataTable(list);
    }

    /**
     * 导出光子版本信息列表
     */
    @RequiresPermissions("system:pubgManage:export")
    @Log(title = "光子版本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(pubgManage pubgManage)
    {
        List<pubgManage> list = pubgManageService.selectpubgManageList(pubgManage);
        ExcelUtil<pubgManage> util = new ExcelUtil<pubgManage>(pubgManage.class);
        return util.exportExcel(list, "光子版本信息数据");
    }

    /**
     * 新增光子版本信息
     */
    @RequiresPermissions("system:pubgManage:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存光子版本信息
     */
    @RequiresPermissions("system:pubgManage:add")
    @Log(title = "光子版本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(pubgManage pubgManage)
    {
        return toAjax(pubgManageService.insertpubgManage(pubgManage));
    }

    /**
     * 修改光子版本信息
     */
    @RequiresPermissions("system:pubgManage:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        pubgManage pubgManage = pubgManageService.selectpubgManageById(id);
        mmap.put("pubgManage", pubgManage);
        return prefix + "/edit";
    }

    /**
     * 修改保存光子版本信息
     */
    @RequiresPermissions("system:pubgManage:edit")
    @Log(title = "光子版本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(pubgManage pubgManage)
    {
        return toAjax(pubgManageService.updatepubgManage(pubgManage));
    }

    /**
     * 删除光子版本信息
     */
    @RequiresPermissions("system:pubgManage:remove")
    @Log(title = "光子版本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(pubgManageService.deletepubgManageByIds(ids));
    }
}
