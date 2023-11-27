// Main.java
package m;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tiêu đề tin tức: ");
        String title = scanner.nextLine();
        news.setTitle(title);

        System.out.print("Ngày xuất bản: ");
        String publishDate = scanner.nextLine();
        news.setPublishDate(publishDate);

        System.out.print("Tác giả: ");
        String author = scanner.nextLine();
        news.setAuthor(author);

        System.out.print("Nội dung: ");
        String content = scanner.nextLine();
        news.setContent(content);

        news.InputRate();

        news.Display();
    }
}