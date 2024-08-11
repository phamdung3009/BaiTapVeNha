package org.example.ontap.baitapvenha.day11.collectionmap.bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //1. Sử dụng Map<Product, StockInfo> để lưu trữ thông tin kho hàng. Thêm sản phẩm vào kho.
        Map<Product, StockInfo> maps = new HashMap<>();
        Product myPham = new Product(1, "Dau Goi Dau", "My Pham");
        Product thoiTrang = new Product(2, "Quan Ao", "Thoi Trang");
        Product giaDung = new Product(3, "Dieu Hoa", "Gia Dung");

        StockInfo st1 = new StockInfo(10, 20000);
        StockInfo st2 = new StockInfo(11, 30000);
        StockInfo st3 = new StockInfo(12, 40000);
        maps.put(myPham, st1);
        maps.put(thoiTrang, st2);
        maps.put(giaDung, st3);
        for (Product p : maps.keySet()) {
            StockInfo stockInfo = maps.get(p);
            System.out.println(p + " " + stockInfo);
        }
        System.out.println("--------------------------------------------");
        //2. Cập nhật số lượng và giá của một sản phẩm theo productId.
        int id = 1;
        for (Product p : maps.keySet()) {
            if (p.getProductId() == id) {
                StockInfo stockInfo = maps.get(p);
                System.out.println("Luc chua cap nhat " + p + " " + stockInfo);
                stockInfo.setPrice(50000);
                stockInfo.setQuantity(30);
                maps.put(p, stockInfo);
                System.out.println("Sau cap nhat " + p + " " + stockInfo);
            }

        }
        System.out.println("--------------------------------------------");
        //3. Tìm kiếm và hiển thị thông tin của một sản phẩm theo productId.
        int findId = 3;
        for (Product p : maps.keySet()) {
            if (p.getProductId() == findId) {
                System.out.println("ID " + findId + " ban dang can tim là:  " + p + " " + maps.get(p));
            }
        }
        System.out.println("--------------------------------------------");
        //4. Hiển thị danh sách tất cả sản phẩm trong một danh mục cho trước.
        String category = "Thoi Trang";
        for (Product p : maps.keySet()) {
            if(p.getCategory().equals(category)) {
                System.out.println(p + " " + maps.get(p));
            }
        }
        System.out.println("--------------------------------------------");
        //5. Tính và hiển thị tổng giá trị của tất cả sản phẩm trong kho.
        List<StockInfo> stockInfos = new ArrayList<>();;
        stockInfos.addAll(maps.values());
        double count = 0;
        for(StockInfo stockInfo : stockInfos) {
            count += stockInfo.getPrice();
        }
        System.out.println(count);
    }
}
