일반적으로 작성했을 때는 다음과 같은 크기로 나옵니다.

# 이건 제목 크기입니다
## 제목 2 크기구요
### 제목 3크기입니다.

__이렇게 작성하면__ 볼드체가 적용되는 등

지금 사용하는 것은 markdown language라고 합니다.

.md 파일로 이루어진 것은 마크다운 문법을 적용하는
파일이라고 보면 됩니다.

1. ordered list
2. 엔터치면 2가 자동으로 생기지요
3. 새로 생겼는데
4. 이게 생기는게 불편하다면
5. 다시 한 번 엔터치면 list가 해제됩니다.

- unordered list
- 알아서 생깁니다.
  - 그리고 탭을 누르면 한 칸 더 들여쓰기가 됩니다.
    - 한번 더도 가능하고
      - 디폴트 형태로 표가 생깁니다.

1. 여기도
   2. 탭누르면 하나 들어가는데, 지금 여기는 숫자 2로 보이지만 미리보기로는 ii라고 나오는 것을
   3. 확인할 수 있지요.

그래서 google에서
markdown문법 혹은 노션 문법을 검색하시면
필요한 정보들을 얻을 수 있습니다.

이것을 github에서도 .md 파일을 

자동으로 읽어줍니다.

그래서 보통 github repository에서

해당 프로젝트에 대한 버전 설명(java17, gradle 등)

혹은 프로젝트에 대한 개요

등에 대한 설명을 할 때

README.md 형태로 작성을 해서 소개하는 편입니다.

저희는 실제로 프로젝트를 진행한 것이 아니기 때문에

git add . 로만 작성했지만 

추후 여러분들이 개인 프로젝트를 진행하실 때는

README를 활용하는 것도 좋은 방법입니다.

```java

int a = 1;
int b = 2;
System.out.println(a + b);

```

코드블록을 작성하는 방법도 가능한데

얘의 장점은

저희가 지금 class를 배운 이후부터

파일들을 넘나들면서 수업을 진행하는 중입니다.

그렇다보니까 한 눈에 코드를 읽는게 어려운 경우가

있는데 여기다가 코드블록들 다 모아놓고

한큐에 보는 방식으로 공부하기도 합니다.

-> 저는 객체지향을 배운 이후부터
좀 어려우면 여기다가 한꺼번에 정리했습니다.

깃허브에 새로 push를 할 때
코드 블럭이나 파일의 변화가 있어야지만
올릴 수 있습니다.

git add .
git commit -m "feat: 20250212 markdown lesson"
git push

chapter11_arrays package 생성
ArrayTest01.java 클래스 생성

git add .
git commit -m "feat : 20250213 array lesson"
git push

git add .
git commit -m "feat: 20250214 lotto game removing duplicated numbers"
git push

git add .
git commit -m "feat: 20250217 abstract class lesson started"
git push

git add .
git commit -m "feat: 20250218 interface lesson"
git push

git add .
git commit -m "feat: 20250219 casting started"
git push

git add .
git commit -m "feat: 20250220 Object Class"
git push

git add .
git commit -m "feat: 20250221 lombok installed"
git push

git add .
git commit -m "feat: 20250224 singleton done / builder pattern started"
git push

git add .
git commit -m "feat: 20250225 generic / wildcard / collections lesson"
git push