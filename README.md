# Project GB PokéTeam

## 개요

포켓몬 대전 팀 구성 추천 API인 GB PokéTeam API와 이를 사용하는  웹 서비스를 개발하기 위한 내용을 다룹니다.

## GB PokéTeam

## 무엇에 쓰는 물건인가?

### 포켓몬스터?

포켓몬스터라는 아주 유명한 게임이 있습니다.

![https://godbell.kr/content/images/2023/03/image-2.png](https://godbell.kr/content/images/2023/03/image-2.png)

모험을 떠난 주인공과 함께하는, 포켓몬이라는 신비한 생물들을 싸움도 붙여 보고 싸움도 붙여 보고 싸움도 붙여 보는... 그런 게임입니다. 모든 게임 통틀어 브랜드 가치 부동의 1위를 지키고 있는 대단한 게임이기도 합니다. 애들 게임 아니냐구요?

![https://godbell.kr/content/images/2023/03/image.png](https://godbell.kr/content/images/2023/03/image.png)

깊게 들어가면 또 그렇지는 않습니다...

### 대체 왜 저렇게 복잡한 거죠?

배틀 컨텐츠를 이해할 필요가 있습니다.기본적으로는 18개의 타입 중 최대 두 타입, 4개의 기술을 가진 포켓몬 6마리로 싸우는 턴제 전략 게임입니다. 게임의 이야기만 혼자 즐길 때는, 이 정도만 알고 플레이해도 전혀 문제 없습니다. 하지만, 다른 사람들과 배틀하여 이기고 싶다면, 신경써야 할 것이 확 늘어납니다.

- 포켓몬의 선택과 육성

    최신작인 포켓몬스터 스칼렛 & 바이올렛 기준, 현재 1,000여 종의 포켓몬이 있습니다. 이 수많은 포켓몬 중, 어떤 포켓몬을 사용할지 선택합니다. 주로 쓰이는 포켓몬과 강점과 약점을 알아야 합니다.게다가, 같은 포켓몬이라도 성격, 특성, 육성 방법에 따라 성능과 활용법이 다릅니다. 어떤 형태로 포켓몬을 키울지 결정해야 합니다.
- 기술 배치

    포켓몬은 총 4개의 기술을 사용할 수 있으며, 현재는 총 915개의 기술이 있습니다. 이 중 어떤 포켓몬이 어떤 기술을 배울 수 있으며, 어떤 기술을 잘 쓰는지 알아야 합니다. 거기에 포켓몬과 기술의 타입 상성과 위력 계산 등등 알아야 할 것이 많습니다.
- 팀 구성

    배틀 한 번에 총 6마리의 포켓몬을 데리고 갈 수 있으며, 메이저한 대전 방식에 따라 싱글 배틀에서는 3마리, 더블 배틀에서는 4마리의 포켓몬이 참가합니다. 한 포켓몬이 모든 것을 할 수는 없기 때문에, 더블 배틀은 물론이고 싱글 배틀에서도 팀 구성은 중요합니다. 대표적인 팀 조합만 해도 날씨팟, 에이스 위주, 사이클팟 등 포켓몬의 수처럼 다양합니다.

### 그래서 GB PokéTeam을 만듭니다

실제로, 포켓몬스터의 대전 컨텐츠는 매우 어렵습니다. 그렇기 때문에, 새로 입문한 유저가 성장하기 위해서는 많은 지식이 필요합니다. 하지만 이 게임 시리즈, 나아지고는 있지만 아직 입문자에게는 한없이 불친절합니다. 이러한 지식을 더욱 알기 쉽게 하기 위한 도구가 필요한 시점입니다.

그래서, **팀 구성**을 위한 **포켓몬의 선택과 육성**, **기술 배치** 고민을 해결해 줄 수 있는 GB PokéTeam을 만듭니다. 더불어, 숙련자를 보고 배울 수 있도록 정보 공유 기능도 함께 개발하려고 합니다.

## 핵심 기능

### Work In Progress

**PokéDex**
포켓몬 상세 검색 도구. [PokéAPI](https://pokeapi.co/docs/v2)를 활용합니다.

- 특성, 종족값, 배우는 기술
- 필터: 역할군, 능력치 등

**Team Builder**
배틀 팀 구성 도구. 특정 포켓몬이 수행 가능한 역할을 정하고,

- 포켓몬 팀 유형 목록
- 팀 유형별, 역할군별 추천 포켓몬과 형태, 기술배치 등 정보 제공

**PokéTeam Share**

- 계정별 조합 저장
- 조합 공유 및 즐겨찾기, 좋아요

### Sometime

- 테라스탈 등 배틀 기믹 적용
- 배틀 통계를 활용한
- 대미지 계산기
- 특전 기술 포함

## Docs

[https://api.godbell.kr](https://api.godbell.kr)
