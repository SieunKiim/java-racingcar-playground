# Focused On

### 도메인 설계와 단위 테스트.
* 요구사항에 맞는 도메인 객체 추출
* 해당 도메인 내부 필요 기능들 열거 및 테스트 주도 개발.

### 하지만, 도메인 로직에서 테스트 하기 어려운 부분들이 해당 기능의 상위 구현체의 테스트를 어렵게함.
* 랜덤 및 기타 확률에 의한 동작이 예로 들 수 있음
* 위와 같은 상황에서 테스트를 애매하게 하는 로직의 격리를 통해 보완할 수 있음.