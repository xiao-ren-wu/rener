package com.rener.portal.model.utils;

import java.util.UUID;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/26
 * @Time:11:16
 * @JDK versions: 1.8.0_101
 */
public class ReturnUUID {

    public static String getUUID(int machineId) {
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {
            hashCodeV = -hashCodeV;
        }
        return machineId + String.format("%015d", hashCodeV);
    }
}
