package com.mc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 嘉宾类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor //需要添加无参构造器
@Entity//实体类的标注
@Table(name = "guest")
public class Guest implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "role")
    private String role;
}
