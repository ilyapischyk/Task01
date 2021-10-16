package com.pischyk.task1.reader.impl;

import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.validator.impl.FileValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReaderImpl implements com.pischyk.task1.reader.DataReader {
    private static final Logger logger = LogManager.getLogger();

    public ArrayList<String> readFile(String path) throws ArrayLenghtException {
        logger.info("Reading file");
        File file = new File(path);
        FileValidatorImpl fileValidate = new FileValidatorImpl();
        if (!fileValidate.isValid(file)) {
            throw new ArrayLenghtException("File is not exist or is empty");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)) {
            logger.info("Connection with file successful");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new ArrayLenghtException("File not found", e);
        }
        return arrayList;
    }
}
