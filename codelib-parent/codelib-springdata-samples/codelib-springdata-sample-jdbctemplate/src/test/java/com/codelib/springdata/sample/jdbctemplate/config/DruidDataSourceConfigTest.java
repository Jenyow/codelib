package com.codelib.springdata.sample.jdbctemplate.config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.pool.DruidDataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={DruidDataSourceConfig.class})
// 需要加事务，防止各用例间相互影响
@Transactional
public class DruidDataSourceConfigTest {

    @Autowired
    private DruidDataSource dataSource;
    
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testDataSource() {
       assertNotNull(dataSource);
    }

}
