package com.gbi.alipayapi.service.impl;

import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.gbi.alipayapi.config.AlipayApiConfig;
import com.gbi.alipayapi.service.AlipayTransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 支付宝开放平台交易服务类
 *
 * @author Lwy
 * @since 2023/11/14
 */
@Slf4j
@RequiredArgsConstructor
public class AlipayTransactionServiceImpl implements AlipayTransactionService {

    @Override
    public AlipayTradeAppPayResponse appPay(AlipayTradeAppPayRequest payRequest, AlipayApiConfig payConfig) {
        return null;
    }
}
