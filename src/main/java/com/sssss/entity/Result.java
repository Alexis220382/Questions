package com.sssss.entity;

import javax.persistence.*;

@Entity
@Table(name = "result")
public class Result {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "question1", nullable = false)
    private String question1;
    @Column(name = "question2", nullable = false)
    private String question2;
    @Column(name = "question3", nullable = false)
    private String question3;
    @Column(name = "question4", nullable = false)
    private String question4;
    @Column(name = "question5", nullable = false)
    private String question5;
    @Column(name = "question6", nullable = false)
    private String question6;
    @Column(name = "question7", nullable = false)
    private String question7;
    @Column(name = "question8", nullable = false)
    private String question8;
    @Column(name = "res", nullable = false)
    private String res;

    public Result() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public void setQuestion6(String question6) {
        this.question6 = question6;
    }

    public String getQuestion7() {
        return question7;
    }

    public void setQuestion7(String question7) {
        this.question7 = question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public void setQuestion8(String question8) {
        this.question8 = question8;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
}
