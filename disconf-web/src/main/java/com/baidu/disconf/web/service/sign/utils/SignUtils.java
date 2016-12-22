package com.baidu.disconf.web.service.sign.utils;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

@SuppressWarnings("deprecation")
public class SignUtils {
	
	/**
	 * 密码为:8338f82cbd01051fc14a0f0962ebc1848adaf47b
	 * Token为:3d86cc6a444504e52adb462a8e39c28937676afc
	 * @param args
	 */
	public static void main(String[] args) {
		String userName="liubao";
		String password="liubao";
		System.out.println("密码为:"+createPassword(password));
		System.out.println("Token为:"+createToken(userName));
	}

    /**
     * 生成密码， 使用shaHex加密
     */
	public static String createPassword(String password) {
        String data = DigestUtils.shaHex(password);
        return data;
    }

    /**
     * 生成token ,使用 UUID + 手机生成
     */
    public static String createToken(String phone) {
        String uuid = UUID.randomUUID().toString();
        String data = DigestUtils.shaHex(uuid + phone);
        return data;
    }
}
