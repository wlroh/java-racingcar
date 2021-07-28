# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

### ToDo
new1. 경주할 자동차의 이름을 받는다.
new2. 자동차의 이름에서 자동차의 수를 추출 해낸다.
new3. prepareCars 메소드를 실행할 때 자동차의 이름도 같이 넣어준다.
new4. 출력해 주는 부분에서 자동차의 이름도 출력을 해준다.
    
## Done
1. 사용자 입력 받기
    2) 메세지 출력: 자동차 대수는 몇 대 인가요?
    3) 사용자 값 입력: 3 
       3-1) 값의 범위를 벗어나는 값을 입력할 경우 에러메세지와 함께 재입력을 받음.
    4) 메세지 출력: 시도할 회수는 몇 회 인가요?
    5) 사용자 값 입력: 5 
       5-1) 값의 범위를 벗어나는 값을 입력할 경우 에러메세지와 함께 재입력을 받음.
2. 로직 구현
    1) 주어진 자동차의 수 만큼 랜덤값을 뽑음. (랜덤 값의 범위는 0~9)
    2) 랜덤 값의 따라 1칸 전진 혹은 멈춤.
       2-1) 랜덤 값이 0~3 사이인 경우 멈춤.
       2-2) 랜덤 값이 4~9 사이인 경우 1칸 전진.
    3) 현재 자동차의 위치 상태를 표시
    4) 시도 회수 -= 1
       4-1) 시도 회수가 0일 경우 다음 단계로 이동.
       4-2) 시도 회수가 1이상 일 경우 로직 1단계로 이동.
    5) 메세지 출력: 프로그램을 종료합니다.

