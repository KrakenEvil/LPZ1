fun main(args: Array<String>) {
// Задание 1
    println("Задание 1")
    println("Введите сумму перевода:")
val amount = readln().toInt()
val kosiz: Int = 35
val proz = 0.75
var prof = (amount/100)*proz
if(prof < kosiz)
{
    println("комиссия:${kosiz} руб")
}
else {
    println("комиссия:${prof} руб")
}
    // Задание 2
    println("Задание 2")
    println("Введите число лайков:")
    val lik = readln().toInt()
    if (lik%10 !=  1)
    {
        println("Понравилось " + lik + " Людям")
    }
    else {
        println("Понравилось " + lik + " Человеку")
    }
    // Задание 3
    println("Задание 3")
    println("Введите сумму:")
    val  sum = readln().toDouble()
    println("Введите информацию - постоянный ли клиент? (выбор: true(да) или false(нет)):")
    val  pos = readln().toBoolean()
    var cost = 0
    var costproz = 0.0
    var costproz2 = 0.0
    if (sum<=1000)
    {
        println("${sum} руб")
    }
    if (1001<=sum && sum <=10000)
    {
        cost = 100
        println("${sum-cost} руб - скидка 100 руб")
    }
    if (sum >10000)
    {
       if (pos != true) {
           costproz = 0.05
           println("${sum - (sum * costproz)} руб - скидка ${costproz}")
       }
        else
       {
           costproz = 0.05
           costproz2 = 0.01
           var discount = sum-(sum * costproz)
           var discount2 = discount-(discount * costproz2)
           println("${discount2} руб - скидка 5% и 1% сверху")
       }
    }


}
