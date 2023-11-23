package design.factory.factory

import design.factory.payment.*
import design.factory.payment.PaymentType.*

object PaymentFactory : AbstractFactory() {
    override fun getPayment(type: PaymentType): Payment = when (type) {
        KAKAO -> KakaoPayment
        PAYCO -> PaycoPayment
        else -> CardPayment
    }
}