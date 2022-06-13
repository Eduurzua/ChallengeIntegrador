data class Parking(val vehicles: MutableSet<Vehicle>){

    fun addVehicle(vehicle: Vehicle) : Boolean {
        return if (vehicles.size < MAXIMUN) {
            vehicles.add(vehicle)
        //    println("se agrego auto ${vehicle.plate} ${vehicles.size} ")
            println("Welcome to AlkeParking!")
            true
        }else{
         //   println("No se agrego auto ${vehicle.plate} ${vehicles.size} ")
            println("Sorry, the check-in failed")
            false
        }
    }
}