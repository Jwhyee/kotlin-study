package design.factory

import design.factory.factory.PaymentFactory
import design.factory.payment.PaymentType
import design.factory.payment.PaymentType.*

val dto = PaymentDto(PAYCO)
fun main() {
    val payment = PaymentFactory.getPayment(dto.type)

    println("payment = ${payment.javaClass.simpleName}")
}

class PaymentDto (val type: PaymentType)