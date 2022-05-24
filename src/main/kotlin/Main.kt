import java.util.Calendar

const val MINUTES_IN_MILISECONDS = 60000
const val MAXIMUN = 20

data class ParkingSpace(var vehicle : Vehicle, val parkedTime : Long){
    

}

data class Parking(val vehicles : MutableSet<Vehicle>){
    fun addVehicle(vehicle: Vehicle) : Boolean {
        println(vehicles.count())
        return this.vehicles.size <= MAXIMUN
    }
}

data class Vehicle(val plate : String, val vehicleType: utils.VehicleType, var checkInTime : Long, val discountCard : String? = null ){
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }
    override fun hashCode(): Int = this.plate.hashCode()
}

fun main(){



    //val parkedTime = Calendar.getInstance().timeInMillis - checkInTime / MINUTES_IN_MILISECONDS



    val car = Vehicle(plate = "AA111AA", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_001")

    val moto = Vehicle(plate = "BB2222BB", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus = Vehicle(plate = "CC333CC", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus = Vehicle(plate = "DD444DD", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_002")

    val car2 = Vehicle(plate = "AA111A2", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_003")

    val moto2 = Vehicle(plate = "BB2222B2", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus2 = Vehicle(plate = "CC333C2", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus2 = Vehicle(plate = "DD444D2", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_002")

    val car3 = Vehicle(plate = "AA111A3", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_001")

    val moto3 = Vehicle(plate = "BB2222B3", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus3 = Vehicle(plate = "CC333C3", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus3 = Vehicle(plate = "DD444D3", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_002")

    val car4 = Vehicle(plate = "AA111A4", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_001")

    val moto4 = Vehicle(plate = "BB2222B4", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus4 = Vehicle(plate = "CC333C4", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus4 = Vehicle(plate = "DD444D4", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_002")
    val car5 = Vehicle(plate = "AA111A5", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_001")

    val moto5 = Vehicle(plate = "BB2222B5", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus5 = Vehicle(plate = "CC333C5", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus5 = Vehicle(plate = "DD444D5", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_002")
    val car6 = Vehicle(plate = "AA111A6", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_001")

    val moto6 = Vehicle(plate = "BB2222B6", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus6 = Vehicle(plate = "CC333C6", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus6 = Vehicle(plate = "DD444D6", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_002")

    val myArray = arrayListOf<Vehicle>(car,moto,minibus,bus,car2,moto2,minibus2,bus2,car3,moto3,minibus3,bus3,car4,moto4,minibus4,bus4
        ,car5,moto5,minibus5,bus5,car6)

    var contador : Int = 0
    for(vehicleSet in myArray){
       val vehicleParking = Parking(mutableSetOf(vehicleSet))
        contador++
        println(contador)
       //println(vehicleSet)
      //  println(vehicleParking.addVehicle(vehicleSet))
        if (vehicleParking.addVehicle(vehicleSet)) println("Welcome to AlkeParking!") else println("Sorry, the check-in failed")
    }



    /*val parking = Parking(mutableSetOf(car,moto,minibus,bus,car2,moto2,minibus2,bus2,car3,moto3,minibus3,bus3,car4,moto4,minibus4,bus4
        ,car5,moto5,minibus5,bus5,car6))





    println(parking.vehicles.count())
    //parking.vehicles.add(car)

    //parking.vehicles.remove(car)
    //println(parking.vehicles.count())


    //val parking = Parking(mutableSetOf(car,moto,bus,minibus),20)

   /* for(vehicle in parking.vehicles){
        println(parking.vehicles)
        println(parking.vehicles.count())

    }
*/
    /* parking.vehicles.forEach() {
         val vehicle = parking.vehicles
         println(vehicle)
         if (parking.addVehicle(vehicle)) {
             println("Welcome to AlkeParking!")
         } else {
             println("Sorry, the check-in failed")
         }
     }


    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))
    println(parking.vehicles.contains(car2))
    println(parking.vehicles.contains(moto2))
*/

    //val car10 = Vehicle(plate = "AA111AA", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
    //    "DISCOUNT_CARD_003")
    //val isCar10Inserted = parking.vehicles.add(car10)
    //println(isCar10Inserted)

    //println(parking)

*/



}
