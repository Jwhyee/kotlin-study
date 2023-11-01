# 변수와 자료형

변수는 두 가지로 구분된다.

- Property : 클래스에 선언된 변수
- Local Variable : Scope 내에 선언된 변수(지역 변수)

기존 언어들과 달리 코틀린에서는 두가지 타입으로 변수를 선언할 수 있다.

- var : 언제든지 읽기, 쓰기가 가능
- val : 선언 시에만 초기화 가능하며, 중간에 값을 변경할 수 없음(final)

## 값 초기화

변수 선언은 아래 형식과 같이 작성하면 된다.

```kotlin
var varName: Type
```

자바와는 다르게 한 구문 뒤에 세미콜론(;)을 붙이지 않아도 알아서 구문의 끝을 확인해준다.
또한, 타 언어들과 다르게 초기화 되지 않으면 컴파일 되지 않는다.

```java
public class Main {
    static int a;
    static Main m;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(m);
    }
}
```

자바에서 위 코드와 같이 작성을 하고, 실행하면 `0`과 `null`이라는 값이 출력된다.
하지만, 코틀린에서 아래와 같이 작성하면 컴파일 에러가 발생한다.

```kotlin
fun main(args: Array<String>) {
    var a: Int
    println(a)
}
```

```bash
Variable 'a' must be initialized
```

코틀린은 기본 변수에서 `null`을 허용하지 않으며, 변수에 값을 할당하지 않은채로 사용하게 되면 **문법 에러**로 띄워주고 컴파일을 막아준다.
덕분에 의도치 않은 동작이나 `Null Pointer Exception` 등을 원천적으로 차단해준다.

## null

프로그램에 따라 변수에 값이 할당되지 않았다는 것을 하나의 정보로 사용할 때가 있다.
이런 경우에는 변수 선언시 자료형 뒤에 `?`를 붙이면 `nullable` 변수로 선언해 줄 수 있다.

```kotlin
fun main(args: Array<String>) {
    var a: Int? = null

    println(a)
}
```

> `nullable` 변수는 `null`인 상태로 연산할 시 `NPE`가 발생할 수 있으므로 꼭 필요한 경우에만 한해 사용해야 한다. 

이외에도 변수의 초기화를 늦추는 `lateinit`이나 `lazy` 속성도 있다.

## 자료형

코틀린의 자료형은 자바와 거의 동일하다.

| 구분  |  자료형   |  바이트  |  비트   |
|:---:|:------:|:-----:|:-----:|
| 정수형 |  Byte  | 1Byte | 8Bit  |
|  "  | Short  | 2Byte | 16Bit |
|  "  |  Int   | 4Byte | 32Bit |
|  "  |  Long  | 8Byte | 64Bit |
| 실수형 | Float  | 4Byte | 32Bit |
|  "  | Double | 4Byte | 64Bit |

### 정수형

정수형 값을 표기할 때에는 10진수, 16진수, 2진수로 표기할 수 있으며, 8진수의 표기는 지원하지 않는다.
자바와 동일하게 `Long`일 때는 `L` 리터럴을 사용한다.

```kotlin
fun main(args: Array<String>) {
    var intValue:Int = 1234
    var longValue:Long = 1234L
    // x는 hexadecimal의 약어
    var intValueHex:Int = 0x1af
    // b는 binary의 약어
    var intValueByBin:Int = 0b10110110

    println("intValue = ${intValue}")
    println("longValue = ${longValue}")
    println("intValueHex = ${intValueHex}")
    println("intValueByBin = ${intValueByBin}")
}
```

### 실수형

`Float`의 경우 `F` 혹은 `f`를 붙여 4바이트로 표기한다.

```kotlin
fun main(args: Array<String>) {
    var doubleValue:Double = 123.5
    // e는 exponential의 약어
    var doubleValueWithExp:Double = 123.5e10
    var floatValue:Float = 123.5f

    println("doubleValue = ${doubleValue}")
    println("doubleValueWithExp = ${doubleValueWithExp}")
    println("floatValue = ${floatValue}")
}
```

### 문자형

코틀린은 문자열을 내부적으로 유니코드 인코딩 중에 한 방식인 `UTF-16 BE`로 관리한다.
따라서 글자 하나하나가 `2Byte(16Bit)`의 메모리 공간을 사용하게 된다.

```kotlin
fun main(args: Array<String>) {
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'

    println("charValue = ${charValue}")
    println("koreanCharValue = ${koreanCharValue}")
}
```

### 문자열

큰 따옴표 내부에 문자열을 작성하면 된다.
여러 줄의 문자열을 작성할 경우 `Text Block`을 사용한다.

```kotlin
fun main(args: Array<String>) {
    val stringValue = "one line string test"
    val multiLineStringValue = """
        multiline
        string
        test
    """

    println("stringValue = ${stringValue}")
    println("multiLineStringValue = ${multiLineStringValue}")
}
```

### Boolean

true, false 중에 하나로 저장할 수 있다.

```kotlin
fun main(args: Array<String>) {
    var booleanValue:Boolean = true
    println("booleanValue = ${booleanValue}")
}
```