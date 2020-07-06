package com.qst.serviceimp;

import com.qst.service.IGengerateService;

public class WordService implements IGengerateService {
    @Override
    public void generate() {
        System.out.println("打印到word");
    }
}
