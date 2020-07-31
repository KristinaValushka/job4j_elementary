package ru.job4j.sort;

public class Profession {

    private String name;

    private String surname;

    private String education;

    private String birthday;

    public String getName() {

    }

    public String getSurname() {

    }

    public String getEducation() {

    }

    public String getBirthday() {

    }

    public class Engineer extends Profession {
        private String occupation;

        public String getOccupation() {

        }
    }

    public class Doctor extends Profession {
        private String consultation;

        public String getConsultation() {

        }
    }

    public class Surgeon extends Doctor {

        private String heartFailure;

        public String getHeartFailure() {

        }


    }
    public class Dentist extends Doctor {
        private String toothache;

        public String getToothache() {

        }

    }

    public class Programmer extends Engineer {
        private String code;

        public String getCode() {

        }
    }

    public class Builder extends Engineer {
        private String object;

        public String getObject() {

        }

    }

}
