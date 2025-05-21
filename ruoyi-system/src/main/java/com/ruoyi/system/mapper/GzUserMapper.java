package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GzUser;

/**
 * 光子用户Mapper接口
 * 
 * @author jcl
 * @date 2025-05-21
 */
public interface GzUserMapper 
{
    /**
     * 查询光子用户
     * 
     * @param deviceCode 光子用户主键
     * @return 光子用户
     */
    public GzUser selectGzUserByDeviceCode(String deviceCode);

    /**
     * 查询光子用户列表
     * 
     * @param gzUser 光子用户
     * @return 光子用户集合
     */
    public List<GzUser> selectGzUserList(GzUser gzUser);

    /**
     * 新增光子用户
     * 
     * @param gzUser 光子用户
     * @return 结果
     */
    public int insertGzUser(GzUser gzUser);

    /**
     * 修改光子用户
     * 
     * @param gzUser 光子用户
     * @return 结果
     */
    public int updateGzUser(GzUser gzUser);

    /**
     * 删除光子用户
     * 
     * @param deviceCode 光子用户主键
     * @return 结果
     */
    public int deleteGzUserByDeviceCode(String deviceCode);

    /**
     * 批量删除光子用户
     * 
     * @param deviceCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGzUserByDeviceCodes(String[] deviceCodes);
}
