package org.lecture.lecture16.demo.demo03.app.service;

public interface IOService {
    void outputString(String message);
    void outputString(String template, Object ...args);
    String inputString();
}
