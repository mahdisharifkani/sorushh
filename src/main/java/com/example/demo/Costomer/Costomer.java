package com.example.demo.Costomer;

public class Costomer {
    private Long id;
    private String name;
    private String phonenumber;
    private String start;
    private String end;

    public Costomer() {
    }

    public Costomer(Long id,
                    String name,
                    String phonenumber,
                    String start,
                    String end) {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.start = start;
        this.end = end;
    }

    public Costomer(String name, String phonenumber, String start, String end) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.start = start;
        this.end = end;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Costomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
