# 형변환과 배열

## 형변환

하나의 변수에 지정된 자료형을 호환되는 다른 자료형으로 변경하는 기능을 의미한다.

기본 자료형은 자료형 간의 형변환을 지원하기 위해 `toType()`의 형변환 함수를 제공한다.

```
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
toChar()
```

자바의 경우 아래와 같이 간단하게 **암시적 형변환**이 가능하다.

> 암시적 형변환이란, 변수를 할당할 시 자료형을 지정하지 않아도 자동으로 형변환이 된다.

```java
public class Main {
    public static void main(String[] args) {
        int a = 54321;
        long b = a;
        System.out.println("b = " + b);
    }
}
```

하지만 코틀린의 경우에는 아래와 같이 코드를 작성하면 `Type mismatch` 에러가 발생한다

```kotlin
fun main(args: Array<String>) {
    var a: Int = 54321
    var b: Long = a
    println("b = ${b}")
}
```

```
Type mismatch: inferred type is Int but Long was expected
```

코틀린은 다른 언어에서 지원하는 **암시적 형변환**을 지원하지 않기 때문에 반드시 `toType()` 함수를 호출하여 **명시적 형변환**을 해주어야 한다.

> 명시적 형변환이란, 변환될 자료형을 개발자가 직접 지정하는 것을 의미

```kotlin
fun main(args: Array<String>) {
    var a: Int = 54321

    var b: Long = a.toLong()

    println("b = ${b}")
}
```

## 배열

배열은 내부적으로 제네릭을 사용해 `Array<T>`로 선언이 가능하다.

배열을 만들기 위해서는 `arrayOf()` 메소드를 사용해 값들을 나열하면 되며,
특정한 크기의 공간을 가지는 비어있는 배열을 만드려면 `arrayOfNulls()` 메소드에 크기를 지정해주면 된다.

```kotlin
fun main(args: Array<String>) {
    var intArr = arrayOf(1, 2, 3, 4)
    
    var nullArr = arrayOfNulls<Int>(5)
}
```

배열에 값을 할당하거나 사용하기 위해서는 다른 언어들과 같이 배열의 이름과 대괄호에 `index`를 넣어서 사용하면 된다.

```kotlin
fun main(args: Array<String>) {
    var intArr = arrayOf(1, 2, 3, 4, 5)
    intArr[2] = 8
    println(intArr[2])
}
```
