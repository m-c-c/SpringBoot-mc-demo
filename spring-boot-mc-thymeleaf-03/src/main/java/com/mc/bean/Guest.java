package com.mc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 嘉宾类
 */
@Data @AllArgsConstructor
public class Guest {
    private String name;
    private String role;
}
