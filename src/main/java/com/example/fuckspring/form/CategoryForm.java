package com.example.fuckspring.form;

import lombok.Data;

/**
 * @ClassName CategoryForm
 * @Author Fixed
 * @Date 2018/9/25
 **/

@Data
public class CategoryForm {

    private Integer categoryId;

    // 类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;

}
