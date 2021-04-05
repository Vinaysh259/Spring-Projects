package com.wipro.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	//We can reuse the point cut expression for multiple methods
	@Pointcut("execution(* com.wipro.aopdemo.dao.*.*(..))")
	public void forDaoPackage()	{}
	
	
	//point cut expression
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n\n############## Executing the @Before advice on addAccount() ##############\n\n");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n\n##############Doing some API analytics ##############\n\n");
	}
	
}
