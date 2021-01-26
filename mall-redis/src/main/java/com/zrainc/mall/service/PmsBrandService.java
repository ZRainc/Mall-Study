package com.zrainc.mall.service;

import com.zrainc.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuchen Zhang
 * Date: 2021/1/26
 * Time: 10:47
 * Description: No Description
 */

public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
