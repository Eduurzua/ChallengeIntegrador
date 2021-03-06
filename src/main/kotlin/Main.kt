import java.util.Calendar

const val MINUTES_IN_MILISECONDS = 60000
const val MAXIMUN = 20
const val HORAS = 120
const val QUINCE = 15
const val CINCO = 5
const val DESCUENTO = 0.85

fun main(args: Array<String>){

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
    val car5 = Vehicle(plate = "AA111A5", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis ,
        "DISCOUNT_CARD_001")

    val moto5 = Vehicle(plate = "BB2222B5", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus5 = Vehicle(plate = "CC333C5", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus5 = Vehicle(plate = "DD444D5", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis - 12600000,
        "DISCOUNT_CARD_002")
    val car6 = Vehicle(plate = "AA111A6", vehicleType = utils.VehicleType.CAR,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_001")

    val moto6 = Vehicle(plate = "BB2222B6", vehicleType = utils.VehicleType.MOTOCYCLE,Calendar.getInstance().timeInMillis)

    val minibus6 = Vehicle(plate = "CC333C6", vehicleType = utils.VehicleType.MINIBUS,Calendar.getInstance().timeInMillis)

    val bus6 = Vehicle(plate = "DD444D6", vehicleType = utils.VehicleType.BUS,Calendar.getInstance().timeInMillis,
        "DISCOUNT_CARD_002")

    val myArray = arrayListOf<Vehicle>(car,moto,minibus,bus,car2,moto2,minibus2,bus2,car3,moto3,minibus3,bus3,car4,moto4,minibus4,bus4
        ,car5,moto5,minibus5,bus5,car6,moto6,minibus6,bus6)


    val parking = Parking(mutableSetOf())
    myArray.forEach { vehicleFor -> parking.addVehicle(vehicleFor)
    }

    val parkingSpace = ParkingSpace(bus5,parking).checkOutVehicle("DD444D5")

}






