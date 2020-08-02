package ru.job4j.inheritance;

import ru.job4j.inheritance.ru.job4j.inheritance.TextReport;

      public class JSONReport extends TextReport {
            @Override
            public String generate(String name, String body) {
                return "{ " + System.lineSeparator() + " " + name + "  " + ":" + " " + "\"name\"" + "," + System.lineSeparator() +
                        " " + body + " " + ":" + "  "  + "\"body\"" + System.lineSeparator() + "}";
            }
        }
