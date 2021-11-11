# 로또

## 기능 목록
- LottoController
  - Lotto 를 생성한다.
  - 로또 추첨을 진행한다.
- InputView
  - 구입금액을 입력 받는다.
  - 지난 주 당첨 번호를 입력 받는다.
- ResultView
  - 자동 생성된 번호를 출력한다.
  - 당첨 통계를 출력한다.
- Generator
  - RandomGenerator
    - 1 ~ 45, 6자리 로또 티켓 숫자를 랜덤으로 생성한다.
- Domain
  - Lotto
    - 로또 추첨을 관리한다.
  - Ticket
    - 로또 번호를 저장한다.
    - 당첨 로또 번호와 저장된 로또 번호를 비교한다.
  - Tickets
    - Ticket 일급 컬렉션
    - 로또 번호들을 저장한다.
  - Statistics
    - 티켓번호들의 각 등수별 당첨수를 계산한다. 
    - 수익률을 계산한다.
  - Rank
    - 등수에 따른 로또 당첨 갯수, 금액을 관리한다.
    - 당첨 갯수를 전달 받아 Rank 로 변환한다.