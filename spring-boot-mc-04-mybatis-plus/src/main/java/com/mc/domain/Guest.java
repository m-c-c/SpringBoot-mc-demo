package com.mc.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 嘉宾类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor //需要添加无参构造器
public class Guest implements Serializable {


    private Long id;

    private String name;

    private String role;
}
