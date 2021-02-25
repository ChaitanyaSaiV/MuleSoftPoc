package com.sfdc.it.ei.mule4.sync.util;

import java.util.concurrent.atomic.AtomicInteger;

public class PartNumberUtil {
	
	static AtomicInteger partNumber = new AtomicInteger(1);
	
	public static int generatePartNumber() {
		return partNumber.getAndIncrement();
	}

}
