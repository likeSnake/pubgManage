package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PubgentityMapper;
import com.ruoyi.system.domain.Pubgentity;
import com.ruoyi.system.service.IPubgentityService;
import com.ruoyi.common.core.text.Convert;

/**
 * 光子信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-21
 */
@Service
public class PubgentityServiceImpl implements IPubgentityService 
{
    @Autowired
    private PubgentityMapper pubgentityMapper;

    /**
     * 查询光子信息
     * 
     * @param name 光子信息主键
     * @return 光子信息
     */
    @Override
    public Pubgentity selectPubgentityByName(String name)
    {
        return pubgentityMapper.selectPubgentityByName(name);
    }

    /**
     * 查询光子信息列表
     * 
     * @param pubgentity 光子信息
     * @return 光子信息
     */
    @Override
    public List<Pubgentity> selectPubgentityList(Pubgentity pubgentity)
    {
        return pubgentityMapper.selectPubgentityList(pubgentity);
    }

    /**
     * 新增光子信息
     * 
     * @param pubgentity 光子信息
     * @return 结果
     */
    @Override
    public int insertPubgentity(Pubgentity pubgentity)
    {
        return pubgentityMapper.insertPubgentity(pubgentity);
    }

    /**
     * 修改光子信息
     * 
     * @param pubgentity 光子信息
     * @return 结果
     */
    @Override
    public int updatePubgentity(Pubgentity pubgentity)
    {
        return pubgentityMapper.updatePubgentity(pubgentity);
    }

    /**
     * 批量删除光子信息
     * 
     * @param names 需要删除的光子信息主键
     * @return 结果
     */
    @Override
    public int deletePubgentityByNames(String names)
    {
        return pubgentityMapper.deletePubgentityByNames(Convert.toStrArray(names));
    }

    /**
     * 删除光子信息信息
     * 
     * @param name 光子信息主键
     * @return 结果
     */
    @Override
    public int deletePubgentityByName(String name)
    {
        return pubgentityMapper.deletePubgentityByName(name);
    }
}
