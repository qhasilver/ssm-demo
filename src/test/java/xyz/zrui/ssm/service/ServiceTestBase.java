
package xyz.zrui.ssm.service;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = {"classpath:test-context.xml"})
public abstract class ServiceTestBase extends AbstractTestNGSpringContextTests {

}
