package com.listron.utils;

import org.junit.Test;

import java.util.UUID;

public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }

    @Test
    public void test(){
        System.out.print(IDUtils.getId());
    }
}
