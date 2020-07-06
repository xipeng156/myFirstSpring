package com.qst.serviceimp;

import com.qst.service.IGengerateService;

public class ExcelService implements IGengerateService {

    @Override
    public void generate() {
        System.out.println("将数据导出到excel中！");
    }
}
