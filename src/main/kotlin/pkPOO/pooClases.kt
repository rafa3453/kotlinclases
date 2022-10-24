package pkPOO
import pkInterface.InterfacePersona

class IEmpleados (var _nombre:String, override var tipoPersona: String):InterfacePersona {
    var _salario:Float?=0f
        set(value) {
            if (value != null) {
                if (value < 0f) field = 0f else field =value
            }
        }
    override fun imprimirDatos() = println("Empleado ${_nombre.uppercase()} y un salario de $_salario")
    override fun saludar()=
        println("Hola, ${tipoPersona()} ${_nombre.uppercase()}")
}
class IAlumnos (var _nombre:String, override var tipoPersona: String):InterfacePersona {
    init {
        _nombre.uppercase()
    }
    override fun imprimirDatos() = println("Estudiante ${_nombre.uppercase()}")
    override fun saludar() = println("Hola,  ${tipoPersona()} ${_nombre.uppercase()}")
    override fun tipoPersona(): String = "Alumno de Tame"

}