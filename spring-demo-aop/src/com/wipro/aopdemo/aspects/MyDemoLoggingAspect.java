package com.wipro.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//point cut expression
	@Before("execution(public void com.wipro.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n\n############## Executing the @Before advice on addAccount() ##############\n\n");
	}
	
}
