package com.example.study_sb.dto;

public class MemberDTO {
    private String name;
    private String email;
    private String orgar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrgar() {
        return orgar;
    }

    public void setOrgar(String orgar) {
        this.orgar = orgar;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", orgar='" + orgar + '\'' +
                '}';
    }
}
