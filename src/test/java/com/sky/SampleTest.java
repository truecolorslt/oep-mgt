package com.sky;

import com.sky.entity.Function;
import com.sky.mapper.FunctionMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: lantian
 * @Date: 2019/1/11
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    private FunctionMapper functionMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Function> functionList = functionMapper.selectList(null);
        System.out.println("functionList.size:" + functionList.size());
        Assert.assertEquals(0, functionList.size());
        functionList.forEach(System.out::println);
    }
}
