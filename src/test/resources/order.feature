@smokeTest
Feature: I want to test Memebox member
  Scenario: login to memebox home
    Given user open URL "http://www.memebox.com/"
    When user click to login page
    When user put the id and pw "testym141@memebox.com","123qwe"
    Then login result page contains "로그아웃"

    //로그인
    //메인 상품 클릭
    //1-1 첫번째 아이템 장바구니 담기
    //1-2 장바구니 체크 후 결제하기 버튼
    //1-3 주문페이지 체크 후 무통장 결제
    //1-4 결제완료 페이지 체크
    //1-5 마이페이지 주문목록 > 주문취소
    //2-1 첫번째 아이템 즉시구매 버튼
    //2-2 주문페이지 체크 후 무통장 결제
    //2-3 결제완료 페이지 체크
    //2-4 주문취소

    //아이템이 단품일 경우, 복수일 경우, 품절일 경우에 대한 예외처리 필요