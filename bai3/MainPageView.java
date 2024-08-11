package org.example.ontap.baitapvenha.day11.collectionmap.bai3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPageView {
    public static void main(String[] args) {
        Map<String, List<PageView>> maps = new HashMap<>();
        String user1 = "User 1";
        String user2 = "User 2";
        String user3 = "User 3";
        String user4 = "User 4";

        List<PageView> pageViewsU1 = new ArrayList<>();
        PageView pageView1 = new PageView(1, "abc.com.vn", LocalDateTime.now().minusHours(1));
        PageView pageView2 = new PageView(2, "abc.com.vn", LocalDateTime.now().minusHours(2));
        pageViewsU1.add(pageView1);
        pageViewsU1.add(pageView2);

        List<PageView> pageViewsU2 = new ArrayList<>();
        PageView pageView3 = new PageView(3, "abc.com.vn", LocalDateTime.now().minusHours(3));
        PageView pageView4 = new PageView(4, "abc.com.vn", LocalDateTime.now().minusHours(4));
        pageViewsU2.add(pageView3);
        pageViewsU2.add(pageView4);

        List<PageView> pageViewsU3 = new ArrayList<>();
        PageView pageView5 = new PageView(5, "abc.com.vn", LocalDateTime.now().minusHours(5));
        pageViewsU3.add(pageView5);

        List<PageView> pageViewsU4 = new ArrayList<>();
        PageView pageView6 = new PageView(6, "abc.com.vn", LocalDateTime.now().minusHours(6));
        pageViewsU4.add(pageView6);

        maps.put(user1, pageViewsU1);
        maps.put(user2, pageViewsU2);
        maps.put(user3, pageViewsU3);
        maps.put(user4, pageViewsU4);
        for (Map.Entry<String, List<PageView>> entry : maps.entrySet()) {
            for (PageView pageView : entry.getValue()) {
                System.out.println(entry.getKey() + ": " + pageView);
            }
        }
        System.out.println("---------------------------------------------------------");
        String userId = "User 3";
        for (Map.Entry<String, List<PageView>> entry : maps.entrySet()) {
            if (entry.getKey().equals(userId)) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("---------------------------------------------------------");
        LocalDateTime dateTime = LocalDateTime.now().minusHours(6);
        for (Map.Entry<String, List<PageView>> entry : maps.entrySet()) {
            if (entry.getKey().equals(dateTime)) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
