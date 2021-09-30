package com.pischyk.task1.reader.impl;

import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.reader.DataReaderInterface;
import com.pischyk.task1.validator.impl.FileValidator;
import com.pischyk.task1.validator.impl.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader implements DataReaderInterface {
    final static Logger logger = LogManager.getLogger();

    @Override
    public ArrayList<String> readFile(String path) throws ArrayLenghtException {
        logger.info("Reading file");
        File file = new File(path);
        StringValidator stringValidator = new StringValidator();
        FileValidator fileValidator = new FileValidator();
        if (!fileValidator.isValid(file)){
            throw new ArrayLenghtException("File is not exist or is empty");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                if (stringValidator.isValid(scanner.nextLine())){
                    arrayList.add(scanner.nextLine());
                } else continue;
            }
        } catch (Exception e) {
            logger.error("File not found");
        }
        return arrayList;
    }
}
