package _20_OOP.book;

import java.util.Scanner;

// 서버: 데이터를 운송(서빙)하는 것
// Main의 역할 = 사용자 UI(프론트앤드) + 컨트롤러(백엔드): 사용자의 입/출력, 프로그램 흐름만 제어
// 세부로직은 Service에 구현, DB 접근은 Repository에 구현
// 데이터의 흐름:
// 사용자 UI(프론트앤드) -> 컨트롤러 -> 서비스 -> 레파지토리 -> DB
// Layer 아키텍쳐
public class BookMain {
    public static void main(String[] args) {
        // Book객체는 어떻게 저장이 되는가?
        // BookMain의 main 메서드에서 생성 -> booksService -> bookRepository의 배열에 저장

        // 사용자 입력을 받아줄 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 서비스에 필요한 객체들을 모두 생성
        // 책정보 저장할 배열
        Book[] books = new Book[5]; // 숫자를 바꾸면 저장공간이 바뀜
        // bookRepository가 books를 알게됨
        BookRepository bookRepository = new BookRepository(books);
        // bookService가 bookRepository를 알게됨
        BookService bookService = new BookService(bookRepository);


        while (true) {
            System.out.println("-- 도서관리 시스템--");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴선택 >>");
            // 1~2 혹은 q 입력
            String selectMenu = sc.nextLine();

            if ("1".equals(selectMenu)) { // 도서등록
                // 객체로 포장해서 입력
                String title;
                String author;

                // 비어있는게 없다면
                if (!bookService.isEmpty()) {
                    System.out.println("등록불가: 공간없음");
                    continue;
                }

                // 사용자로부터 입력을 받음
                System.out.println("책 제목 입력 >");
                title = sc.nextLine();
                System.out.println("책 저자 입력 >");
                author = sc.nextLine();

                // 파편화된 데이터들을 객체로 포장
                Book book = new Book(title, author);
                bookService.append(book);

            } else if ("2".equals(selectMenu)) { // 전체도서 조회
                bookService.printRegisteredBooks();
            } else if ("q".equals(selectMenu)) { // 종료
                System.out.println("프로그램 종료");
                break;
            } else { // 나머지 입력
                System.out.println("잘못 입력 하셨습니다.");
            }


        }
    }
}
