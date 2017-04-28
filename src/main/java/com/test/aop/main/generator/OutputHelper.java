package com.test.aop.main.generator;

import com.test.aop.main.inter.IOutputGenerator;

/**
 * Created by root on 2017/4/28.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput() {
        this.outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}