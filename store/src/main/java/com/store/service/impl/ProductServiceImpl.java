package com.store.service.impl;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.repository.LocationRepository;
import com.store.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private LocationRepository locationRepo;

}
