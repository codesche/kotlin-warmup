# Kotlin Warm-Up

Kotlin 문법과 실무 패턴을 익히기 위한 일일 연습 프로젝트.

## 학습 주제

### 기초 문법 (10/16 ~ 10/17)
- 문자열 처리, 조건문, 반복문
- 팩토리얼, 팰린드롬, 랜덤 숫자
- When 표현식, Triple 조건

### 컬렉션 (10/18 ~ 10/19)
- List, MutableList, Set, Map
- filter, map, groupBy, associate
- 람다식과 고차 함수

### 함수형 프로그래밍 (10/20 ~ 10/21)
- 람다식 활용
- Sequence 지연 연산
- distinctBy, sortedWith
- Try-with-resources (use)

### 실무 패턴 (10/22 ~ 10/23)
- DTO/Entity 매핑
- 파라미터 파싱
- Java Time API
- File I/O
- 코루틴 비동기 처리
- LRU Cache 구현
- 메모이제이션

### 알고리즘 최적화 (10/23)
- 투 포인터 (Two Pointer)
- 재귀 최적화
- 캐싱 전략

### 아키텍처 & 디자인 패턴 (10/24)
- Clean Architecture (UseCase, Repository)
- Decorator Pattern
- Sealed Class를 활용한 Result 타입

### 가장 많이 등장한 단어 찾기 (10/25)
- groupingBy + eachCount()로 빈도 계산
- maxWith 또는 sortedWith로 조건 정렬

### 가장 자주 등장한 단어 Top N 출력하기 (10/26)

| 개념                               | 설명                    |
| -------------------------------- | --------------------- |
| `groupingBy` + `eachCount()`     | Kotlin의 대표적인 빈도 계산 조합 |
| `compareByDescending` + `thenBy` | 다중 정렬 조건 설정           |
| `take(n)`                        | 상위 N개만 추출             |
| `entries`                        | Map → List로 변환해 정렬 가능 |

### 가장 많이 등장한 단어 찾기 (10/27)
- 문자열 리스트가 주어졌을 때, 가장 자주 등장한 단어를 상위 N개까지 찾아 출력
  - 대소문자는 구분하지 않는다.
  - 빈 문자열("")이나 공백만 있는 단어는 무시한다.
  - 빈도수가 같을 경우 알파벳 순으로 정렬한다.

### 컬렉션 기본 연습 (10/28)

| 주제 | 핵심 개념 |
| --- | --- |
| 문자 개수 세기 | `lowercase()`, `isLetter()`, `getOrDefault()`, `toSortedMap()` |
| 리스트 필터링과 변환 | `filter { }`, `map { }`, `forEach { }` 체이닝 |
| 문자열 분리와 인덱스 활용 | `trim()`, `split()`, `mapIndexed { index, value -> }` |
