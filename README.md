# Focused On

### 도메인 설계와 단위 테스트.
* 요구사항에 맞는 도메인 객체 추출
* 해당 도메인 내부 필요 기능들 열거 및 테스트 주도 개발.

### 하지만, 도메인 로직에서 테스트 하기 어려운 부분들이 해당 기능의 상위 구현체의 테스트를 어렵게함.
* 랜덤 및 기타 확률에 의한 동작이 예로 들 수 있음
* 위와 같은 상황에서 테스트를 애매하게 하는 로직의 격리를 통해 보완할 수 있음.

랜덤과 같은 녀석 (실행 시 마다 변동되는)은 protected를 통해서 테스트상 특정 내용을 Override하여 각 상황에 대한 테스트를 가능하게 한다.
(혹은 상위 객체로 의존성을 넘겨라.)


### 설계 (bold는 method를 의미한다)

#### Race (Objec)
* list [Car]
* 시도 횟수
* **startGame**
* **result** (결과 출력)

#### Car (Object)
* Name
* Position
* **move**
  * 규칙 (interface) 선언
* **객체 출력**

#### Name
* 이름
* **validation**

#### Position
* 위치
* **validation**
* **위치값 변경**