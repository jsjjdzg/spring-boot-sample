package org.springboot.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({HelloControllerTest.class,StudentControllerTest.class, ParameterTest.class})
public class SuiteTest {

}
