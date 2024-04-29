package com.hixtrip.sample.app.service;

import com.hixtrip.sample.app.api.OrderService;
import com.hixtrip.sample.client.order.dto.CommandOderCreateDTO;
import com.hixtrip.sample.domain.order.OrderDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * app层负责处理request请求，调用领域服务
 */
@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDomainService orderDomainService;
    /**
     * 登录接口
     * @param commandOderCreateDTO
     * @return
     */
    @Override
    public String userLogin(CommandOderCreateDTO commandOderCreateDTO) {

        return orderDomainService.userLogin(commandOderCreateDTO);
    }
}
