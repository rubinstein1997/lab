package com.wxc.edu.lab.domain;


public class Teacher extends User {

        private String id;

        private String name;

        private String passwd;

        private String college;

        private Long telephone;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPasswd() {
            return passwd;
        }

        public void setPasswd(String passwd) {
            this.passwd = passwd;
        }

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }

        public Long getTelephone() {
            return telephone;
        }

        public void setTelephone(Long telephone) {
            this.telephone = telephone;
        }
    }

