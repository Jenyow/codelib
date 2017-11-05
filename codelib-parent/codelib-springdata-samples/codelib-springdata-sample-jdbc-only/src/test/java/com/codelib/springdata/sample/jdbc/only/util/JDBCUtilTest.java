package com.codelib.springdata.sample.jdbc.only.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

public class JDBCUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetConnection() throws Exception {
        Connection connection = JDBCUtil.getConnection();
        assertNotNull(connection);
    }

    @Test
    public void testRelease() {
        fail("Not yet implemented");
    }

}
