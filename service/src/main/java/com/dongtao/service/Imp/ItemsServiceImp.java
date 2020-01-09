package com.dongtao.service.Imp;


import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.dongtao.dao.ItemsDao;
import com.dongtao.domain.Items;
import com.dongtao.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by 40293 on 2020/1/7.
 */
@Service
public class ItemsServiceImp implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    public Items findItemsById(Integer id) {
        return itemsDao.findItemsById(id);
    }
}



