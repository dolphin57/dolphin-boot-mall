package io.dolphin.mall.service;

import io.dolphin.mall.domain.UmsAdmin;
import io.dolphin.mall.domain.UmsAdminParam;

/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

}
