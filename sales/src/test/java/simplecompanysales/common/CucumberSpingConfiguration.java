package simplecompanysales.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import simplecompanysales.SalesApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SalesApplication.class })
public class CucumberSpingConfiguration {}
