package com.pischyk.task1.validator.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileValidatorImpl implements com.pischyk.task1.validator.FileValidator {
    final static Logger logger = LogManager.getLogger();

    @Override
    public boolean isValid(File file) {
        logger.info("Validating file");
        if (file.exists() && file.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
