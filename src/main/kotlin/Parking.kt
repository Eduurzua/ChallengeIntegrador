data class Parking(val vehicles : MutableSet<Vehicle>){

    open fun addVehicle(vehicle: Vehicle) : Boolean {
        return this.vehicles.size <= MAXIMUN
    }
}