package com.mc.domain;

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
@AllArgsConstructor//有参数构造器
@NoArgsConstructor //需要添加无参构造器
@Entity//实体类的标注
@Table(name = "guest")
public class Guest implements Serializable {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String role;
}
