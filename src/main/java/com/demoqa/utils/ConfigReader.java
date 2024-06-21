package com.demoqa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    private ConfigReader() {
        // Singleton pattern ->одиночный шаблон
    }

    static { // статичный блок -> внутри этого блока всё становится статичными
        try {
            String path = "src/main/resources/app.properties";
            FileInputStream fileInputStream = new FileInputStream(path); // fileinputstream -> класс получающий доступ к определенному файлу и получаюзший все данные жтого файла
            properties = new Properties();
            properties.load(fileInputStream);
fileInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("ftw");
        } catch (IOException e) { // IOException -> ошибка входных  и выходных данных
            throw new RuntimeException("wtf");
        }

    }
    public static String getValue (String key){
        return properties.getProperty(key).trim();  //trim() используется для удаления пробелов
    }

    public static void main(String[] args) {
        System.out.println(getValue("browser"));
        System.out.println(getValue("userName"));
        System.out.println(getValue("password"));
    }
}
