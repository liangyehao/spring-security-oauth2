package com.liang;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/11/17 22:42
 * @content
 */
public class BcyTest {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
