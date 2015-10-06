package com.demo.service.config;

import org.junit.runner.RunWith;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



public class AbstractUnitTest extends AbstractTransactionalDataSourceSpringContextTests {

    @Override
    protected String[] getConfigLocations() {
        setPopulateProtectedVariables(true);
        setAutowireMode(AUTOWIRE_BY_TYPE);
        return new String[] {
                "com/demo/core/config/applicationContext-config.xml",
                "com/demo/core/config/applicationContext-dao.xml",
                "com/demo/service/config/applicationContext-service.xml"
                };
    }

    public void testApp() {
        assertTrue(true);
    }

}
