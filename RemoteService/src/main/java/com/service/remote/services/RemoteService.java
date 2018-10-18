package com.service.remote.services;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RemoteService {

	Logger logger = LoggerFactory.getLogger(RemoteService.class);

	@Async("asyncExecutor")
	public CompletableFuture<String> getResponseAfter10Seconds(String name) throws InterruptedException {
		logger.debug("Into Service Method : " + Thread.currentThread().getName() + " - String Value - " + name);

		Thread.sleep(10 * 1000);
		return CompletableFuture.completedFuture(name);
	}

}