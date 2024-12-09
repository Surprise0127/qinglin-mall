package com.xykd.qinglinmallproduct;

import com.xykd.qinglinmallproduct.dao.AttrDao;
import com.xykd.qinglinmallproduct.entity.AttrEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class QinglinMallProductApplicationTests {

    @Resource
    private AttrDao attrDao;

    @Test
    void contextLoads() {
        AttrEntity attrEntity = new AttrEntity();
        attrEntity.setAttrName("test");
        attrDao.insert(attrEntity);
    }

}
