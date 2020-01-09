package com.dongtao.controller;

import com.dongtao.domain.Items;
import com.dongtao.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 40293 on 2020/1/7.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetilById(Model model) {
        Items items = itemsService.findItemsById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
