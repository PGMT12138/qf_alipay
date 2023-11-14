package com.gbi.alipayapi.service;

import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.gbi.alipayapi.config.AlipayApiConfig;

/**
 * 支付宝开放平台交易服务接口
 *
 * @author Lwy
 * @since 2023/11/14
 */
public interface AlipayTransactionService {

    /**
     * app支付2.0
     *
     * @param payRequest 支付请求对象
     * @param payConfig  商户支付配置
     * @return 支付响应对象
     */
    AlipayTradeAppPayResponse appPay(AlipayTradeAppPayRequest payRequest, AlipayApiConfig payConfig);
}
