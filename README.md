# Bus Reservation Application

> Spring으로 구현한 버스 예약 시스템

## 프로젝트 구조 설명

**Spring MVC**
- Controller
  - JSP에서 온 요청들을 처리
- Service
  - Controller 안에서의 실행해야되는 실질적인 비즈니스 로직
- Mapper
  - SqlSession을 통한 데이터베이스 접근 함수 사용
  
**MyBatis**
- 실질적인 데이터베이스 접근자
- Mapper에서 호출을 하여, 데이터베이스에 검색, 갱신, 삽입, 삭제 쿼리를 실행

**Maven 프로젝트**
- 의존성 주입을 모두 pom.xml에서 관리
- bean 생성과 context 설정 파일들을 모두 xml 형태로 생성하여 관리
  
## 모델 설명

**회원(Member)**
- 고객, 관리자, 운전기사로 분류

**타임 테이블(TimeTable)**
- 버스의 번호와 출발시간, 도착시간으로 구성된 시간표

**버스(Bus)**
- 버스번호, 남은좌석, 주행거리로 구성된 버스정보

**구간(Section)**
- 출발지와 도착지 경로

**예약(Appointment)**
- 선택한 시간과 구간에 대한 버스 예약
