package com.metamagic.ms.service.read;

import java.util.List;

import com.metamagic.ms.entity.OrderDocument;

/**
 * @author sagar
 *
 */
public interface OrderReadService {
	public List<OrderDocument> findAll();
}
