package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.pubgManage;

/**
 * 光子版本信息Service接口
 * 
 * @author jcl
 * @date 2025-05-22
 */
public interface IpubgManageService 
{
    /**
     * 查询光子版本信息
     * 
     * @param id 光子版本信息主键
     * @return 光子版本信息
     */
    public pubgManage selectpubgManageById(Long id);

    /**
     * 查询光子版本信息列表
     * 
     * @param pubgManage 光子版本信息
     * @return 光子版本信息集合
     */
    public List<pubgManage> selectpubgManageList(pubgManage pubgManage);

    /**
     * 新增光子版本信息
     * 
     * @param pubgManage 光子版本信息
     * @return 结果
     */
    public int insertpubgManage(pubgManage pubgManage);

    /**
     * 修改光子版本信息
     * 
     * @param pubgManage 光子版本信息
     * @return 结果
     */
    public int updatepubgManage(pubgManage pubgManage);

    /**
     * 批量删除光子版本信息
     * 
     * @param ids 需要删除的光子版本信息主键集合
     * @return 结果
     */
    public int deletepubgManageByIds(String ids);

    /**
     * 删除光子版本信息信息
     * 
     * @param id 光子版本信息主键
     * @return 结果
     */
    public int deletepubgManageById(Long id);
}
