package com.qst.servlet;

import com.qst.service.IGengerateService;
import com.qst.serviceimp.WordService;
import com.qst.utils.BeanFactory;

public class MainServlet {
    public static void main(String[] args) {
//        IGengerateService iGengerateService = new WordService();
//        iGengerateService.generate();
//        BeanFactory.getBeans("generateService");
//        Object beans = BeanFactory.getBeans("generateService");
//        System.out.println(beans);

        IGengerateService service = (IGengerateService) BeanFactory.getBeans("generateService");
        service.generate();
    }
}
