package com.example.apihubclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * Sign tool
 */
public class SignUtils {
	/**
	 * generate Signature
	 * @param body
	 * @param secretKey
	 * @return
	 */
	public static String genSign(String body, String secretKey){
		Digester md5 = new Digester(DigestAlgorithm.SHA256);
		String content = body + "." + secretKey;
		String digestHex = md5.digestHex(content);
		return digestHex;
	}
}
