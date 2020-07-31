package ru.job4j.inheritance;

    class TextReport {
        public String generate(String name, String body) {
            return name + System.lineSeparator() + body;
        }



        public static class JSONReport extends TextReport {
@Override
            public String generate(String name, String body) {
                return name + " " + ":" + " " + "name" + System.lineSeparator() + body + " " + ":" + " "  + "body";
            }
        }

            public static class ReportUsage {
                public static void main(String[] args) {
                    JSONReport report = new JSONReport();
                    String text = report.generate("name", "body");
                    System.out.println(text);
                }
            }
        }
