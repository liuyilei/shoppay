package com.fourkmiles.pojo;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: liuyilei
 * @create: 2019-10-24 10:18
 **/
@Data
public class Student {
    private int age;
    private String name;
    private List<Student> students;
}
