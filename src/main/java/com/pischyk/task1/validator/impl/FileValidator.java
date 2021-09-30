package com.pischyk.task1.validator.impl;

import com.pischyk.task1.validator.FileValidatorInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileValidator implements FileValidatorInterface {
    final static Logger logger = LogManager.getLogger();

    @Override
    public boolean isValid(File file) {
        logger.info("FileValidator called isValid");
        boolean flag = false;
        if (file.exists()) {
            if (file.length() > 0) {
                flag = true;
            }
        }
        return flag;
    }
}
