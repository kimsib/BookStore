# Portfolio_BookStoreWeb
미니 쇼핑몰 개인 프로젝트입니다.</br></br>
![ezgif com-video-to-gif (1)](https://github.com/kimsib/bookstore/assets/87972038/4a2f9817-6f62-4d93-aa8a-2d64d578ee49) </br></br>
[시연영상](https://youtu.be/tKdjnVuh55o)
# 프로젝트 개발 환경
1. 운영체제 : Window10
2. 통합개발환경(IDE) : Eclipse
3. JDK 버전 : JDK 11
4. 스프링 부트 버전 : 2.5.5
5. 데이터 베이스 : MySQL
6. 빌드 툴 : Maven
7. 관리 툴 : Git, GitHub

# 사용 기술스택
- 프론트엔드</br>
HTML, CSS, JS, BootStrap, Thymeleaf</br></br>
- 백엔드</br>
Spring Boot, Spring Security, Spring Data JPA</br></br>
- 데이터베이스</br>
Hibernate, MySQL

# 구현 기능
+ 회원(Member)
  + 회원가입/ 로그인 및 로그아웃

+ 상품(Item)
  + 상품 등록 / 상품 관리 / 상품 수정 / 상품조회(메인화면) / 상품 상세 페이지

+ 주문(Order)
  + 상품 주문 / 구매 이력 조회 / 주문 취소

+ 장바구니(Cart)
  + 장바구니 담기/ 장바구니 조회 / 장바구니 삭제 / 장바구니 상품 주문
 
# 이미지
+ 메인 페이지
  + 상품 목록
  + 상품 조회 가능</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/b7dc4191-6550-400f-9284-54d751438c73)
</br></br></br>
 
+ 회원가입
  + 아이디 중복검사
  + 프론트, 서버 모두 유효성 검사</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/468de1a2-90e8-464b-b194-32a6d9061a65)
</br></br></br>

+ 로그인
  + 프론트, 서버 모두 유효성 검사</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/a2b90417-5fea-472a-a109-9e298882747d)
</br></br></br>

+ 상품 상세페이지
  + 수량변경 
  + 장바구니 추가
  + 주문하기</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/acb09247-f74d-4f4b-a14a-928898fd2228)
</br></br></br>

+ 장바구니
  + 개별 혹은 선택주문
  + 수량변경, 삭제 가능
  + 주문하기</br></br>
![화면 캡처 2023-05-12 172206](https://github.com/kimsib/bookstore/assets/87972038/de2c6f7c-7fbf-4a20-8aff-482951b0a872)
</br></br></br>
    
+ 구매 이력
  + 주문한 상품에 대한 기본정보들
  + 주문 취소</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/57f4e897-80ff-4a89-8aab-46a4a7dc3b1c)
</br></br></br>

+ 주문
  + 비동기 통신 방법인 Ajax를 이용하여 주문 요청 및 응답
  + 상품 주문</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/c30e563e-b29b-4ed9-9e7f-96b834132d03)

</br></br></br>

+ 관리자 페이지 상품 등록
  + 상품 등록 및 상품 수정
  + 입력 값 검증 및 에러 메시지 표시</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/6ec1a752-8839-482e-89b8-d55d63d07d38)
</br></br></br>

+ 관리자 페이지 상품 관리
  + 상품 동적 조회
  + 상품 수정</br></br>
![image](https://github.com/kimsib/bookstore/assets/87972038/185203c5-4bbb-4e29-8446-a1dd925205fd)
![화면 캡처 2023-05-12 175346](https://github.com/kimsib/bookstore/assets/87972038/83cef160-bf8b-471f-9398-99f2d4965049)
</br></br></br>

# 프로젝트 DB 모델링
 ![bookstore erd 2](https://github.com/kimsib/bookstore/assets/87972038/ad6383aa-8f3b-4296-b419-c4d1caa54618)
</br>
+ member - 쇼핑몰 회원 정보 테이블
+ cart - 회원의 장바구니 목록 테이블
+ cart_item - 장바구니에 담긴 상품 정보 테이블
+ orders - 쇼핑몰 회원들의 주문 목록 테이블
+ order_item - 주문된 상품 정보 테이블
+ item - 쇼핑몰 상품 정보 테이블
+ item_img - 상품에 대한 이미지 정보를 담고 있는 테이블
</br></br></br>

# 프로젝트 API 명세서
 ![화면 캡처 2023-06-07 155213](https://github.com/kimsib/bookstore/assets/87972038/7e789bff-44c1-47ee-a347-6d9fb141c84c)
























