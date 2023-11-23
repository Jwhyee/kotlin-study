package design.factory.factory

import design.factory.payment.Payment
import design.factory.payment.PaymentType

abstract class AbstractFactory {
    abstract fun getPayment(type: PaymentType): Payment
}