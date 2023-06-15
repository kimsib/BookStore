# Portfolio_BookStoreWeb
미니 쇼핑몰 개인 프로젝트입니다.</br></br>
![ezgif com-video-to-gif](https://github.com/kimsib/BookStore/assets/87972038/56be3c2e-ec23-4918-bd83-41b17c38bb63)
</br></br>
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
![화면 캡처 2023-05-12 171502](https://github.com/kimsib/BookStore/assets/87972038/10c1cbbd-d1bd-4092-a526-6a47145b7510)
</br></br></br>
 
+ 회원가입
  + 아이디 중복검사
  + 프론트, 서버 모두 유효성 검사</br></br>
![화면 캡처 2023-05-12 171802](https://github.com/kimsib/BookStore/assets/87972038/4fb26608-555a-41c1-bad6-2aca885237da)
</br></br></br>

+ 로그인
  + 프론트, 서버 모두 유효성 검사</br></br>
![화면 캡처 2023-05-11 173910](https://github.com/kimsib/BookStore/assets/87972038/d6e850cf-8a5b-4c34-8a7f-5a19e9f4632c)
</br></br></br>

+ 상품 상세페이지
  + 수량변경 
  + 장바구니 추가
  + 주문하기</br></br>
![화면 캡처 2023-05-12 172004](https://github.com/kimsib/BookStore/assets/87972038/15f84c9c-16d2-4bcc-af5f-8416d329579d)
</br></br></br>

+ 장바구니
  + 개별 혹은 선택주문
  + 수량변경, 삭제 가능
  + 주문하기</br></br>
![화면 캡처 2023-05-12 172206](https://github.com/kimsib/BookStore/assets/87972038/fbaa1352-e534-4259-9a5d-d0afea1eba25)
</br></br></br>
    
+ 구매 이력
  + 주문한 상품에 대한 기본정보들
  + 주문 취소</br></br>
![화면 캡처 2023-05-12 172334](https://github.com/kimsib/BookStore/assets/87972038/13e89cb2-edec-45d5-88dd-6664394a2dda)
</br></br></br>

+ 주문
  + 비동기 통신 방법인 Ajax를 이용하여 주문 요청 및 응답
  + 상품 주문</br></br>
![화면 캡처 2023-05-12 173342](https://github.com/kimsib/BookStore/assets/87972038/b121a3df-990b-4346-aba1-a246177ce994)

</br></br></br>

+ 관리자 페이지 상품 등록
  + 상품 등록 및 상품 수정
  + 입력 값 검증 및 에러 메시지 표시</br></br>
![화면 캡처 2023-05-12 174723](https://github.com/kimsib/BookStore/assets/87972038/9b0fe9e9-3aa5-4d08-b03a-daa213535a89)
</br></br></br>

+ 관리자 페이지 상품 관리
  + 상품 동적 조회
  + 상품 수정</br></br>
![화면 캡처 2023-05-12 175249](https://github.com/kimsib/BookStore/assets/87972038/58593c84-f514-43b2-9c72-cf00350c11db)
![화면 캡처 2023-05-12 175346](https://github.com/kimsib/BookStore/assets/87972038/da26ccfd-346f-4640-83b4-99c8602a606d)
</br></br></br>

# 프로젝트 DB 모델링
![bookstore erd 2](https://github.com/kimsib/BookStore/assets/87972038/26219ef7-91a4-4784-aa97-6ac801a9d8a3)
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
![화면 캡처 2023-06-07 155213](https://github.com/kimsib/BookStore/assets/87972038/7af4ec6e-cc1b-4b5d-827d-2fbe1db0c4b0)
























