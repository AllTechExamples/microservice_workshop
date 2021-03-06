package com.metamagic.ms.service.read;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.metamagic.ms.aop.LoginInfoHelperBean;
import com.metamagic.ms.entity.OrderDocument;
import com.metamagic.ms.repository.read.OrderReadRepository;

/**
 * @author sagar
 * THIS ORDERSERVICE ISED FOR READ OPERATION OF ORDER
 */
@Service
@Scope("request")
public class OrderReadServiceImpl implements OrderReadService {

	@Autowired
	private OrderReadRepository orderReadRepository;

	@Autowired
	private LoginInfoHelperBean loginInfoHelperBean;

	public List<OrderDocument> findAll() {
		List<OrderDocument> ordersList = orderReadRepository.findAll(loginInfoHelperBean.getUserId());
		return ordersList;
	}
}
