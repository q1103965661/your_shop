package com.qf.mapper;


import com.qf.dto.AddressInfoDto;
import com.qf.dto.CategoryDto;
import com.qf.dto.CreateOrderDto;
import com.qf.dto.GodsInfoDetail;
import com.qf.pojo.AddressInfo;
import com.qf.pojo.GoodsInfo;

import java.util.List;

public interface CategoryMapper {

    /**
     * 商品分类
     * @return
     */
    public List<CategoryDto> categoryList();

    public List<CategoryDto> categoryListOne();

    GodsInfoDetail getGoodsInfoById(int g_id);

    AddressInfoDto searchAddress(int adsId);

    int insertOrder(AddressInfoDto addressInfoDto);
}
