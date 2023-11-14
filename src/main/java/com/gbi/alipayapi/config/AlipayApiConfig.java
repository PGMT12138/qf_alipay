package com.gbi.alipayapi.config;

import com.alibaba.fastjson2.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * 支付宝开放平台相关配置
 *
 * @author Lwy
 * @since 2023/11/14
 */
@Data
public class AlipayApiConfig implements Serializable {

    /**
     * 支付宝开放平台接口地址
     */
    private String serverUrl;

    /**
     * 应用id
     */
    private String appId;

    /**
     * 用户私钥
     */
    private String privateKey;

    /**
     * 报文格式，仅支持JSON
     */
    private String format = "json";

    /**
     * 请求使用的编码格式，如utf-8,gbk,gb2312等
     * 默认utf-8
     */
    private String charset = "utf-8";

    /**
     * 支付宝商户公钥
     */
    private String alipayPublicKey;

    /**
     * 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
     */
    private String signType;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
