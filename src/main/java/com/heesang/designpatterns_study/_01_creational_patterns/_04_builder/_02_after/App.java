package com.heesang.designpatterns_study._01_creational_patterns._04_builder._02_after;

import com.heesang.designpatterns_study._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = tourDirector.cancunTrip();
        TourPlan tourPlan1 = tourDirector.longBeachTrip();

        LombokTourPlan tourPlan2 = LombokTourPlan.builder()
                .title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .build();
    }
}
