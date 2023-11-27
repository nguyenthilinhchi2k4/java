// News.java
package m;

import java.util.Scanner;

class News implements INews {
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int[] RateList;

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public void Calculate() {
        if (RateList != null && RateList.length > 0) {
            float sum = 0;
            for (int rate : RateList) {
                sum += rate;
            }
            AverageRate = sum / RateList.length;
        } else {
            AverageRate = 0;
        }
    }

    public void InputRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng đánh giá: ");
        int numRates = scanner.nextInt();
        RateList = new int[numRates];
        for (int i = 0; i < numRates; i++) {
            int rate;
            do {
                System.out.print("Nhập đánh giá " + (i + 1) + " (1-5): ");
                rate = scanner.nextInt();
            } while (rate < 1 || rate > 5);
            RateList[i] = rate;
        }
        Calculate();
    }

    @Override
    public void Display() {
        System.out.println("Tiêu đề: " + Title);
        System.out.println("Ngày xuất bản: " + PublishDate);
        System.out.println("Tác giả: " + Author);
        System.out.println("Nội dung: " + Content);
        System.out.println("Đánh giá trung bình: " + AverageRate);
    }
}