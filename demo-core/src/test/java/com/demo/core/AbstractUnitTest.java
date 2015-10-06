package com.demo.core;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends AbstractTransactionalDataSourceSpringContextTests {

    @Override
    protected String[] getConfigLocations() {
        setPopulateProtectedVariables(true);
        setAutowireMode(AUTOWIRE_BY_TYPE);
        return new String[] {
                "com/demo/core/config/applicationContext-config.xml",
                "com/demo/core/config/applicationContext-dao.xml"
                };
    }

    public void testApp() {
        assertTrue(true);
    }

}
