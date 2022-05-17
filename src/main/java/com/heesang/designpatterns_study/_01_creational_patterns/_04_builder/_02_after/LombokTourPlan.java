package com.heesang.designpatterns_study._01_creational_patterns._04_builder._02_after;

import com.heesang.designpatterns_study._01_creational_patterns._04_builder._01_before.DetailPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LombokTourPlan {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    private LombokTourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetailPlan> plans) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }

    public static LombokTourPlanBuilder builder() {
        return new LombokTourPlanBuilder();
    }

    public static class LombokTourPlanBuilder {

        private String title;

        private int nights;

        private int days;

        private LocalDate startDate;

        private String whereToStay;

        private List<DetailPlan> plans;

        private LombokTourPlanBuilder() {
        }

        public LombokTourPlanBuilder nightsAndDays(int nights, int days) {
            this.nights = nights;
            this.days = days;
            return this;
        }

        public LombokTourPlanBuilder title(String title) {
            this.title = title;
            return this;
        }

        public LombokTourPlanBuilder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public LombokTourPlanBuilder whereToStay(String whereToStay) {
            this.whereToStay = whereToStay;
            return this;
        }

        public LombokTourPlanBuilder addPlan(int day, String plan) {
            if (this.plans == null) {
                this.plans = new ArrayList<>();
            }

            this.plans.add(new DetailPlan(day, plan));
            return this;
        }

        public LombokTourPlan build() {
            return new LombokTourPlan(title, nights, days, startDate, whereToStay, plans);
        }
    }


    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title + '\'' +
                ", nights=" + nights +
                ", days=" + days +
                ", startDate=" + startDate +
                ", whereToStay='" + whereToStay + '\'' +
                ", plans=" + plans +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getWhereToStay() {
        return whereToStay;
    }

    public void setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
    }

    public List<DetailPlan> getPlans() {
        return plans;
    }

    public void setPlans(List<DetailPlan> plans) {
        this.plans = plans;
    }

    public void addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
    }
}
