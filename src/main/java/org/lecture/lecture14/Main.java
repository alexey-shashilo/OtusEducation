package org.lecture.lecture14;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (ParseOktmo pars = new ParseOktmo()) {
            pars.parse("C:\\Users\\shashilo\\IdeaProjects\\OtusEducation\\src\\main\\java\\org\\lecture\\lecture14\\oktmo.json");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("какое-то исключение");
        }
    }
}
