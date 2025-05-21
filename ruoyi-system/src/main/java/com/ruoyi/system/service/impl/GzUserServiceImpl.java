package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GzUserMapper;
import com.ruoyi.system.domain.GzUser;
import com.ruoyi.system.service.IGzUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * 光子用户Service业务层处理
 * 
 * @author jcl
 * @date 2025-05-21
 */
@Service
public class GzUserServiceImpl implements IGzUserService 
{
    @Autowired
    private GzUserMapper gzUserMapper;

    /**
     * 查询光子用户
     * 
     * @param deviceCode 光子用户主键
     * @return 光子用户
     */
    @Override
    public GzUser selectGzUserByDeviceCode(String deviceCode)
    {
        return gzUserMapper.selectGzUserByDeviceCode(deviceCode);
    }

    /**
     * 查询光子用户列表
     * 
     * @param gzUser 光子用户
     * @return 光子用户
     */
    @Override
    public List<GzUser> selectGzUserList(GzUser gzUser)
    {
        return gzUserMapper.selectGzUserList(gzUser);
    }

    /**
     * 新增光子用户
     * 
     * @param gzUser 光子用户
     * @return 结果
     */
    @Override
    public int insertGzUser(GzUser gzUser)
    {
        return gzUserMapper.insertGzUser(gzUser);
    }

    /**
     * 修改光子用户
     * 
     * @param gzUser 光子用户
     * @return 结果
     */
    @Override
    public int updateGzUser(GzUser gzUser)
    {
        return gzUserMapper.updateGzUser(gzUser);
    }

    /**
     * 批量删除光子用户
     * 
     * @param deviceCodes 需要删除的光子用户主键
     * @return 结果
     */
    @Override
    public int deleteGzUserByDeviceCodes(String deviceCodes)
    {
        return gzUserMapper.deleteGzUserByDeviceCodes(Convert.toStrArray(deviceCodes));
    }

    /**
     * 删除光子用户信息
     * 
     * @param deviceCode 光子用户主键
     * @return 结果
     */
    @Override
    public int deleteGzUserByDeviceCode(String deviceCode)
    {
        return gzUserMapper.deleteGzUserByDeviceCode(deviceCode);
    }
}
