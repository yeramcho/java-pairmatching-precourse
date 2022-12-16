## 페어매칭관리 애플리케이션
### 프로그램
- [ ] 프로그램 시작
- [ ] 종료 선택할 때까지 반복 진행
- [ ] 기능
  - [ ] 페어 매칭 선택 시 매칭 기능 시작
  - [ ] 페어 조회 선택 시 조회 기능 시작
  - [ ] 페어 초기화 선택 시 페어 초기화
  - [ ] 종료 선택 시 프로그램 종료
- [ ] 예외 처리
  - [ ] 잘못된 값 입력 시 예외 처리
  - [ ] 올바른 값 입력할 때까지 반복 진행

### 사용자 입력
- [ ] 기능 선택
- [ ] 과정, 레벨, 미션 선택
  - [ ] 페어 매칭 시
  - [ ] 페어 조회 시
- [ ] 매칭 정보 있는 경우 재매칭 여부 선택

### 페어 매칭
- [ ] 크루 확인
  - [ ] 해당 과정 크루들의 이름을 파일 입출력을 통해 불러오기
  - [ ] 크루들의 이름 목록을 리스트에 저장
- [ ] 크루 목록의 순서를 랜덤으로 섞기
- [ ] 페어 매칭
  - [ ] 앞에서부터 순서대로 두명씩 페어 맺기
  - [ ] 홀수인 경우 마지막 남은 크루는 마지막 페어에 포함시키기
- [ ] 페어 중복 불가
  - [ ] 매칭된 각 페어가 같은 레벨에서 이미 페어로 만난적 있는지 확인
  - [ ] 중복 시 다시 랜덤으로 섞어서 매칭 시도
- [ ] 예외 처리
  - [ ] 3회 시도까지 매칭이 되지 않으면 에러 메시지 출력
  - [ ] 매칭을 할 수 있는 경우의 수가 없으면 에러 메시지 출력
- [ ] 매칭 완료
  - [ ] 매칭 완료 시 매칭 정보 저장

### 유효성 검사
- [ ] 기능 선택
  - [ ] 1, 2, 3, Q 중 하나만 가능
- [ ] 과정, 레벨, 미션 선택
  - [ ] "문자열, 문자열, 문자열" 형식
  - [ ] 존재하는 과정
  - [ ] 존재하는 레벨
  - [ ] 해당 레벨 안에 존재하는 미션
- [ ] 재매칭 여부 선택
  - [ ] 네, 아니오 중 하나만 가능

### 출력
- [ ] 기능 선택 요구 메시지
- [ ] 과정, 레벨, 미션 출력
- [ ] 과정, 레벨, 미션 선택 요구 메시지
- [ ] 페어 매칭 결과 출력
- [ ] 재매칭 여부 선택 메시지
- [ ] 초기화 완료 메시지