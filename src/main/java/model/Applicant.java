/**
 * Yusef Islaih
 * 991515277
 * Multi-Tier Programming 1
 * Prof. Sun
 * January 30 2020
 * Assignment 1
 * 
 * This class hold the applicants attributes along with the method needed to calculate their score
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yusefislaih
 */
public class Applicant {

    private String name;
    private String email;
    private String iq;
    private String beverage;
    private ArrayList<String> superPower;
    private int score;

    public Applicant() {
    }

    public Applicant(String name, String email, String iq, String beverage, ArrayList<String> superPower, int score) {
        this.name = name;
        this.email = email;
        this.iq = iq;
        this.beverage = beverage;
        this.superPower = superPower;
        this.score = getScore();
    }

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

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public ArrayList<String> getSuperPower() {
        return superPower;
    }

    public void setSuperPower(ArrayList<String> superPower) {
        this.superPower = superPower;
    }

    //totalling scores from givin applicant qualities/attributes
    public int getScore() {
        score = 0;
        if (iq.equals("Less Than 120")) {
            score += 15;
        } else if (iq.equals("121 to 150")) {
            score += 30;
        } else if (iq.equals("151 to 180")) {
            score += 45;
        } else if (iq.equals("Greater Than 180")) {
            score += 60;
        }

        if (beverage.equals("Water")) {
            score += 25;
        } else if (beverage.equals("Juice")) {
            score += 20;
        } else if (beverage.equals("Cola")) {
            score += 15;
        } else if (beverage.equals("Beer")) {
            score += 10;
        } else if (beverage.equals("Wine")) {
            score += 5;
        }

        for (String s : superPower) {
            score += 5;
        }

        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Applicant{" + "name=" + name + ", email=" + email + ", iq=" + iq + ", beverage=" + beverage + ", superPower=" + superPower + ", score=" + score + ", passOrFail=";
    }

}
