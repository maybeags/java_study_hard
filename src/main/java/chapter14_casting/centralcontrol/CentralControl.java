package chapter14_casting.centralcontrol;

public class CentralControl {
    // field 선언
    private Power[] deviceArray;
    // 필드를 배열로 선언한 경우가 처음이기 때문에 주목해서 보겠습니다.


    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 전자 제품들을 CentralControl의 객체의 필드인 배열에 집어넣는 메서드
    public void addDevice(Power device) {
        // 왜 Computer / LED / Speaker가 아니라 상위 클래스인 Power인지를 생각해볼 필요가 있다.

        int emptyIndex = checkEmpty();  // 이 메서드의 return 값의 자료형은? -> int
        // 현재 빨간줄 뜨는거 정상 -> checkEmpty라는 메서드를 저희가
        // 정의한적이 없기 때문에.
        // 개발 환경 상에서는 만들다보면 추가적으로 메서드 구현이 필요한 경우가 있습니다.
        // 그래서 checkEmpty()를 먼저 정의하고 addDevice()구현할 수도 있겠지만
        // 일부러 좀 순서를 꼬아서 작성한 사례를 남기고자 합니다.
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        // 객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력되는 getter
        // 객체명.getClass().getSimpleName() -> 패키지명을 제거한 클래스명만 출력 -> getter 응용
    }

    public int checkEmpty() {   // 비어있는 배열의 index 넘버를 반환하도록 하는 메서드 정의

        // 배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스를 리턴할 예정
        //인덱스 넘버를 뽑아내야 하기 때문에 향상된 for문으로는 좀 어렵습니다.
        for (int i = 0 ; i < deviceArray.length ; i++) {
            if(deviceArray[i] == null ) {
                return i;
            }
        }
        return -1;
        // 자바의 인덱스 넘버에는 음수값이 없기 때문에(python에서는 마이너스인덱스 개념이 있습니다),
        // 실패를 나타낼 때 -1을 쓰는 경우가 많습니다. 하지만 0과 너무 가까운 수이다 보니 - 100이라든지
        // 아예 return값으로 나올 수 없을만한 음수로 정의하는 경우도 있습니다.
    }

    // 이상의 코드 라인들은 Power의 implements를 받은 클래스의 객체들을 배열에 집어넣는 과정입니다.
    // 왜 집어넣는가 하니까 -> 배열 내를 반복문 돌려 각 Power[]의 서브 객체들의 공통된 overriding된
    // 메서드들을 전부 한 번에 실행시키기 위하여.

    public void powerOn() {
        // 배열 내부에 있는 요소들(객체들 -> Power의 서브 클래스들의 인스턴스)의 공통적인 메서드(오버라이딩된 메서드들)인
        // .on()을 실행시킬 예정입니다.

        // 해당 경우에 생겨날 수 있는 문제점 :
        //  배열의 특정 인덱스 내에 아무런 객체가 없는 상황이라면 .on()을 실행시켰을 때,
        // 컴파일링 에러가 발생할 확률이 있으므로, 이를 고려한 로직을 작성해야만 할 것입니다.
    }
}
