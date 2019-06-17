package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao it = ac.getBean(ItemsDao.class);
        Items items = it.findById(1);
        System.out.println(items.getName());
    }
    @Test
    public void testFindById2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
