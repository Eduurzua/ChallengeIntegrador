import java.util.Calendar

data class ParkingSpace(var vehicle: Vehicle, var parking: Parking) {
    val parkedTime : Long = (Calendar.getInstance().timeInMillis - vehicle.checkInTime) / MINUTES_IN_MILISECONDS

    open fun checkOutVehicle(plate : String) {
        if ((vehicle.plate).contains(plate)) {
            onSuccess(vehicle.vehicleType.fee)
            parking.vehicles.remove(vehicle)
            println("cantidad actual  ${parking.vehicles.size}  ")

        } else {
            onError(plate)
        }
    }

    private fun onSuccess(amount : Int){
            println("onSucces   $amount")
  //          println("hora vehiculo ${vehicle.checkInTime}")
  //          println("hora actual ${Calendar.getInstance().timeInMillis}")
            println("resultado $parkedTime")
            if (parkedTime <= MAXIMUN){
                println("Su tiempo fue de $parkedTime minutos, Tu tarifa es $amount dolares por ser un ${vehicle.vehicleType}")
            }else calculateFee()
        }

    private fun calculateFee() {
        println("en implementacion")
    }
    private fun onError(plate : String){
       println("Sorry, the plate $plate checkout failed ")
  }

    }
