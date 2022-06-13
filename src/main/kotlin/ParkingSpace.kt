import java.util.Calendar

data class ParkingSpace(var vehicle: Vehicle, var parking: Parking) {
    val parkedTime : Long = (Calendar.getInstance().timeInMillis - vehicle.checkInTime) / MINUTES_IN_MILISECONDS

    open fun checkOutVehicle(plate : String) {
        if ((vehicle.plate).contains(plate)) {
            var discount = vehicle.discountCard != null  //Revisar con profesor
            onSuccess(vehicle.vehicleType.fee,discount)
            parking.vehicles.remove(vehicle)
       //     println("cantidad actual  ${parking.vehicles.size}  ")
        } else {
            onError(plate)
        }
    }

    private fun onSuccess(amount : Int,hasDiscountCard : Boolean){
  //          println("onSucces   $amount")
  //          println("hora vehiculo ${vehicle.checkInTime}")
  //          println("hora actual ${Calendar.getInstance().timeInMillis}")

            if (parkedTime <= MAXIMUN){
                if(hasDiscountCard) {
                    val amountDes = amount.times(DESCUENTO).toString()
                    println("Su tiempo fue de $parkedTime minutos, Tu tarifa es ${amountDes} dolares por ser un ${vehicle.vehicleType}")
                }else{
                    println("Su tiempo fue de $parkedTime minutos, Tu tarifa es ${amount} dolares por ser un ${vehicle.vehicleType}")
                }
            }else calculateFee(amount,hasDiscountCard)
        }

    private fun calculateFee(amount : Int,hasDiscountCard : Boolean ) {
        var fee = (Math.ceil((parkedTime - HORAS) /QUINCE.toDouble()) * CINCO).toInt().plus(amount)
        if(hasDiscountCard) {
            val amount = Math.ceil(fee.times(DESCUENTO)).toInt()
            println("Your fee is $amount. Come back soon.")
        }else {
            println("Your fee is $fee. Come back soon.")
        }
    }
    private fun onError(plate : String){
       println("Sorry, the check-out failed")
  }
    }
