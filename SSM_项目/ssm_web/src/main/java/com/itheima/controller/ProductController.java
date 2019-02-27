package com.itheima.controller;

import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HaoJun on 2019/2/22 11:42
 *
 * @author:豪俊
 * @version:V1.0 “生于忧患，死于安乐。”
 * @Description:
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
}
