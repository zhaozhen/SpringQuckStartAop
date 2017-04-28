package com.test.aop.main.generator;

import com.test.aop.main.inter.IOutputGenerator;

/**
 * Created by root on 2017/4/28.
 */
public class CsvOutputGenerator implements IOutputGenerator {

    public void generateOutput() {
        System.out.println("Creating CsvOutputGenerator  Output......");
    }

}