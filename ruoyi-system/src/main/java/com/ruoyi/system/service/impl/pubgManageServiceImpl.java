package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.pubgManageMapper;
import com.ruoyi.system.domain.pubgManage;
import com.ruoyi.system.service.IpubgManageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 光子版本信息Service业务层处理
 * 
 * @author jcl
 * @date 2025-05-21
 */
@Service
public class pubgManageServiceImpl implements IpubgManageService 
{
    @Autowired
    private pubgManageMapper pubgManageMapper;

    /**
     * 查询光子版本信息
     * 
     * @param name 光子版本信息主键
     * @return 光子版本信息
     */
    @Override
    public pubgManage selectpubgManageByName(String name)
    {
        return pubgManageMapper.selectpubgManageByName(name);
    }

    /**
     * 查询光子版本信息列表
     * 
     * @param pubgManage 光子版本信息
     * @return 光子版本信息
     */
    @Override
    public List<pubgManage> selectpubgManageList(pubgManage pubgManage)
    {
        return pubgManageMapper.selectpubgManageList(pubgManage);
    }

    /**
     * 新增光子版本信息
     * 
     * @param pubgManage 光子版本信息
     * @return 结果
     */
    @Override
    public int insertpubgManage(pubgManage pubgManage)
    {
        return pubgManageMapper.insertpubgManage(pubgManage);
    }

    /**
     * 修改光子版本信息
     * 
     * @param pubgManage 光子版本信息
     * @return 结果
     */
    @Override
    public int updatepubgManage(pubgManage pubgManage)
    {
        return pubgManageMapper.updatepubgManage(pubgManage);
    }

    /**
     * 批量删除光子版本信息
     * 
     * @param names 需要删除的光子版本信息主键
     * @return 结果
     */
    @Override
    public int deletepubgManageByNames(String names)
    {
        return pubgManageMapper.deletepubgManageByNames(Convert.toStrArray(names));
    }

    /**
     * 删除光子版本信息信息
     * 
     * @param name 光子版本信息主键
     * @return 结果
     */
    @Override
    public int deletepubgManageByName(String name)
    {
        return pubgManageMapper.deletepubgManageByName(name);
    }
}
