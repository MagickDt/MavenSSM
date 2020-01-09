package com.dongtao.dao;

import com.dongtao.domain.Items;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 40293 on 2020/1/7.
 */

@Mapper()
public interface ItemsDao {

   Items findItemsById(Integer i);
}
