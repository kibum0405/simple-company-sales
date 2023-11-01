package simplecompanysales.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import simplecompanysales.BoundedContext1575Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1575Application.class })
public class CucumberSpingConfiguration {}
