package com.qst.serviceimp;

import com.qst.service.IGengerateService;

public class PDFService implements IGengerateService {
    @Override
    public void generate() {
        System.out.println("数据导出到PDF中");
    }
}
