# 인터넷은 어떻게 동작하는가?

> 웹 기술 인프라의 기초와 인터넷과 웹의 차이점에 대해 알아보자

## 요약

- 인터넷의 기본 : 컴퓨터들은 서로 통신가능한 거대한 네트워크다.

## 깊게 들어가기

### 단순한 네트워크

- 두 개의 컴퓨터가 통신이 필요할때. 물리적(이더넷 케이블) 혹은 무선으로(wifi, bluetooth) 연결되어야 한다. 모든 현대 컴퓨터들은 이 방법중 하나를 이용해 연결을 지속할 수 있다.
  ![network](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/internet-schema-1.png)

- 네트워크는 두 대의 컴퓨터로 제한되지 않으며, 여러 대를 연결할 수 있다. 그러나 이렇게 연결할수록 복잡해진다. 10대의 컴퓨터를 연결하려는 경우에는 컴퓨터당 9개의 플러그가 달린 45개의 케이블이 필요한 셈이다.
  ![multiple_computers](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/internet-schema-2.png)

- 이러한 문제를 해결하기 위해 네트워크의 각 컴퓨터는 '라우터'라고 하는 특수한 소형 컴퓨터에 연결이 된다. 라우터는 단 하나의 작업만을 하는데 주어진 컴퓨터에서 보낸 메세지가 올바른 대상 컴퓨터에 도착하는지 확인한다. 컴퓨터 B에서 메세지를 보내려면, 컴퓨터 A가 메세지를 라우터로 보내야 하며 라우터는 컴퓨터 B로 메세지를 전달하되, 컴퓨터 C로 배달되지 않도록 한다.
  <br>

- 라우터를 시스템에 추가하면 10대의 컴퓨터 네트워크에는 10개의 케이블만 필요하다. 각 컴퓨터마다 단일 플러그와, 10개의 플러그가 있는 하나의 라우터만 필요한 셈이다.
  ![router_networking](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/internet-schema-3.png)

> 그러나 수백, 수천, 수십억대의 컴퓨터를 연결하려면 어떻게 해야할까?

### 네트워크 속의 네트워크

- 앞서 라우터는 크게 확장할 수는 없지만, 다른 컴퓨터와 마찬가지로 소형 컴퓨터다. 그렇다면 두대의 라우터를 연결하는것도 가능하다.
  ![connect_routers](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/internet-schema-4.png)
- 컴퓨터에 라우터를 연결하고, 라우터에서 라우터로 무한히 확장이 가능하다.
  ![extended_router_networking](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/internet-schema-5.png)

* 이러한 네트워크는 인터넷이라고 부르는 것에 가깝지만, 집과 다른 지역 사이에서는 케이블을 연결할 수 없다는 사실을 알게된다. 아주 먼 곳에 케이블을 연결할 수는 없다. 어떻게 처리할 수 있을까?
* 예를들어, 전력 및 전화처럼 집에 이미 연결된 케이블이 있다면 전화기 기반의 시설은 이미 세계 어느 곳과도 연결 되어있으므로 완벽한 배선이라 할 수 있다. 따라서 우리의 네트워크를 전화 시설과 연결하기 위해서는 모뎀이라는 특수한 장비가 필요 하다. 모뎀은 네트워크의 정보를 전화시설에서 처리할 수 있는 정보로 바꾸며, 그 반대의 경우도 마찬가지다.
  ![modem](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/internet-schema-6.png)

* 우리의 네트워크는 전화시설에 연결된다. 다음 단계는 우리의 네트워크에서 다른 네트워크로 메세지를 보내는 것이다. 그렇게 하기 위해 네트워크를 인터넷 서비스 제공업체(Internet Service Provider, ISP)에 연결한다. ISP는 모두함께 연결되는 특수한 몇몇의 라우터를 관리하고, 다른 ISP의 라우터에도 액세스 할 수 있는 회사다. 따라서 우리 네트워크의 메세지는 ISP 네트워크의 네트워크를 통해 다른 네트워크로 전달된다. 인터넷은 이러한 전체 네트워크 인프라로 구성된다.
  ![ISP](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/internet-schema-7.png)

### 컴퓨터 찾기

- 컴퓨터에 메세지를 보내려면? 메세지를 받을 특정 컴퓨터를 지정해야한다. 따라서 네트워크에 연결된 모든 컴퓨터에는 IP 주소(Internet Protocol) 라는 고유한 주소가 있다. 주소는 점으로 구분된 네개의 숫자로 구성된 주소다.

- 하지만 IP 주소를 기억하기 어렵기 때문에, 우리는 '도메인 이름'을 지정한다.

  ![ip](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work/dns-ip.png)

## 출처

[[mdn web docs]\_How does the Internet work?](https://developer.mozilla.org/en-US/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work)
