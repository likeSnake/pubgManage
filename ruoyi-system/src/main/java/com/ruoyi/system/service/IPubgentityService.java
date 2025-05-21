package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Pubgentity;

/**
 * 光子信息Service接口
 * 
 * @author ruoyi
 * @date 2025-05-21
 */
public interface IPubgentityService 
{
    /**
     * 查询光子信息
     * 
     * @param name 光子信息主键
     * @return 光子信息
     */
    public Pubgentity selectPubgentityByName(String name);

    /**
     * 查询光子信息列表
     * 
     * @param pubgentity 光子信息
     * @return 光子信息集合
     */
    public List<Pubgentity> selectPubgentityList(Pubgentity pubgentity);

    /**
     * 新增光子信息
     * 
     * @param pubgentity 光子信息
     * @return 结果
     */
    public int insertPubgentity(Pubgentity pubgentity);

    /**
     * 修改光子信息
     * 
     * @param pubgentity 光子信息
     * @return 结果
     */
    public int updatePubgentity(Pubgentity pubgentity);

    /**
     * 批量删除光子信息
     * 
     * @param names 需要删除的光子信息主键集合
     * @return 结果
     */
    public int deletePubgentityByNames(String names);

    /**
     * 删除光子信息信息
     * 
     * @param name 光子信息主键
     * @return 结果
     */
    public int deletePubgentityByName(String name);
}
