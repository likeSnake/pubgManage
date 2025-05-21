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
import com.ruoyi.system.domain.Pubgentity;
import com.ruoyi.system.service.IPubgentityService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 光子信息Controller
 * 
 * @author ruoyi
 * @date 2025-05-21
 */
@Controller
@RequestMapping("/system/pubgentity")
public class PubgentityController extends BaseController
{
    private String prefix = "system/pubgentity";

    @Autowired
    private IPubgentityService pubgentityService;

    @RequiresPermissions("system:pubgentity:view")
    @GetMapping()
    public String pubgentity()
    {
        return prefix + "/pubgentity";
    }

    /**
     * 查询光子信息列表
     */
    @RequiresPermissions("system:pubgentity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Pubgentity pubgentity)
    {
        startPage();
        List<Pubgentity> list = pubgentityService.selectPubgentityList(pubgentity);
        return getDataTable(list);
    }

    /**
     * 导出光子信息列表
     */
    @RequiresPermissions("system:pubgentity:export")
    @Log(title = "光子信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Pubgentity pubgentity)
    {
        List<Pubgentity> list = pubgentityService.selectPubgentityList(pubgentity);
        ExcelUtil<Pubgentity> util = new ExcelUtil<Pubgentity>(Pubgentity.class);
        return util.exportExcel(list, "光子信息数据");
    }

    /**
     * 新增光子信息
     */
    @RequiresPermissions("system:pubgentity:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存光子信息
     */
    @RequiresPermissions("system:pubgentity:add")
    @Log(title = "光子信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Pubgentity pubgentity)
    {
        return toAjax(pubgentityService.insertPubgentity(pubgentity));
    }

    /**
     * 修改光子信息
     */
    @RequiresPermissions("system:pubgentity:edit")
    @GetMapping("/edit/{name}")
    public String edit(@PathVariable("name") String name, ModelMap mmap)
    {
        Pubgentity pubgentity = pubgentityService.selectPubgentityByName(name);
        mmap.put("pubgentity", pubgentity);
        return prefix + "/edit";
    }

    /**
     * 修改保存光子信息
     */
    @RequiresPermissions("system:pubgentity:edit")
    @Log(title = "光子信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Pubgentity pubgentity)
    {
        return toAjax(pubgentityService.updatePubgentity(pubgentity));
    }

    /**
     * 删除光子信息
     */
    @RequiresPermissions("system:pubgentity:remove")
    @Log(title = "光子信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(pubgentityService.deletePubgentityByNames(ids));
    }
}
