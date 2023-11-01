# 타입추론과 함수

## 타입추론

> 타입추론이란, 변수나 함수들을 선언할 때나 연산이 이루어질 때 자료형을 코드에 명시하지 않아도 코틀린이 자동으로 자료형을 추론해주는 기능

변수가 선언될 때 할당된 값의 형태로 해당 변수가 어떤 자료형을 가지는지 추론이 가능한 것이다.

기본 자료형들도 선언 시 값을 할당만 해준다면, 대부분 자료형을 명시할 필요가 없다.

```kotlin
fun main(args: Array<String>) {
    // Int
    var a = 1234
    // Long
    var b = 1234L

    // Double
    var c = 12.45
    // Float
    var d = 12.45f

    // 16진수 : Int
    var e = 0XABCD
    // 2진수 : Int
    var f = 0b0101010

    // Boolean
    var g = true
    // Char
    var h = 'c'
}
```

반드시 특정한 자료형으로 지정해야하는 상황이 아니라면, 대부분은 코틀린의 타입추론 기능을 이용햐여 코드 다이어트를 할 수 있다.

## 함수

함수는 특정한 동작을 하거나 원하는 결과값을 연산하는데 사용한다.

```kotlin
fun main(args: Array<String>) {
    println(add(1, 2, 3))
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
```

### 단일 표현식 함수(single-expression function)

변수에 결과값을 할당하듯 식을 할당하여 만들 수 있다.

```kotlin
fun main(args: Array<String>) {
    println(add(5, 6, 7))
}

fun add(a: Int, b: Int, c: Int) = a + b + c
```

단일 표현식 함수에서는 **반환형의 타입추론이 가능**하므로, 반환형을 생략할 수 있다.

코틀린의 함수는 내부적으로 기능을 가진 형태이지만, 외부에서 볼 때에는 파라미터를 넣는다는 점 외에는 자료형이 결정된 변수라는 개념으로 접근하는 것이 좋다.
그래야 이후에 나오는 **함수형 언어**라는 코틀린의 특성을 이해하기 쉽다.