package com.itheima.service.impl;

import com.itheima.service.ProductService;
import com.itheima.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HaoJun on 2019/2/22 11:38
 *
 * @author:豪俊
 * @version:V1.0 “生于忧患，死于安乐。”
 * @Description:
 */

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
}
